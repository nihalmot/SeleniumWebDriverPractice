package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{

	public ExtentSparkReporter sparkReporter;   //UI of the report
	public ExtentReports extent;   //populate common info on the report
	public ExtentTest test;   //creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context)
	{
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");   
		
		sparkReporter.config().setDocumentTitle("Automation Report");   //to set Title of the report
		sparkReporter.config().setReportName("Functional Testing");   //to set name of the report
		sparkReporter.config().setTheme(Theme.DARK);   //to set theme of the report
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);   //this statement will attach UI along with the populated information to the extent report
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Nihal");
		extent.setSystemInfo("os", "Windows11");
		extent.setSystemInfo("Browser Name", "chrome");
		
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());   //creating a new entry in the report
		test.log(Status.PASS, "Test case PASSED is : "+result.getName());   //updating status passed/failed/skipped
		
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is : "+result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is : "+result.getThrowable());
		
	}
	
	
	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is : "+result.getName());
		
	}
	
	
	public void onFinish(ITestResult result)
	{
		extent.flush();
	}
	
	
	
}
