package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//switching to new tab and opening new url
		
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://orangehrm.com/");*/
		
		//switching to new window and opening new url
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://orangehrm.com/");

	}

}
