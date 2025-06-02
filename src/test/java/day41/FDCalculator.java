package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		//capturing location of the excel file
		String filePath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		//getting row count in a excel sheet
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		//reading data from excel sheet
		for(int i=1;i<=rows;i++)
		{
			//1) read all the data from excel
			String principle = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateofinterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String period1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String period2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String frequency = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_maturity_value = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			//2) pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select period_drpdwn = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			period_drpdwn.selectByVisibleText(period2);
			
			Select frequency_drpdwn = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frequency_drpdwn.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//3) validation
			
			String actual_maturity_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_maturity_value) == Double.parseDouble(actual_maturity_value))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}

		driver.quit();
	}

}
