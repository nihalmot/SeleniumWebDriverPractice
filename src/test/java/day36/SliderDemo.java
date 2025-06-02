package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Range");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		//Min_Slider
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Default location of min_slider : "+min_slider.getLocation());     //(101, 47) = (x,y)
		
		act.dragAndDropBy(min_slider, 150, 47).perform();
		System.out.println("Location of min_slider after moving : "+min_slider.getLocation());   //(251, 47)
		
		//Max_Slider
		
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Default location of max_slider : "+max_slider.getLocation());     //(408, 47) = (x,y)
		
		act.dragAndDropBy(max_slider, -100, 47).perform();
		System.out.println("Location of max_slider after moving : "+max_slider.getLocation());
		
		

	}

}
