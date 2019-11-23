package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleWay {

	public static String getRancFromTablemain(String Structure) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(1000);
		
		//String Structure="Financial Center";
		
	String StrRanc=	driver.findElement(By.xpath("//th[text()='"+Structure+"']//following-sibling::td[5]")).getText();
		
		System.out.println(StrRanc);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		return StrRanc;

	}
	
	public static void main(String[] args) throws InterruptedException {
		
		SimpleWay obj= new SimpleWay();
		obj.getRancFromTablemain("Financial Center");
	}

}
