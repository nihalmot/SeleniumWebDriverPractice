package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * 1) Login ---> @BeforeClass
 * 2) Search ---> @Test
 * 3) Advanced Search ---> @Test
 * 6) Logout ---> @AfterClass
 */



public class AnnotationsDemo2 
{

	@BeforeClass
	void login()
	{
		System.out.println("This is Login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is Search...");
	}
	
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("This is Advanced Search...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is Logout....");
	}
	
	
}
