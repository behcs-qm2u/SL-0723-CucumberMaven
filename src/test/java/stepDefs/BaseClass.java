package stepDefs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public static WebDriver driver;

	// add Extent Reports
	public static ExtentReports report;
	public static ExtentTest test;


	
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver = new ChromeDriver();
		
		report = new ExtentReports("target/extentreport/extentreport.html");

		
	}
	
	
    // ==== after hook
    @After
    public void teardown() throws InterruptedException {

		report.endTest(test);
		report.flush();

    	
    	Thread.sleep(5000);
		driver.quit();

    }
	
}
