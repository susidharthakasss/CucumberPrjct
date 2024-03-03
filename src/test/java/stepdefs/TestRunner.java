package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
		plugin= {"pretty"},
		features= "src/test/java/features",
		glue="stepdefs",
		tags= {"@Sanity"}
		//tags= {"@Regression or @Sanity"} // or condition 
		//tags= {"@Regression and @Sanity"} // and condition
		//tags= {"@Calculator"} // feature level tag
		//tags= {"@Login and not @WIP"} // do not execute WIP
		)

public class TestRunner {
	

}


