package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\SignInFuctionality"}, glue= {"com.stepdefinition"}, monochrome=true, dryRun=true)
public class TestRunner {
	
	

}
