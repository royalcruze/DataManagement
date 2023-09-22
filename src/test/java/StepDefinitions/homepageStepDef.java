package StepDefinitions;



import org.Reqres.pages.HomePage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class homepageStepDef
{
	
	private WebDriver driver;
	private HomePage homepage;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Given("User on the homepage")
	public void user_on_the_homepage() 
	{
	    driver.get("https://reqres.in/");
	    homepage = new HomePage(driver);
	}

	@When("User verify the Homepage displays request types and endpoints")
	public void user_verify_the_homepage_displays_request_types_and_endpoints() 
	{
	 
		WebElement requestSection = driver.findElement(By.className("endpoints"));
		Assert.assertTrue(requestSection.isDisplayed());
		
		
	}

	@Then("User clicks on specific request type")
	public void user_clicks_on_specific_request_type() {
		
	    homepage.clickSingleUserNotFoundRequest();
	    
	    
	    
	}

	@Then("User verify the selected request type details status code and response")
	public void user_verify_the_selected_request_type_details_status_code_and_response() 
	{
		String endPoint = driver.findElement(By.xpath("//div[@class='request']")).getText();
	    Assert.assertEquals("Request\n/api/users/23", endPoint);
	    String responseCode = driver.findElement(By.xpath("//div[@class='response']")).getText();
	    Assert.assertEquals("Response\n404\n{}", responseCode);
	}

	@Then("User verify the presence of a button to navigate to support page")
	public void user_verify_the_presence_of_a_button_to_navigate_to_support_page() 
	{
	    
		WebElement supportButton = driver.findElement(By.xpath("//a[@href='#support-heading']"));
		Assert.assertTrue(supportButton.isDisplayed());
	}


}
