package Utilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Pages.NaukriLoginPage;

public class BrowserFactory {
	static WebDriver driver;
	static ConfigReader readdriver= new ConfigReader();
	
	public static WebDriver startApplication(String BrowserName,String URL) {

		
		if(BrowserName.equalsIgnoreCase(ConfigReader.getBrowser()))
				{
			System.setProperty("webdriver.chrome.driver", readdriver.getchrome());
		      driver= new ChromeDriver();
		      driver.get(readdriver.getURL());
		      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      NaukriLoginPage login=PageFactory.initElements(driver,NaukriLoginPage.class);
		      
				}
		return driver;
	}
	public static void QuitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
