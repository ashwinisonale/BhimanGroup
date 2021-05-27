package com.BhimanGroup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage {
	
	@FindBy(xpath="//a[@id='add_btn']")
	WebElement addBranch;
	
	@FindBy(xpath="//input[@id='branch_name']")
	WebElement branchName;
	
	@FindBy(xpath="//input[@id='branch_address']")
	WebElement branchAddress;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement branchCity;
	
	@FindBy(xpath="//input[@id='contact_no1']")
	WebElement contactNo;
	
	@FindBy(xpath="//input[@id='contact_no2']")
	WebElement contactNo2;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement mailId;
	
	@FindBy(xpath="//input[@name='branch_add']")
	WebElement submit;
	
	@FindBy(xpath="//button[@class='swal2-confirm styled']")
	WebElement okButton;
	
	@FindBy(xpath="//a[@id='view_btn']")
	WebElement viewRecord;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@class='dt-button buttons-copy buttons-html5']")
	WebElement copyButton;
	
	@FindBy(xpath="//button[@class='dt-button buttons-excel buttons-html5']")
	WebElement excelButton;
	
	@FindBy(xpath="//button[@class='dt-button buttons-csv buttons-html5']")
	WebElement csvButton;
	
	@FindBy(xpath="//button[@class='dt-button buttons-pdf buttons-html5']")
	WebElement pdfButton;
	
	@FindBy(xpath="//button[@class='dt-button buttons-print']")
	WebElement printButton;
	
	public void populateData(String bName, String bAddress, String bcity, String contantNo, String contactNumber, String emailId) {
		addBranch.click();
		
		branchName.sendKeys(bName);
		branchAddress.sendKeys(bAddress);
		branchCity.sendKeys(bcity);
		contactNo.sendKeys(contantNo);
		contactNo2.sendKeys(contactNumber);
		mailId.sendKeys(emailId);
	}
		
		public void clickOnSubmit() {
		submit.click();
		okButton.click();
		}
		
		public String clickOnSearchBoxTextbox(String s) {
			searchBox.click();
			searchBox.clear();
			searchBox.sendKeys(s);
			return null;
		}

}
