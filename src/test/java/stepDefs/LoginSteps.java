package stepDefs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver ;
	
	public LoginSteps()  {
		this.driver = BaseClass.driver;
		// System.out.println("DEBUG: Assigned!");
		
	}
	
    @Given("^User has opened the Simplilearn application$")
    public void user_has_opened_the_simplilearn_application() throws Throwable {

    	
		driver.get("https://www.simplilearn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log in")));
			System.out.println("INFO: Simplilearn application opened!");
		} catch (Exception TimeOutException) {
			System.out.println("ERROR: Main page not loaded properly!");
		}
    	
       		
    
    }

    @When("^User click on the Login button$")
    public void user_click_on_the_login_button() throws Throwable {

    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
    	loginLink.click();
    	
    }
    
    @When("^User enters correct username '(.+)'$")
    public void user_enters_correct_username_(String username) throws Throwable {
    	
    	WebElement userName = driver.findElement(By.name("user_login"));
    	userName.sendKeys(username);
    	
    }
    

    @Then("^User should be landed on the homepage$")
    public void user_should_be_landed_on_the_homepage() throws Throwable {
    	
 
    }

    @And("^User enters correct password '(.+)'$")
    public void user_enters_correct_password_(String password) throws Throwable {
        
    	WebElement passwordField = driver.findElement(By.id("password"));
    	passwordField.sendKeys(password);
    	
    }

    @And("^click on Login button$")
    public void click_on_login_button() throws Throwable {
        WebElement loginButton = driver.findElement(By.name("btn_login"));
        loginButton.click();
        
    }

    @And("^User should be able to see the welcome message$")
    public void user_should_be_able_to_see_the_welcome_message() throws Throwable {
        
    }

    
    
    
    
}
