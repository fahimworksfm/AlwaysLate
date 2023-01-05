package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPages {

	WebDriver driver;
	
	public loginPages(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement usernameBx;
	
	public void getUsernameBx(String user) {
		
		usernameBx.sendKeys(user);
	}
	
	@FindBy(name="password")
	WebElement passwordBx;
	
	public void getPasswordBx(String pass) {
		
		passwordBx.sendKeys(pass);
	}
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void getLoginBtn() {
		
		loginBtn.click();
	}
	
	
	
	
	
	
}

