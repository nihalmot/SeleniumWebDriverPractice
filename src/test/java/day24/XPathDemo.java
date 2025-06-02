package day24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("xyz");
		
		//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("jsdhj");
		
		//xpath with and, or operator
		//driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("jdshfjfdkh");
		//driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search']")).sendKeys("jdshfjfdkh");
		
		//xpath with text() method  by using inner-text
		//driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
		
		boolean displayedStatus = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(displayedStatus);
		
		String value = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(value);

		
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("djhkjd");
		
		//xpath with   starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("djkhsfjg");
		
		//chained xpath
		boolean check = driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(check);
	}

}
