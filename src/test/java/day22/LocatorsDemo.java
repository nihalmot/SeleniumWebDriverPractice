package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayedStatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayedStatus);
		
		//LinkText and PartialLinkText
		//driver.findElement(By.linkText("iPhone")).click();
		//driver.findElement(By.partialLinkText("ipho")).click();
		
		//classname
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("total number of header links are : "+headerLinks.size());
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());

	}

}
