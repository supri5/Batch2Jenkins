package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		Thread.sleep(5000);
		
		//to copy text ctrl c
		StringSelection selection=new StringSelection("C:\\Users\\Lenovo\\Desktop\\test1.txt");
		
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(selection, selection);
		// to access eyboard
		
		Robot r=new Robot();
		
		// launching notepad file
		Runtime runtime= Runtime.getRuntime();
		runtime.exec("C:\\Users\\Lenovo\\Desktop\\test1.exe");
		
		Thread.sleep(5000);
	// ctrl v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		

	}

}
