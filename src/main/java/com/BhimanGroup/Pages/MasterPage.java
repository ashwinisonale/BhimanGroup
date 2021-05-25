package com.BhimanGroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;


public class MasterPage{

	By master=By.xpath("//a//span[contains(text(),'Masters')]");

	By Bank=By.xpath("//li//a[contains(text(),'Banks ')]");

	By users=By.xpath("//a[contains(text(),'Users')]");

	By branches=By.xpath("//li[@class='nav-item']//a[contains(text(),'Branches')]");

	By customers=By.xpath("//li[@class='nav-item']//a[contains(text(),'Customers')]");
	
	By brokers=By.xpath("//li[@class='nav-item']//a[contains(text(),'Brokers')]");

	By vendors=By.xpath("//li[@class='nav-item']//a[contains(text(),'Vendors')]");

	By enquiry=By.xpath("//li[@class='nav-item']//a[contains(text(),'Enquiry')]");

	By projects=By.xpath("//li[@class='nav-item']//a[contains(text(),'Projects')]");


	public void clickOnMasterTab(){

		Constants.action= new Actions(Constants.driver);
		Constants.action.moveToElement(Constants.driver.findElement(master)).build().perform();

	}
         public void clickOnUserTab() {
		 Constants.driver.findElement(users).click();

	}	
	public void clickOnBankTab() {
		clickOnMasterTab();
		Constants.driver.findElement(Bank).click();
	}
	
	
	public void clickOnBranchesTab() {
		clickOnMasterTab();
		
		Constants.driver.findElement(branches).click();

	}
	public void clickOnCustomerTab() { 
		clickOnMasterTab();
		Constants.driver.findElement(customers).click();


	}
	public void clickOnBrokersTab() {
		clickOnMasterTab();
		Constants.driver.findElement(brokers).click();

	}

	public void clickOnVendorsTab() {
		clickOnMasterTab();
		Constants.driver.findElement(vendors).click();


	}	
	public void clickOnEnquiryTab() {
		clickOnMasterTab();
		Constants.driver.findElement(enquiry).click();


	}	
	public void clickOnProjectsTab() { 
		clickOnMasterTab();
		Constants.driver.findElement(projects).click();


	}
}


