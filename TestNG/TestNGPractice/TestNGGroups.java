package testngExecutionOrder;

import org.testng.annotations.*;



public class TestNGGroups {
	
	public String sirname = "Manne";
	public String firstname = "Vamsi";
	@Test(groups = "sanity")
	public void getfullname() {
		
		System.out.println(firstname + sirname);
	}
	
	@Test(groups = "regression")
    public void getsirname() {
    	System.out.println(sirname);
    }
    
	@Test(groups = {"regression"})
    public void getfirstname() {
    	
    	System.out.println(firstname);
    }

}
