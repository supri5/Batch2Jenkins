package ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(frame);
	
		
	WebElement ele=	driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	
	Actions act=new Actions(driver);
	act.contextClick(ele).build().perform();
	
	
	


	}

}
