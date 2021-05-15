package com.BhimanGroup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;

public class UsersPage {
	
	
	@FindBy(xpath="//li//a[contains(text(),'Users')]")
	WebElement UsersTap;
	
	@FindBy(id = "add_btn")
	WebElement  addUser;

	public void UsersPage() {
		PageFactory.initElements(Constants.driver, UsersPage.class);
	}
	
	public void UsersDetails(){
		
		UsersTap.click();
		addUser.click();
		
	}
}
