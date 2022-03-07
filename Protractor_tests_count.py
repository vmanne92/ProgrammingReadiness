import re
import sys

'''get_dashboard_count.py script will fetch the total tests executed, total tests failed
   integer values and print the values in desired format to display the values on jenkins dashboard.
   If no failure in tests, it converts the None type value to value 0'''


class UITestsCount:

    def __init__(self, filename):
        self.f = filename


class ReadLogFile(UITestsCount):

    def find_pattern(self):

        with open(self.f, 'r') as f:
            self.fr = (f.read())
            return self.fr


class SearchPattern(ReadLogFile):

    def search_total_tests(self):

        regex = re.search(r"[0-9]+ specs", self.find_pattern())
        total_tests_index1 = regex.group().split()
        return int(total_tests_index1[0])

    def search_failed_tests(self):

        regex = re.search(r"overall:\s[0-9]+", self.find_pattern())
        if regex is None:
            total_fail_tests = int(0)
            return total_fail_tests
        else:
            tests_group = (regex.group())
            total_fail_tests = tests_group.split()
            return int(total_fail_tests[1])

    def print_format(self):

        tests = self.search_total_tests()
        failed = self.search_failed_tests()
        passed = tests - failed
        if failed > 0:
            print(f"Tests:{tests} Passed:{passed} Failed:{failed}")
            sys.exit(1)
        else:
            print(f"Tests:{tests} Passed:{passed} Failed:{failed}")
            sys.exit(0)


FH = SearchPattern("protractor_pass_out.log")

FH.print_format()

