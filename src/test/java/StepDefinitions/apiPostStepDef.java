package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apiPostStepDef 
{
	
	private Response response;
	
	
	@Given("the API base URL is {string}")
	public void the_api_base_url_is(String baseUrl) 
	{
	    RestAssured.baseURI = baseUrl;
	}

	@Given("the request payload is:")
	public void the_request_payload_is(String endpoint, String payload) {
		
	}

	@When("User sends a POST request to {string}")
	public void user_sends_a_post_request_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the response body should contain {string}")
	public void the_response_body_should_contain(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
