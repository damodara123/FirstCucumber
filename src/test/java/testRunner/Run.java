package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features = ".//Features/Customer.feature",
			glue = "stepsDefination",
			dryRun = false,
			plugin = {"pretty", "html:target/cucumber-reports1.html"}
		)
public class Run {
	
	

}
