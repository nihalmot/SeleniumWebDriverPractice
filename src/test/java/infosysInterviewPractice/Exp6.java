package infosysInterviewPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp6 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		String mainwinhandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		
		Set<String> allwinhandles = driver.getWindowHandles();
		
		for(String handle:allwinhandles)
		{
			if(!handle.equals(mainwinhandle))
			{
				driver.switchTo().window(handle);
				String output = driver.findElement(By.xpath("//div[@class='brand greenLogo']//span")).getText();
				System.out.println(output);
				
				driver.close();
			}
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().window(mainwinhandle);
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys("potato");
		driver.findElement(By.xpath("//button[@class='search-button']")).click();
	}

}
