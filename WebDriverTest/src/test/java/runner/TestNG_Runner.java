package runner;

import org.junit.runner.RunWith;
//import org.testng.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Home_Page_CarsLinkVerification.feature"
		,glue="stepDefinitions"
		,format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"}
		,tags="@Home_Page_CarsLinkVerification"
	
		)
public class TestNG_Runner  extends AbstractTestNGCucumberTests{

}