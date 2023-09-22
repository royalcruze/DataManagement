package org.Reqres.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage 
{
	
	private WebDriver driver;
	
	public  SupportPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#support-heading']")
	private WebElement supportButton;
	
	
	
	public void navigateToSupportPage()
	{
		supportButton.click();
	}
	
	
	

}
