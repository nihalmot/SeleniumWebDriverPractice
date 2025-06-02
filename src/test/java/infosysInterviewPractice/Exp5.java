package infosysInterviewPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://bootstrap-vue.org/docs/components/dropdown/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='dropdown-1']")).click();
		
		List<WebElement> drpdown = driver.findElements(By.xpath("//div[@id='dropdown-1']//ul//li"));
		for(WebElement drp:drpdown)
		{
			if(drp.getText().contains("Second Action"))
			{
				drp.click();
				break;
			}
		}

	}

}
