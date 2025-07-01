package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/Features/Login.feature",
		glue= {"stepdef"},
		monochrome=true,
		tags="smoketest",
		plugin= {"pretty","junit:target/JunitReports/report.xml",
				"pretty","json:target/JsonReports/report.json",
				"pretty","html:target/HtmlReports/report.html"}
		
		
		) 


public class Testrunner {

}
