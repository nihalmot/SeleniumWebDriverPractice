package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		Thread.sleep(10000);
		WebElement lgnbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		lgnbtn.click();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//Capturing the String from given string of "Showing 1 to 10 of 16700 (1670 Pages)"
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		//code to extract the number of strings from given text
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("Total number of pages are : "+total_pages);
		
		//navigating through each page
		
		for(int p=1;p<=5;p++)
		{
			if(p>1)
			{
				Thread.sleep(10000);
				WebElement active_element = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_element.click();
			}
			
			//reading data from displayed page
			
			Thread.sleep(10000);
			int no_of_rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			int no_of_colns = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//thead//td")).size();
			for(int r=1;r<=no_of_rows;r++)
			{
				String Customer_Name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String Email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				
				System.out.println(Customer_Name+"\t"+Email);
			}
			
		}
		
	}

}
