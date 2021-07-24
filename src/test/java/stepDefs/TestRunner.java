package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,		// enable console output
		//plugin= {"pretty", "html:target/cucumber-html", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent/report.html"},
		plugin= {"pretty", "html:target/cucumber-html"},
		features = "src/test/java/features",
		// tags = {"@NegativeLogin, @PositiveLogin" },
		// tags = {"~@NegativeLogin", "@Sanity" },
		
		tags = {"@DataTable"},
		glue = {"stepDefs"}
		
		)



public class TestRunner {

}
