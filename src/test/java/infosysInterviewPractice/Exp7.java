package infosysInterviewPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp7 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		if(pagesource.contains("GreenKart - veg and fruits kart"))
			System.out.println("text present in page source");
		else
			System.out.println("text not present in the page source");

	}

}
