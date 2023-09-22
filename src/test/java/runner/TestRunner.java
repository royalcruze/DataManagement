package runner;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {".//src/test/java/Features"},	
				 glue = {"StepDefinitions"},
				 plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
				 monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests
{
			
		
	
	
}
