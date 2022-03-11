package testngExecutionOrder;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssestionTestNG {
	@Test
	public void hardassertion() {
		System.out.println("Executing test with Hard assertion");
		// assert equals string
		assertEquals("Hello", "Hello");
		//assert boolean
		assertEquals(true, true);
		// assert boolean overide method with having message parameter
		assertEquals(false, true, "Expect assertion false");
		System.out.println("Since its a hard assertion ");
		
	}
	 @Test
	 public void softassertiontest() {
		
	   SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, true);
		sa.assertEquals("vamsi", "vam");
		System.out.println("softassertion executes all statements and stores the error at last");
		sa.assertAll();
	   
		
		
	}

}
