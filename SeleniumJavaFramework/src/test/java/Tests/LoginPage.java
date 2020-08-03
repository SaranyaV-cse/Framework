package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Automation.Pages.NaukriLoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utilities.BrowserFactory_New;
import Utilities.ConfigReader;
import Utilities.ExcelRead;
import Utilities.Helper;


public class LoginPage extends TestcaseBaseClass_New  {
	 public  WebDriver driver;
	 
     
	
	// ConfigReader con=new ConfigReader();
	// ExcelRead excel=new ExcelRead();
		
	
	
	
  @Test
 // @Parameters({"browser","AppURL"})
  public void LoginValidation() throws IOException {
	  //super.Setup();
	 // NaukriLoginPage obj1=new NaukriLoginPage(driver);
	
	 logger=report.createTest("Login to Naukri: ");
	  logger.log(Status.INFO, "Start Login into Naukri:");
		
		
		 obj1.Link_Login().click();
		obj1.gettxt_UserNameNaukri().clear();
		obj1.gettxt_UserNameNaukri().sendKeys(excel.getStringDataCellvalue("LoginData", 1, 0));
		obj1.gettxt_PasswordNaukri().clear();
		obj1.gettxt_PasswordNaukri().sendKeys(excel.getStringDataCellvalue("LoginData", 1, 1));
		obj1.getbtn_Login().click();
		logger.log(Status.PASS, "Logged into Naukri Application successfully ");
	 
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  
 
}
