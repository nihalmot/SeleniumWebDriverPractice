package day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id   tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		
		//tag class   tag.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		
		//tag attribute   tag[attribute]
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		
		//tag class attribute     tag.class[attribute]
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
	}

}
