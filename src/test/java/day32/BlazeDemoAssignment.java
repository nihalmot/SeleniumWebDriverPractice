package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement depCity = driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement desCity = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select depDrpDwn = new Select(depCity);
		depDrpDwn.selectByVisibleText("Paris");
		
		Select desDrpDwn = new Select(desCity);
		desDrpDwn.selectByVisibleText("Rome");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//rows count
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tr"));
		
		//columns count
		List<WebElement> coln = driver.findElements(By.xpath("//table[@class='table']//tr[1]//td"));
		
		int arr[] = new int[rows.size()];
		for(int r=1;r<rows.size();r++)
		{
			String element = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			element = element.replaceFirst("$", "");
			arr[r-1] = Integer.parseInt(element);
		}
		
		for(int i =0;i<rows.size();i++)
		{
			System.out.println(arr[i]);
		}

	}

}
