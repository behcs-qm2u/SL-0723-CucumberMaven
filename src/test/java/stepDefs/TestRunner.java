package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,		// enable console output
		//plugin= {"pretty", "html:target/cucumber-html", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent/report.html"},
		// plugin= {"pretty", "html:target/cucumber-html"},
		plugin= {"pretty", "html:target/cucumber-html", "json:target/cucumber.json"},
		features = "src/test/java/features",
		// tags = {"@NegativeLogin, @PositiveLogin" },   // Logical AND
		// tags = {"~@NegativeLogin", "@Sanity" },   // Logical OR
		
		tags = {"@DataTable"},
		glue = {"stepDefs"}
		
		)



public class TestRunner {

}
