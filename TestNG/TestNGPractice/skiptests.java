package testngExecutionOrder;
import org.testng.SkipException;
import org.testng.annotations.*;

public class skiptests {
	// One way of skipping the test
	// This will completely disable the test from suite and does not reflect in report
	@Test(enabled = false)
	public void test1() {
	 
		String name = "vamsi";
		
		System.out.println("Length of name" + name.length());
				
	}
	@Test
    public void test2() {
    	
    	System.out.println("Executed test 1");
    }
	
	
    @Test
    public void getindex() {
    	
    	System.out.println("Final Test case");
    	// other way of skipping the tests
    	//This skip method will report the test in report
    	//Total tests run: 2, Passes: 1, Failures: 0, Skips: 1
    	throw new SkipException("Incomplete Tests");
    }
}
