package testngExecutionOrder;

import org.testng.annotations.*;

public class TestcaseDependency {
	@Test
	public void num() {
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	@Test(dependsOnMethods = "zdd")
	public void ulti() {
		
		int x = 2;
		int y = 3;
		System.out.println(x*y);
	}
	@Test(dependsOnMethods = "num")
	public void zdd() {
		
		int x = 5;
		int y = 3;
		System.out.println(x+y);
	}
		
	
}
//output [RemoteTestNG] detected TestNG version 7.4.0
/*30
8
6
PASSED: ulti
PASSED: num
PASSED: zdd*/	
