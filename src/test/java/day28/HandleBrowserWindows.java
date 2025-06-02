package day28;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		//Approach1 : converting set into list to access individual id's since set don't have get() method
		
		/*List<String> windowList = new ArrayList(windowIds);
		String parentId = windowList.get(0);
		String childId = windowList.get(1);
		
		//switching to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		//switching back to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());*/
		
		//Approach2 : by using for each loop
		
		for(String winId : windowIds)
		{
			String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
		

	}

}
