package testngExecutionOrder;

import org.testng.annotations.*;

public class TestNGPriorities {
	@Test(priority = 0)
	public void testexecution1() {
		System.out.println("Priority set to 0 executes first");
	}
	@Test(priority = 1)
	public void testexecution2() {
		
		System.out.println("Priority set to 1 exectutes second");
	}
	
	@Test(priority = 5)
	public void testexecutionfinal() {
		
		System.out.println("Priority set to 5 executes last");
	}
	
	

}
