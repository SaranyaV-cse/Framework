package Utilities;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Pages.NaukriLoginPage;

public class BrowserFactory_New {
	  WebDriver driver;
	static ConfigReader con1=new ConfigReader();
	public  static   WebDriver startApplication(WebDriver driver,String BrowserName,String URL) {

		
		if(BrowserName.equalsIgnoreCase(con1.getBrowser()))
		{     
			System.setProperty("webdriver.chrome.driver",con1.getchrome());
		      driver= new ChromeDriver();
		     
		      driver.get( con1.getURL());
		      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		     
		      
				}
		return driver;
	}
	public static void QuitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
