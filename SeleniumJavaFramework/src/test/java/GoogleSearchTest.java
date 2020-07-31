import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Pages.GoogleSearchPage;

import Utilities.BrowserFactory;
import lib.ExcelRead;

public class GoogleSearchTest  extends TestcaseBaseClass{
	static WebDriver driver=null;
	static GoogleSearchPage objsear=new GoogleSearchPage(driver);
	
	
	
	@Test
	public static void SearchValidation()
	{
		
		objsear.txtbox_Search().click();
		objsear.txtbox_Search().sendKeys("LearnAutomation");
		objsear.btn_Search().click();
	
	}
	

	
	/*@DataProvider
	public Object[][] GetData()
	{

	ExcelRead readdata=new ExcelRead();

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
