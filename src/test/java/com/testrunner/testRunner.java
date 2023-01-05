package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		features = "Feature",
		glue = "com.stepdefinition"
		
		)
public class testRunner extends AbstractTestNGCucumberTests{

}
