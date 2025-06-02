package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	//@Test
	void test_hardassertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		
		Assert.assertEquals(1, 2);   //hard assertion (here methods in Assert class are static so we don't need object to access them we can access them directly)
		
		System.out.println("testing....");
		System.out.println("testing....");
	}
	
	@Test
	void test_softassertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);   //soft assertion (here methods in SoftAssert class are not static so we need object to access them)
		
		System.out.println("testing....");
		System.out.println("testing....");
		
		sa.assertAll();   //mandatory to use this statement when we use soft assertion for validation
	}
	
	
}
