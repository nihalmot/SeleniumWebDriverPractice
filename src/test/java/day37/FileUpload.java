package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\workspace\\JavaProgramming\\src\\day1\\FirstJavaProgram.java");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("FirstJavaProgram.java"))
		{
			System.out.println("File is uploaded successfully");
		}
		else
		{
			System.out.println("Upload failed");
		}*/
		
		//multiple files upload
		
		String file1 = "E:\\workspace\\JavaProgramming\\src\\day1\\FirstJavaProgram.java";
		String file2 = "E:\\workspace\\JavaProgramming\\src\\day1\\SecondJavaProgram.java";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);

	}

}
