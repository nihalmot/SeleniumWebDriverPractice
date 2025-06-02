package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("java");   //search box
		Thread.sleep(5000);
		
		List<WebElement>options = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']"));
		
		System.out.println(options.size());
		
		for(WebElement option : options)
		{
			String op = option.getText();
			if(op.equals("java"))
			{
				option.click();
				break;
			}
		}
	}

}
