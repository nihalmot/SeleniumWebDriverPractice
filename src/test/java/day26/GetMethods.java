package day26;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getTitle() - returns the title of the web page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single browser window
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		
		//getWindowHandles() - returns ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>windowIds = driver.getWindowHandles();
		for(String id : windowIds) {
			System.out.println(id);
		}

	}

}
