package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class FbSignUpSteps {
	
	   WebDriver driver = BaseClass.driver; 
			   
	   @Given("^User opened the facebook application$")
	    public void user_opened_the_facebook_application() throws Throwable {
		   
			driver.get("https://en-gb.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			// Ensure FB application launched
			WebDriverWait wait = new WebDriverWait(driver, 10);
			try {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-testid='open-registration-form-button']")));
				System.out.println("INFO: FB application opened!");
			} catch (Exception TimeOutException) {
				System.out.println("ERROR: FB page not loaded properly!");
			}
			
	        
	    }

	    @When("^User clicks on the Create New Account button$")
	    public void user_clicks_on_the_create_new_account_button() throws Throwable {
	    	
			WebElement NewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			NewAccount.click();
	        
	    }

	    @And("^User enters '(.+)' '(.+)' '(.+)' and '(.+)'$")
	    public void user_enters_and_(String firstname, String lastname, String mobilenum, String password) throws Throwable {

	        WebElement firstName = driver.findElement(By.xpath("//input[@name ='firstname']"));
	        firstName.sendKeys(firstname);
	        
	        WebElement lastName = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[1]"));
	        lastName.sendKeys(lastname);
	        
	        WebElement mobileNo = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[2]"));
	        mobileNo.sendKeys(mobilenum);
	        
	        WebElement pass = driver.findElement(By.xpath("//input[@name ='reg_passwd__'] "));
	        pass.sendKeys(password);
	        
	    }

	    @And("^User Selects '(.+)' '(.+)' and '(.+)'$")
	    public void user_selects_and_(String day, String month, String year) throws Throwable {


	        //select DOB
	        WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day' ] "));
	        Select DOBday = new Select(dob);
	        DOBday.selectByValue(day);
	        
	        WebElement dom = driver.findElement(By.xpath("//select[@id ='month' ] "));
	        Select DOBmon = new Select(dom);
	        DOBmon.selectByVisibleText(month);
	        
	        WebElement doy = driver.findElement(By.xpath("//select[@name='birthday_year' ] "));
	        Select DOByear = new Select(doy);
	        DOByear.selectByValue(year);
	        
	        // WebElement Gender = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
	        // Gender.click();
	    	
	    	
	    	
	    }

	    @And("^User selects$")
	    public void user_selects(DataTable table) throws Throwable {

	        //select DOB
	        WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	        Select DOBday = new Select(dob);
	        DOBday.selectByValue(table.cell(1, 1));
	        
	        WebElement dom = driver.findElement(By.xpath("//select[@id ='month']"));
	        Select DOBmon = new Select(dom);
	        DOBmon.selectByVisibleText(table.cell(2, 1));
	        
	        WebElement doy = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	        Select DOByear = new Select(doy);
	        DOByear.selectByValue(table.cell(3, 1));
	        
    	
	    	
	    }

	    
	    
	    
	    
	    @And("^User clicks on the Sign Up button$")
	    public void user_clicks_on_the_sign_up_utton() throws Throwable {
	        
	    }

	    @And("^User creates the new account$")
	    public void user_creates_the_new_account(DataTable table) throws Throwable {

	    	System.out.println("======== FirstName is " + table.cell(1, 1));
	    	System.out.println("SureName is " + table.cell(2, 1));
	    	System.out.println("MobileNumber is " + table.cell(3, 1));
	    	System.out.println("Password is " + table.cell(4, 1));
	    	
	    	// user_enters_and_(table.cell(1, 1), table.cell(2, 1), table.cell(3, 1), table.cell(4, 1));

	    	WebElement tbFirstName = driver.findElement(By.xpath("//input[@name ='firstname']"));
	        tbFirstName.sendKeys(table.cell(1, 1));
	        
	        WebElement tbLastName = driver.findElement(By.xpath("//input[@name ='lastname']"));
	        tbLastName.sendKeys(table.cell(2, 1));
	        
	        WebElement tbMobileNo = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[2]"));
	        tbMobileNo.sendKeys(table.cell(3, 1));
	        
	        WebElement tbPassword = driver.findElement(By.xpath("//input[@name ='reg_passwd__'] "));
	        tbPassword.sendKeys(table.cell(4, 1));	    	
	    	
        
	    }
	    
	    
	    @Then("^User should be able to see the success message$")
	    public void user_should_be_able_to_see_the_success_message() throws Throwable {
	        
	    }


}
