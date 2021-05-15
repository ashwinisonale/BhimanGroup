package com.BhimanGroup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class loginPage {
	
    @FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement Login;
	
	public void loginPage() {
		//PageFactory.initElements(Constants.driver, loginPage.class);
		
	}
	
	public void LoginDetails(String user, String pass) {
		userName.click();
		userName.clear();
		userName.sendKeys(user);
		
		password.click();
		password.clear();
		password.sendKeys(pass);
		Login.click();	
	}
	
	public void validLoginDetails() {
		userName.click();
		userName.clear();
		userName.sendKeys(Constants.prop.getProperty("username"));
		password.click();
		password.clear();
		password.sendKeys(Constants.prop.getProperty("password"));
		Login.click();
	}
}
