package StepDefinitions;

import org.Reqres.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apiGetStepDef 
{
	
	private Response response;
	
	
	
	@Given("the API base URL is {string}")
	public void the_api_base_url_is(String baseUrl) 
	{
	    RestAssured.baseURI = baseUrl;
	}
	
	@When("User sends a GET request to {string}")
	public void user_sends_a_get_request_to(String endpoint) {
	    response = RestAssured.get(endpoint);
	}

	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer expectedStatusCode) {
	    Assert.assertEquals(response.statusCode(), expectedStatusCode);
	}

	@Then("the response body should contain {string}")
	public void the_response_body_should_contain(String expectedText) {
		Assert.assertTrue(response.getBody().asString().contains(expectedText));
	}
}
