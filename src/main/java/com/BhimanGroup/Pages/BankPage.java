package com.BhimanGroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class BankPage extends MainBase{
	

	By master=By.xpath("//a//span[contains(text(),'Masters')]");
	
	By Bank=By.xpath("//li//a[contains(text(),'Banks ')]");
	
	By AddBank = By.xpath("//a[@id='add_btn']");
	
	@FindBy(xpath="//div//h2[contains(text(),'Banks')]")
	WebElement title;
	
	By BankName= By.xpath("//input[@name='bank_name']");
	
	By AccountName= By.xpath("//input[@name='account_name']");
	
	By AccountNo = By.xpath("//input[@name='account_no']");
	
	By BankAccountType = By.xpath("//select[@name='bank_account_type']");
	
	By IFSCCode= By.xpath("//input[@name='ifsc_code']");	
	
	By MICRCode = By.xpath("//input[@name='micr_code']");
	
	By Submit=By.xpath("//input[@type='submit']");
	
	By OK=By.xpath("//button[contains(text(),'OK')]");
	
	By AddBtn= By.xpath("//a[@id='add_btn']");
	
	By ViewBank = By.xpath("//a[contains(text(),'View Banks')]");
	
	By SearchBtn =By.xpath("//input[@type='search']");
	
	By Copy = By.xpath("//button[@class='dt-button buttons-copy buttons-html5']");
	
	By Excel = By.xpath("//button[@class='dt-button buttons-excel buttons-html5']");
	
	By cSv = By.xpath("//span[contains(text(),'CSV')]");
	
	By PDF = By.xpath("//span[contains(text(),'PDF')]");

	public void BankPage() {
	}

	public void AddBank() {
		Constants.driver.findElement(AddBank).click();
	}


	public void executeBankFlow(String bankName, String accountName, String accountNo, String BankaccountType,String ifscCode,String micrCode) {
		Constants.driver.findElement(BankName).sendKeys(bankName);
		Constants.driver.findElement(AccountName).sendKeys(accountName);
		Constants.driver.findElement(AccountNo).sendKeys(accountNo);
		Constants.driver.findElement( BankAccountType).click();
		Select select =new Select(Constants.driver.findElement(BankAccountType));
		select.selectByVisibleText("Savings");


		//select.selectByVisibleText("Current");
		Constants.driver.findElement(IFSCCode).sendKeys(ifscCode);
		Constants.driver.findElement(MICRCode).sendKeys(micrCode);

		Constants.driver.findElement(Submit).click();
		Constants.driver.findElement(OK).click();

		Constants.driver.findElement(AddBtn).click();

		Constants.driver.findElement(ViewBank).click();

		Constants.driver.findElement(SearchBtn).sendKeys("Saraswat Bank");

		Constants.driver.findElement(Copy).click();

		Constants.driver.findElement(Excel).click();

		Constants.driver.findElement(cSv).click();

		Constants.driver.findElement(PDF).click();
	}
	  


}

