package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WordPressLoginPage {
	
	public static WebDriver driver=null;;
	public static WebElement element=null;




	public WordPressLoginPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='wpcom-home']//div[@class='lpc-header-nav-wrapper']//ul/li[1]/a[contains(text(),'Log In')]")
	private WebElement Lnk_Login;

	public WebElement LinkLogin()
	{
		return Lnk_Login;
	}
	
	@FindBy(id="usernameOrEmail")
	private WebElement UserId;

	
	public  WebElement getUserId()
	{
		element=UserId;
		return element;
	}
	@FindBy(xpath="//*[@id='password']")
	private WebElement password;

	public  WebElement getPassword()
	{
		element=password;
		return element;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement btncontinue;

	public  WebElement btnContinue()
	{
		element=btncontinue;
		return element;
	}
	
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement btnSubmit;

	public  WebElement btnSubmit()
	{
		element=btnSubmit;
		return element;
	}
	
}
