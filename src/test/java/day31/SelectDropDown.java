package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountry = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpdwn = new Select(drpcountry);
		
		//selecting option from drop downs
		
		//drpdwn.selectByVisibleText("France");    //visible text - text which can be seen in the drop down or inner text of an element in html DOM
		//drpdwn.selectByValue("usa");     //value - it is value attribute in html DOM it may or may not be same as inner text
		//drpdwn.selectByIndex(3);         //index always starts from 0
		
		//capturing options from the drop down
		
		List<WebElement>options = drpdwn.getOptions();   //to capture all the drop down elements in a list
		System.out.println("number of drop down elements : "+options.size());
		
		//printing drop down elements using classic for loop
		
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		//printing drop down elements using for each loop
		
		for(WebElement option : options)
		{
			System.out.println(option.getText());
		}
		

	}

}
