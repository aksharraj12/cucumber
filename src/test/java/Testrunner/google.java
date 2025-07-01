package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/Features/google.feature",
		glue={"stepdef"},
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports/report2.html",
				 "pretty","json:target/JsonReports/reports2.json",
				 "pretty","junit:target/JunitReports/reports2.xml"
		}
		
		
		)
public class google {

}
