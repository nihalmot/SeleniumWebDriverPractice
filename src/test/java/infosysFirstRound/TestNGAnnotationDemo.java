package infosysFirstRound;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {

	//runs before all the tests in the suite
	@BeforeSuite
	public static void beforeSuite()
	{
		System.out.println("this is before suite method");
	}
	
	//runs after all the tests in the suite
	@AfterSuite
	public static void afterSuite()
	{
		System.out.println("this is after suite method");
	}
	
	//runs before each test tag in xml file
	@BeforeTest
	public static void beforeTest()
	{
		System.out.println("this is before test method");
	}
	
	//runs after each test tag in xml file
	@AfterTest
	public static void afterTest()
	{
		System.out.println("this is after test method");
	}
	
	//runs only once before everything in this test class
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("this is before class method");
	}
	
	//runs only once after everything in this test class
	@AfterClass
	public static void afterClass()
	{
		System.out.println("this is after class method");
	}
	
	//runs before every test method
	@BeforeMethod
	public static void beforeMethod()
	{
		System.out.println("this is before method");
	}
	
	//runs after every test method
	@AfterMethod
	public static void afterMethod()
	{
		System.out.println("this is after method");
	}
	
	@Test(priority=1,enabled=true)
	public static void testLogin()
	{
		System.out.println("executing testLogin");
	}
	
	@Test(priority=2,enabled=true)
	public static void testHomePage()
	{
		System.out.println("executing testHomePage");
	}
	
	@Test(priority=3,dependsOnMethods="testLogin")
	public static void testLogout()
	{
		System.out.println("executing testLogout");
	}
	
	@Test(priority=4,enabled=true)
	public static void testDisabled()
	{
		System.out.println("executing testDisabled");
	}
	public static void main(String[] args) {
		
		testLogin();
		testHomePage();
		testLogout();
		testDisabled();

	}

}
