package day28;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String winId : windowIds)
		{
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}
		}
		

	}

}
