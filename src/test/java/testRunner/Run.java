package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features = ".//Features",
			glue = "stepsDefination",
			dryRun = false,
			plugin = {"pretty", "html:target/cucumber-reports2.html"},
			tags="@e2e",
			publish = true
			
		)
public class Run {
	
	

}
