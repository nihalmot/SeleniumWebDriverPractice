package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int pagecount = driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
		System.out.println("Number of pages present"+pagecount);
		int rows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		
		for(int p=1;p<=pagecount;p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]")).click();
			}
			
			
			for(int r=1;r<rows;r++)
			{
				String Id = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[1]")).getText();
				String Name = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
				String Price = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
				WebElement Select = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[4]"));
				System.out.println(Id+"\t"+Name+"\t"+Price);
				Select.click();
		}
		
		}

	}

}
