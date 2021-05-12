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
	
	public void loginPage() {
		//PageFactory.initElements(Constants.driver, loginPage.class);
		
	}
	
	public void LoginDetails(String uname, String pass) {
		userName.click();
		userName.clear();
		userName.sendKeys("uname");
		password.click();
		password.clear();
		password.sendKeys("pass");
	}
}
