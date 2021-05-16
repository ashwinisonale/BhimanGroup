package com.BhimanGroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;

public class MasterPage{
	
	


	//@FindBy(xpath="//a//span[contains(text(),'Masters')]")
	//WebElement master;
	
	By master=By.xpath("//a//span[contains(text(),'Masters')]");
	
	//@FindBy(xpath="//li//a[contains(text(),'Banks ')]")
	//WebElement Bank;
	
	By Bank=By.xpath("//li//a[contains(text(),'Banks ')]");
	
	
	@FindBy(xpath="//a[contains(text(),'Users')]")
	WebElement Users;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Branches')]")
	WebElement Branches;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Customers')]")
	WebElement Customers;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Brokers')]")
	WebElement Brokers;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Vendors')]")
	WebElement Vendors;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Enquiry')]")
	WebElement Enquiry;
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Projects')]")
	WebElement Projects;
	
	
	
	
	
	//Constants.action= new Actions(Constants.driver);
	
	public void MasterPage() {
     PageFactory.initElements(Constants.driver, MasterPage.class);
	}
	
	public void ClickOnMasterTab(){
		
		Constants.action= new Actions(Constants.driver);
		Constants.action.moveToElement(Constants.driver.findElement(master)).build().perform();
        
	}
	public void clickOnBankTab() {
		
		Constants.driver.findElement(Bank).click();
		//Bank.click();
		
	}
	public void clickOnUserTab() {
		Users.click();
	}	
	public void clickOnBranchesTab() {
		Branches.click();
		
	}
	public void clickOnCustomerTab() { 
		Customers.click();
	
	}
	public void clickOnBrokersTab() {
	     Brokers.click();
	}
	
	public void clickOnVendorsTab() {
	    Vendors.click();
		
	}	
	public void clickOnEnquiryTab() {
		
		Enquiry.click();

	}	
	public void clickOnProjectsTab() { 
		Projects.click();
		
		
}
}
	

