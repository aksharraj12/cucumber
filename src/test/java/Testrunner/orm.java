package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "src\\test\\resources\\Features\\orm.feature",
		glue={"stepdef"},
		monochrome=true
		
)

public class orm
{
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
