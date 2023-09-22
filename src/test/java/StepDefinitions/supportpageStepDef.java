package StepDefinitions;


import org.Reqres.pages.SupportPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class supportpageStepDef 
{
	
	private WebDriver driver;
	private SupportPage supportpage;
	
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
	
	
	@Given("User on the Home page")
	public void user_on_the_home_page() {
		driver.get("https://reqres.in/");
		supportpage = new SupportPage(driver);		
	}

	@When("User navigates to Support page")
	public void user_navigates_to_support_page() 
	{
		supportpage.navigateToSupportPage();
		String text = driver.findElement(By.id("support-heading")).getText();
		Assert.assertEquals("Support", text);
	    
	}
	
	
	@Then("User Verifies the support page displays one-time and monthly support options")
	public void user_verifies_the_support_page_displays_one_time_and_monthly_support_options() {
	    
		WebElement radioButtonOneTime = driver.findElement(By.id("supportOneTime"));
		Assert.assertTrue(radioButtonOneTime.isDisplayed());
		WebElement radioButtonMonthly = driver.findElement(By.id("supportRecurring"));
		Assert.assertTrue(radioButtonMonthly.isDisplayed());
		
	}
	
	
	@Then("User verifies the Upgrade details are displayed")
	public void user_verifies_the_upgrade_details_are_displayed() {
	    WebElement upgrade = driver.findElement(By.id("trigger-pro"));
	    Assert.assertTrue(upgrade.isDisplayed());
	    
	}

}
