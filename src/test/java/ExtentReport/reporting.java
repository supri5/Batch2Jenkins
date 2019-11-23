package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class reporting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\Lenovo\\Desktop\\supriya\\Report\\batch.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(htmlReporter);
		ExtentTest logger= report.createTest("Aut_02_login to flight App", "User able to login succsessfully");
		logger.log(Status.PASS, "URL Launched");
		logger.log(Status.PASS, "User Name Entered Successfully");
		logger.log(Status.PASS, "Password Entered Successfully");
		logger.log(Status.PASS, "Clic on Login");
		
		report.flush();
		
	}

}
