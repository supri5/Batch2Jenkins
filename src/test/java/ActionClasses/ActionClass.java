package ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://rightstartmath.com/");
		
	WebElement ele=	driver.findElement(By.xpath("//a[text()='Curriculum']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Research'][1]"));
		
		Thread.sleep(5000);
		//.build().perform();
		act.moveToElement(ele2).click(ele2).build().perform();

	}

}
