package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions (features="DataDriven",
			glue={"stepDefinitionTC01"},
			plugin={"html:target/cucumber-html-report",
		"json:target/cucumber.json",
		"pretty:target/cucumber.txt",
		"usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml"})               
		

			


public class TestRunnerforDD

{


}
