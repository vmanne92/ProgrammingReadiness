package testngExecutionOrder;

import org.testng.annotations.*;

public class ExecutionOrder {
	
@Test

public void test() {
	System.out.println("Its Test");
}
@BeforeSuite
public void Beforesuite() {
	System.out.println("Its Before Suite");
}
@AfterSuite
public void Aftersuite() {
	System.out.println("Its After Suite");
}
@AfterClass
public void Afterclass() {
	System.out.println("Its Afterclass");
}
@BeforeMethod
public void Beforemethod() {
	System.out.println("Its Before Method");
}
@AfterMethod
public void AfterMethod() {
	System.out.println("Its AfterMethod");
}
@BeforeClass
public void Beforeclass() {
	System.out.println("Its Before class");
}
@AfterTest
public void Aftertest() {
	System.out.println("Its After test");
}

}
