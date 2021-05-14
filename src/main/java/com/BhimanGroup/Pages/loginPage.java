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
	
	public void LoginDetails() {
		//for config property 
        userName.sendKeys(Constants.prop.getProperty("username"));
		password.sendKeys(Constants.prop.getProperty("password"));
		Login.click();
		
	}
	
	public void LoginForDP(String UserName,String Password) {
		userName.clear();
		userName.click();
		userName.sendKeys("UserName");
		
		password.clear();
		password.click();
		password.sendKeys("Password");
		
		Login.click();
	}
		
	
}
