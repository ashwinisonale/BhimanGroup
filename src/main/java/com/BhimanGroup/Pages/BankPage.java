package com.BhimanGroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class BankPage extends MainBase{
	
//	@FindBy(xpath="name=\"bank_name\"")
//	WebElement bank;
	
	By master=By.xpath("//a//span[contains(text(),'Masters')]");

	By Bank=By.xpath("//li//a[contains(text(),'Banks ')]");
	
	By AddBank = By.xpath("//a[@id='add_btn']");
	
	//By title = By.xpath("//div//h2[contains(text(),'Banks')]"); 
	
	@FindBy(xpath="//div//h2[contains(text(),'Banks')]")
	WebElement title;
	
	@FindBy(xpath="//input[@name='account_name']")
	WebElement Accountholder;
	
	
	public void BankPage() {
     PageFactory.initElements(Constants.driver, BankPage.class);
	}
	

	public void ClickOnMasterTab(){
		
		Constants.action= new Actions(Constants.driver);
		Constants.action.moveToElement(Constants.driver.findElement(master)).build().perform();
        
	}
	
	public void clickOnBankTab() {
			Constants.driver.findElement(Bank).click();
			//Bank.click();
			}
	
	public void clickOnAddBankTab() {
		Constants.driver.findElement(AddBank).click();
	}
	
	public boolean verifyTitleText() {
		return title.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

