package infosysFirstRound;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuiteDemo {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite : Initialize global setup");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite : Clean up global setup");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest : Connect to data base");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest : Disconnect from data base");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass : Launch Browser");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass : Close Browser");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod : Login before each test");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod : Logout after each test");
	}
	
	@Test(priority=1, groups = {"sanity","smoke","regression"})
	public void verifyLogin()
	{
		System.out.println("verify login : Sanity/Smoke test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, groups = {"regression"})
	public void verifyProfileUpdate()
	{
		System.out.println("verify profile update : Regression test");
		Assert.assertEquals("update", "update");
	}
	
	@Test(priority=3, groups = {"sanity","regression"})
	public void verifySearchFunctionality()
	{
		System.out.println("verify search functionality : Sanity/Regression test");
		Assert.assertNotNull("search result");
	}
	
	@Test(priority=4, groups = {"regression"}, dependsOnMethods = {"verifyLogin"})
	public void verifyLogout()
	{
		System.out.println("verify logout : Regression test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, enabled=false)
	public void disabledTest()
	{
		System.out.println("this test is disabled and will not run");
	}
	
	@Test(priority=6, groups = {"smoke"})
	public void verifyTitle()
	{
		System.out.println("verify title : smoke test");
		Assert.assertEquals("Home", "Home");
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
