package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capturing all the links from web page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+links.size());
		
		int noOfBrokenLinks = 0;
		
		for(WebElement link:links)
		{
			String hrefattValue = link.getAttribute("href");
			
			if(hrefattValue==null||hrefattValue.isEmpty())
			{
				System.out.println("href attribute value is null or empty. so not possible to check");
				continue;
			}
			
			//hitting url to the server
			
			try {
			URL url = new URL(hrefattValue);       //converted href value from string to url format
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();    //opens connection to the server
			conn.connect();       //connect to server and send request to the server
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefattValue+" is Broken link");
				noOfBrokenLinks++;
			}
			else
			{
				System.out.println(hrefattValue+" is not a broken link");
			}
			}catch(Exception e) {
				
			}
		}
		
		System.out.println("No. of broken links present on the web page is : "+noOfBrokenLinks);

	}

}
