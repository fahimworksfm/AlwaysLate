package com.stepdefinition;

import org.testng.Assert;

import com.common.loginBase;
import com.pageobjectmodel.loginPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends loginBase{

	loginPages page;
	
	@Given("User on SwagLab homepage")
	public void user_on_swag_lab_homepage() {
	    
	    getDriver();
	    
	    page = new loginPages(driver);
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String user) throws InterruptedException {
	    
		Thread.sleep(3000);
		
		page.getUsernameBx(user);
		
		
	  //  driver.findElement(By.id("user-name")).sendKeys(user);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String pass) throws InterruptedException {
	    
		Thread.sleep(2000);
		
		page.getPasswordBx(pass);
		
		
	   // driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	    
		page.getLoginBtn();
		
		
	    //driver.findElement(By.id("login-button")).click();
	}

	@Then("User verifies the landing page")
	public void user_verifies_the_landing_page() throws InterruptedException {
	    
	    Assert.assertEquals(driver.getTitle(), "Swag Labs");
	    
	    Thread.sleep(7000);
	    
	    closeDriver();
	}
}
