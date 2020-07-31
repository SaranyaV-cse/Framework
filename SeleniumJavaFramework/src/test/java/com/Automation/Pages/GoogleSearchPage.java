package com.Automation.Pages;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

	public GoogleSearchPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
		/*String objclass= this.getClass().getSimpleName();
		System.out.print(objclass);*/
	}
	static WebDriver driver;
	private static WebElement element=null;
	
	
	@FindBy(name="q")
	static WebElement txt_Search;
	public static WebElement txtbox_Search(){

	return	txt_Search;
	//element.sendKeys("Learn Automation");
	
	}
	@FindBy(name="btnK")
	static WebElement btn_Search;
	public static WebElement btn_Search(){
		
		element= btn_Search;
		//element.sendKeys("Learn Automation");
		return element;
		}
}
	