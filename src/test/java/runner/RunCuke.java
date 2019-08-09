package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinitions" }, plugin = { "pretty",
		"html:reports/cucumber-reports", "json:reports/Cucumber.json" }, monochrome = true)

public class RunCuke {

}