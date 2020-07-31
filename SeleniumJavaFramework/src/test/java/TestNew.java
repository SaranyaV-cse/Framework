import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Pages.WordPressLoginPage;

import Utilities.BrowserFactory;
import Utilities.ConfigReader;
import lib.ExcelRead;

public class TestNew {
public static WebDriver driver=null;
public static WordPressLoginPage login= new WordPressLoginPage(driver);
	
@BeforeTest
/*public static void Setup()
{
	
	driver=BrowserFactory.startApplication("chrome");
	 
	 System.out.print("ChromeDriver Setup done");
	 WordPressLoginPage login=PageFactory.initElements(driver,WordPressLoginPage.class);
}*/
@Test(dataProvider="GetData")
	public static void LoginValidation(String UserName,String Password) throws Exception
	{
	
	
	
       login.LinkLogin().click();
	     Thread.sleep(5000);
	    // driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	    login.getUserId().sendKeys(UserName);
	    login.btnContinue().click();
	    login.getPassword().sendKeys(Password);
	    login.btnSubmit().click();
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	     Assert.assertTrue(driver.getTitle().contains("Streams"),"Title do not match");
	     try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





}
