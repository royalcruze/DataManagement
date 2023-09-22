package org.Reqres.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	private WebDriver driver;
	
	public  HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[normalize-space()='Single user not found']")
	private WebElement singleUserNotFoundRequest;
	

	
		
	public void clickSingleUserNotFoundRequest()
	{
		singleUserNotFoundRequest.click();
		
	}
	
}
