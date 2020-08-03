package Tests;
import org.testng.annotations.Test;

import com.Automation.Pages.GoogleSearchPage;
import com.Automation.Pages.NaukriLoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import Utilities.BrowserFactory_New;
import Utilities.ConfigReader;
import Utilities.ExcelRead;
import Utilities.Helper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class TestcaseBaseClass_New {

public static WebDriver driver;
 public static  ExcelRead excel;
  public  ConfigReader con;
  public  static BrowserFactory_New brow;

 public static ExtentReports report;
 public static ExtentTest logger;
 public static NaukriLoginPage obj1;
 
 

@BeforeSuite
 public void ExcelSetup()
 {
	 Reporter.log("Setup getting started");
	 
	excel =new ExcelRead();
	 
    con =new ConfigReader();
	ExtentHtmlReporter rep= new ExtentHtmlReporter(new File (System.getProperty("user.dir")+"/Reports/Naukri_"+Helper.getCurrentDateTime()+".html"));
    report=new ExtentReports();
    report.attachReporter(rep);
    Reporter.log("Setup ready");
   // brow =new BrowserFactory_New();
 
 
 }
 
 
 
@Parameters({"browser","AppURL"})
 
 @BeforeClass
 
 public void Setup(String browser,String AppURL)
	{
 Reporter.log("Application starts.Browser is ready to start");
 /*System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
 driver= new ChromeDriver();

 driver.get(con.getURL());
 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 NaukriLoginPage obj1=PageFactory.initElements(driver,NaukriLoginPage.class);*/

driver=BrowserFactory_New.startApplication(driver,browser ,AppURL);
 obj1=PageFactory.initElements(driver,NaukriLoginPage.class);
		 //GoogleSearchPage objsear= PageFactory.initElements(driver,GoogleSearchPage.class );
		// WordPressLoginPage login=PageFactory.initElements(driver,WordPressLoginPage.class);
		 Reporter.log("Browser Started");
	}		
 @AfterMethod
 public void Teardown(ITestResult result) throws IOException
 {
	if(result.getStatus()== ITestResult.FAILURE)
	{
		Helper.Screenshot(driver);
		logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.Screenshot(driver)).build());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		Helper.Screenshot(driver);
		logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.Screenshot(driver)).build());
	}
	report.flush();
 }
 
  
 @BeforeMethod
 public   void verifyTitle() {
		//Title Verification
	  String ActTitle= driver.getTitle();
	  System.out.print(ActTitle);
	  String ExpTitle="Job Vacancies";
	  if(ActTitle.contains(ExpTitle))
	  {
	  System.out.print("The Page Title is Verified:" );
	  }
	  else
	  {
		  System.out.println("The Expected Title is not found");
	  }
		
		
	  }
  
 
  @AfterClass
  

	public void Close()
	{
	  Reporter.log("Browser Closing");
	driver.quit();
	Reporter.log("Closed", true);
	}
  
  /*@DataProvider
  public Object[][] GetData()
  {

  

  int rows= readdata.getrowcount("Sheet1");

  Object[][] data1=new Object[rows][2];
  for(int i=0;i<rows;i++)
  {
  data1[i][0]=readdata.getDataCellvalue(0, i, 0);
  data1[i][1]=readdata.getDataCellvalue(0, i, 1);

  }
  return data1;

  
  }*/
}
