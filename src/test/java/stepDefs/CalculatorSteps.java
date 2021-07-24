package stepDefs;

import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	
	int result;

    @Given("^The calculator application is open$")
    public void the_calculator_application_is_open() throws Throwable {
        
    	System.out.println("Calculator Apps is Opened");
    }

    @When("^I add two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
    //@When("I add two numbers {int} and {int}")
    public void i_add_two_numbers_somethingand_something(int num1, int num2) throws Throwable {
        
    	result = num1 + num2;
    	System.out.println("Inside When");
    }

    @Then("^I should get the result as \"([^\"]*)\"$")
    //@Then("I should get the result as {int}")
    public void i_should_get_the_result_as_something(int expResult) throws Throwable {
        
    	/*
    	if( result == expResult) {
    		System.out.println("Test Passed");
    	} else	{
    		System.out.println("Test Failed");
    	}
    	*/
    	
    	Assert.assertEquals(expResult,result);
    	
    }
    
    
    @When("^I multiply two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_multiply_two_numbers_something_and_something(int num1, int num2) throws Throwable {
        result = num1 * num2;
    }
    
    // @When("I add three numbers {int} and {int} and {int}")
    @When("^I add three numbers \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_add_three_numbers_something_and_something_and_something(int num1, int num2, int num3) throws Throwable {
        result = num1 + num2 + num3; 
    };
    
}
