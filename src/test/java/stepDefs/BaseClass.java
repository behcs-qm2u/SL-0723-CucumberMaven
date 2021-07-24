package stepDefs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public static WebDriver driver;
	
	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver = new ChromeDriver();

		
	}
	
	
    // ==== after hook
    @After
    public void teardown() throws InterruptedException {
    	Thread.sleep(5000);
		driver.quit();
    }
	
}