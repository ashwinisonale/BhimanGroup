package com.BhimanGroup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
    @FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement LoginButton;
		
	@FindBy(xpath="//li//a[@class='dropdown-toggle']")
	WebElement logOff;
	
	@FindBy(xpath="//a[@href=\"user-logout.php\"]")
	WebElement logOut;
	
	public void executeLoginFlow(String user, String pass) {
		userName.click();
		userName.clear();
		userName.sendKeys(user);
		
		password.click();
		password.clear();
		password.sendKeys(pass);
		
		LoginButton.click();	
	}
	
	public void clickOnLogoutLink() {
	logOff.click();
	logOut.click();
	
	}
}
