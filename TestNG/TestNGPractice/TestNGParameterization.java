package testngExecutionOrder;

import org.testng.annotations.*;

public class TestNGParameterization {
	
	@Parameters("fname")
	@Test
	public void getfirstname(String fname) {
		
		System.out.println(fname);
		
	}
	
	@Test
	@Parameters("sname")
	public void getsirname(String sname) {
		
		System.out.println(sname);
		
	}
	
	@Test
	@Parameters({"fname","sname"})
	public void fillname(String fname, String sname) {
		
		System.out.println(fname + sname);
	}
	

}
