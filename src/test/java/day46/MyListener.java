package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//creating our own listener class by using ITestListener interface

public class MyListener implements ITestListener
{

	public void onStart(ITestContext context) {
	    System.out.println("Test execution is started....");   //it executes only once before stating all the test methods
	  }
	
	
	public void onTestStart(ITestResult result) {
	    System.out.println("test started....");    //it will execute before starting of every test methods
	  }

	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("test passed.....");   //it will execute automatically if test is passed
	  }

	
	public void onTestFailure(ITestResult result) {
	    System.out.println("test failed....");   //it will execute automatically if test is failed
	  }
	
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("test skiped....");   //it will execute automatically if test is skipped
	  }

	
	public void onFinish(ITestContext context) {
	    System.out.println("test execution is completed....");   //it will execute once all tests are finished
	  }
	
	
	
	
	
	
}
