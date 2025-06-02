package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// selecting specific check box

		// driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// selecting all the check boxes

		/*
		 * List<WebElement> checkboxes = driver.findElements(By.
		 * xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 * System.out.println(checkboxes.size()); for(WebElement checkbox : checkboxes)
		 * { checkbox.click(); }
		 */

		// selecting last 3 check boxes

		// total no of check boxes - how many check boxes you want to select = starting
		// index
		// 7 - 3 = 4(starting index)
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*
		 * for(int i = checkboxes.size()-3;i<checkboxes.size();i++) {
		 * checkboxes.get(i).click(); }
		 */

		// selecting first three check boxes

		/*
		 * for(int i = 0;i<3;i++) { checkboxes.get(i).click(); }
		 */

		// unselect the check boxes if they are selected

		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}
		
		for(WebElement checkbox : checkboxes)
		{
			if(checkbox.isSelected())
			{
				checkbox.click();
			}
		}

	}

}
