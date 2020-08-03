package com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLoginPage {
	public static WebDriver driver=null;
	public static WebElement element=null;
	

		public NaukriLoginPage (WebDriver driver)
		{
			this.driver=driver;
			//PageFactory.initElements(driver,this );
			//PageFactory.initElements(driver,this );
			
			/*String objclass= this.getClass().getSimpleName();
			System.out.print(objclass);*/
		}
	
		
		
		
		@FindBy(xpath="//div[contains(text(),'Login')]")
		private static WebElement lnk_Login;

		
		public WebElement Link_Login()
		{
		
		return  lnk_Login;
		}

    @FindBy(name="email")
    private static WebElement txt_UserName;
    
    public WebElement gettxt_UserName()
	{
	return	txt_UserName;
	
	}
    ////div[contains(text(),'Login')]
    
    @FindBy(xpath="//*[contains(@placeholder,'Enter your active Email ID / Username')]")
    private static WebElement txt_UserNameNau;
    
    public WebElement gettxt_UserNameNaukri()
	{
	return	txt_UserNameNau;
	
	}
    //
    
    @FindBy(xpath="//*[contains(@placeholder,'Enter your password')]")
    private static WebElement txt_PassNau;
    
    public WebElement gettxt_PasswordNaukri()
	{
	return	txt_PassNau;
	
	}
    
    
    
    @FindBy(name="pass")
    private static WebElement txt_Password;
    
    public WebElement gettxt_Password()
	{
	return txt_Password;
	
	}
    
    @FindBy(xpath="//*[contains(@type,'submit')]")
    private static WebElement btn_Login;
    
    public WebElement getbtn_Login()
	{
	return element=	 btn_Login;

	}
    
}
