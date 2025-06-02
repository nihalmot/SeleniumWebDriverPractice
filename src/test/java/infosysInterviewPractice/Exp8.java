package infosysInterviewPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp8 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.awwwards.com/academy-plan?utm_source=alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
		boolean status = driver.findElement(By.xpath("//div[contains(text(),'Monthly Subscription')]")).isDisplayed();
		System.out.println(status);
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'FAQs')]"))).click();
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'FAQs')]"));
		jse.executeScript("arguments[0].click();", element);
		
		WebElement ele1 = driver.findElement(By.xpath("//h3[contains(text(),'Jobs')]"));
		jse.executeScript("arguments[0].style.border='2px solid red'", ele1);
	}

}
