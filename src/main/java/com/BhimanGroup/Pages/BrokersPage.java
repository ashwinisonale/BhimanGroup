package com.BhimanGroup.Pages;

import org.apache.bcel.classfile.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.BhimanGroup.mainBase.Constants;

public class BrokersPage {
 Select select;
	
@FindBy(id="add_btn")
WebElement AddBroker;
	
@FindBy(id="broker_name")	
WebElement BrokerName;

@FindBy(id="mobile_no")
WebElement MobileNumber;
	

@FindBy(id="broker_address")
WebElement Address;

@FindBy(name="joining_date")
WebElement JoinDate;

@FindBy(name="blood_group")
WebElement BloodGroup;

@FindBy(name="status")
WebElement Status;

@FindBy(name="bank_name")
WebElement BankName;

@FindBy(name="account_no")
WebElement AccountNumber;

@FindBy(name="ifsc_code")
WebElement IFSCCode;

@FindBy(name="resume")
WebElement Resume;

@FindBy(name="agreement")
WebElement Agreement;

@FindBy(name="kyc")
WebElement KYC;

@FindBy(name="add_user")
WebElement Submit;

By OkButton=By.xpath("//button[contains(text(),'OK')]");
By ViewBroker=By.xpath("//a[@id='view_btn']//i[@class='fa fa-plus']");

//extra Button on page

@FindBy(xpath="//button[@class='dt-button buttons-copy buttons-html5']")
WebElement CopyButton;

@FindBy(xpath="//button[@class='dt-button buttons-excel buttons-html5']")
WebElement ExcelButton;

@FindBy(xpath="//button[@class='dt-button buttons-csv buttons-html5']")
WebElement CsvButton;

@FindBy(xpath="//button[@class='dt-button buttons-pdf buttons-html5']")
WebElement PdfButton;

@FindBy(xpath="//button[@class='dt-button buttons-print']")
WebElement PrintButton;

	
public BrokersPage() {
	
}
public void ClickOnAddBroker() {
	AddBroker.click();
}
	
public void BrokersPersonalDetailsPage() {
	BrokerName.sendKeys("AshwiniSonale");
	MobileNumber.sendKeys("7776007838");
	Address.sendKeys("Kalewadi Pune");
	JoinDate.sendKeys("6-11-2020");
	
	BloodGroup.click();
	select=new Select(BloodGroup);
	select.selectByVisibleText("O positive");
	
	Status.click();
	select=new Select(Status);
	select.selectByVisibleText("Active");	
}

public void BankDetailsOfBrokersPage() {
	BankName.sendKeys("Jalgav bank");
	AccountNumber.sendKeys("1010101011");
	IFSCCode.sendKeys("JJSB0000033");
	
}

public void DocumentsDetails() {
	Resume.sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
	Agreement.sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
	KYC.sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
	
}

public void SubmitButtonOnBrokerPage() {
	JavascriptExecutor js=((JavascriptExecutor)Constants.driver);
	js.executeScript("window.scroll(0,600)");
	//Constants.driver.findElement(Submit);
	Submit.click();
}
public void ViewBrokerButton()
{
    Constants.driver.findElement(ViewBroker).click();
}


public void CopyButtonOnBrokersPage() {
	CopyButton.click();
}

public void ExcelbuttonOnBrokersPage() {
	ExcelButton.click();
}

public void cSvButtonOnBrokersPage() {
	CsvButton.click();
}

public void PdfButtonOnBrokersPage() {
	PdfButton.click();
	
}
public void PrintButtonOnBorkersPage() {
	PrintButton.click();
}

}
