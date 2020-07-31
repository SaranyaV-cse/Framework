package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static ConfigReader reader1;
	public  static String Screenshot(WebDriver driver)
	{
		String screenshotPath= System.getProperty("user.dir")+"/Screenshots/Naukri_"+getCurrentDateTime()+".png";
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("Unable to capture screenshot");
			e.printStackTrace();
		}
		
   return screenshotPath;
	}
	public static String getCurrentDateTime()
	{
		DateFormat customeFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate=new Date();
		return customeFormat.format(currentdate);
	}
}
