package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//selecting single option from the drop down
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capturing all the options and finding out size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		
		//printing options from the drop down
		
		/*for(WebElement option : options)
		{
			System.out.println(option.getText());
		}*/
		
		//selecting multiple options from the drop down
		
		for(WebElement option : options)
		{
			String op = option.getText();
			if(op.equals("Java")||op.equals("Python")||op.equals("MySQL"))
			{
				option.click();
			}
		}
	}

}
