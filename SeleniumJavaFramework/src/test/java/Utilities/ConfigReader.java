package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigReader {
	static Properties prop;
	XSSFWorkbook wbook=null;
	XSSFSheet ws=null;
	
	public ConfigReader()
	{
	
	
	File src =new File(System.getProperty("user.dir")+"/Config/config.property");
	
		System.out.print(src);
		try {
			FileInputStream fis = new FileInputStream(src);
			 prop=new Properties();
			prop.load(fis);
	    }
		 catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("Not able to Load Config File: "+e.getMessage());
		}
		
}
	public    String getBrowser()
	{
		String Name=prop.getProperty("Browser");
		System.out.println("BrowserName:"+Name);
		return Name;
	}
	
	public  String getchrome()
	{
		String Path=prop.getProperty("ChromeDriver");
		System.out.println("ChromeDriverpath:"+Path);
		return Path;
	}
	public   String getURL()
	{
		String URLPath=prop.getProperty("URL");
		System.out.println("ChromeDriverpath:"+URLPath);
		return URLPath;
		
	}
	public String getExcelpath()
	{
		String XLPath=prop.getProperty("ExcelPath");
		System.out.println("ExcelReaderrpath:"+XLPath);
		return XLPath;
		
	}
	public String getScreenshotpath()
	{
		String SSPath=prop.getProperty("screeenshot");
		System.out.println("Screenshotpath:"+SSPath);
		return SSPath;
		
	}

}