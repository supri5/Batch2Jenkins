package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		Thread.sleep(5000);
		
		//document.querySelector("#photo").scrollIntoView(true)
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"#photo\").scrollIntoView(false)");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\test1.txt");
		
		

	}

}
