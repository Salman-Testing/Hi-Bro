package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {
	
	
	
	
	
	

	@When("User will enter the given URL")
	public void userWillEnterTheGivenURL() {
		System.out.println("Enter URL");
		launchBrowser();
		driver.get("https://www.facebook.com/");
	}
	

	@When("User enter username and password in the respected field")
	public void user_enter_username_and_password_in_the_respected_field(io.cucumber.datatable.DataTable d) {
	  System.out.println("Credentials");
	  driver.findElement(By.name("email")).sendKeys("Selenium");
	  driver.findElement(By.name("pass")).sendKeys("Selenium@12345");
	  
		
	}

	@When("User will click the login button")
	public void user_will_click_the_login_button() {
	    
		System.out.println("Login buttons");
		
	}

	@Then("User verifies the login function")
	public void user_verifies_the_login_function() {
		
		System.out.println("Done verifying Facebook");
	   
	}
	@Then("User verifies the login functionnality")
	public void user_verifies_the_login_functionnality() {
	   System.out.println("New snippet done verifying");
	}
	
	


}
