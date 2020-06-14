package com.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefinition {

	@When("User click on My Account button")
	public void user_click_on_My_Account_button() {
System.out.println("User successfully click the account button");
	}

	@When("User click on Create an Account")
	public void user_click_on_Create_an_Account() {
	    
		System.out.println("user successfully click an create an account");
		
	}

	@When("User enter the first name, last name and valid email")
	public void user_enter_the_first_name_last_name_and_valid_email() {
	
	System.out.println("User the enter the valid first and last name and email");
	}

	@When("User enter the valid data on Sign In information")
	public void user_enter_the_valid_data_on_Sign_In_information() {

System.out.println("User enter the valid data on sign");		
		
	}

	@Then("Click on Create An Account")
	public void click_on_Create_An_Account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enter the users first name, last name and invalid email")
	public void user_enter_the_users_first_name_last_name_and_invalid_email() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enter the password and confirm password")
	public void user_enter_the_password_and_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



	
}
