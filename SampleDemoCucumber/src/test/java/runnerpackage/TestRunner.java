package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) // This is the cucumber syntax for specify the cucumber class //

@CucumberOptions (features="features",glue={"stepDefinition"}) // specify foldername where the featurefile is located //
																// glue = specify the package name where the java class is located

public class TestRunner 

{

}
