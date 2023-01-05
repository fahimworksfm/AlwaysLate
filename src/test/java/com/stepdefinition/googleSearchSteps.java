package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchSteps {

	WebDriver driver;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String search) {
	    
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    
	    driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	    
	    WebElement results = driver.findElement(By.xpath("//div[@id='result-stats']"));
	    
	    String displayResults = results.getText();
	    
	    System.out.println(displayResults);
	    
	    driver.close();
	}
	
	
	
	
}





