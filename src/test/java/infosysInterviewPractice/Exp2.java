package infosysInterviewPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-main']//ul//li"));
		
		System.out.println("total number of elements displayed : "+links.size());

	}

}
