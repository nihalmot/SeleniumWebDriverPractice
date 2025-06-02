package day26;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean status = logo.isDisplayed();
		System.out.println(status);
		
		//isEnabled
		WebElement sbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		boolean enstatus = sbox.isEnabled();
		System.out.println(enstatus);
		
		//isSelected
		WebElement mrbutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		mrbutton.click();
		System.out.println(mrbutton.isSelected());
		
		WebElement frbutton = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(frbutton.isSelected());
		

	}

}
