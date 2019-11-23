package ExtentReport;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
	List <WebElement> rows=	driver.findElements(By.tagName("tr"));
	
	for(int i=2;i<(rows.size()-1);i++) {
		
		WebElement Str_Struct=driver.findElement(By.xpath("//tr["+i+"]//th[@scope=\"row\"]"));
		if(Str_Struct.getText().contentEquals("Financial Center")) {
			
			String strRanc=driver.findElement(By.xpath("//tr["+i+"]//th[@scope=\"row\"]//following-sibling::td[5]")).getText();
			System.out.println(strRanc);
			break;
		}
		
		
	}
	
		
	}

}
