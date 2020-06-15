@Regression
Feature: As a user, I want to sign up the StarThreeSixty

Background:
Given: User enter the StarThreeSixty home page
When User click on My Account button
And User click on Create an Account 

Scenario: As a user, I want a sign up a valid inforamtion

When User enter the first name, last name and valid email
And User enter the valid data on Sign In information
Then Click on Create An Account

Scenario: As a user, I want a sign up with invalid inforamtion

When User enter the users first name, last name and invalid email
And User enter the password and confirm password
Then Click on Create An Account

