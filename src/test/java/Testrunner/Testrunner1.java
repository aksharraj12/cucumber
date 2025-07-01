package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/test/resources/Features/Login1.feature",
	glue= {"stepdef"},
	monochrome=true,
	plugin= {"pretty","html:target/HtmlReports/report1.html"}
	
		
		
		
)

public class Testrunner1 {

}
