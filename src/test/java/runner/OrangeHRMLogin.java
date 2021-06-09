package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//login.feature",
		glue= {"stepdefs"},
		//dryRun=true
		dryRun=false,
		monochrome=true,
		
		plugin= {"pretty",
				"html:target/html-reports/reports.html",
				
				
				}
		
		)

public class OrangeHRMLogin extends AbstractTestNGCucumberTests {

}
