package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of rows in a table
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));     //returns number of rows present in a specific table
		//List<WebElement>tabele = driver.findElements(By.tagName("tr"));   //returns total number of rows present on the web page includes all the table
		System.out.println(rows.size());
		
		//find total number of columns in a table
		
		List<WebElement>coln = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		//List<WebElement>coln = driver.findElements(By.tagName("th"));
		System.out.println(coln.size());
		
		//Read data from an specific row and column (5th row and 1st column : Master In Selenium)
		String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookName);
		
		//Read data from all the rows and columns
		
		/*for(int r=2;r<=rows.size();r++)
		{
			for(int c=1;c<=coln.size();c++)
			{
				String tdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(tdata);
			}
		}*/
		
		//Print book names whose Author is Mukesh
		
		/*for(int r=2;r<=rows.size();r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(data);
			}
		}*/
		
		//Calculating total price of all the books
		int sum = 0;
		for(int r=2;r<=rows.size();r++)
		{
			int price = Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText());
			sum = sum+price;
		}
		System.out.println("Total price is : "+sum);

	}

}
