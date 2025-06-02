package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	static void selectMonthAndYear(WebDriver driver,String month,String year)
	{
		//selecting month and year
		
		while(true)
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();    //actual month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();      //actual year
			
			if(currentMonth.equals(month)&&currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}
	
	static void selectDate(WebDriver driver,String day)
	{
		//selecting the date
		
				List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
				for(WebElement dt : allDates)
				{
					if(dt.getText().equals(day))
					{
						dt.click();
						break;
					}
				}
	}
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switching to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//Method 1 using send keys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/01/2025");   //mm//dd//yyyy
		
		//Method 2 using date picker
		//expected date
		String year = "2027";
		String month = "May";
		String day = "20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();    //opening date picker
		
		selectMonthAndYear(driver,month,year);       //selecting month and year
		
		selectDate(driver,day);       //selecting day
		
		
		

	}

}
