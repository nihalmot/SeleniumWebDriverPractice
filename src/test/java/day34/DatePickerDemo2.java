package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input date
		
		String year = "2021";
		String month = "Jun";
		String day = "20";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		//selecting year
		
		WebElement yeardrpdwn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yrdrpdwn = new Select(yeardrpdwn);
		yrdrpdwn.selectByVisibleText(year);
		
		//selecting month
		
		WebElement monthdrpdwn = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select mnthdrpdwn = new Select(monthdrpdwn);
		mnthdrpdwn.selectByVisibleText(month);
		
		//selecting day
		
		List<WebElement> daypicker = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for(WebElement dp : daypicker)
		{
			if(dp.getText().equals(day))
			{
				dp.click();
				break;
			}
		}

	}

}
