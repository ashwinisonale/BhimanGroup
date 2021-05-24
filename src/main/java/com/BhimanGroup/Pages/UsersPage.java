package com.BhimanGroup.Pages;


import org.eclipse.jetty.util.Uptime.Impl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BhimanGroup.mainBase.Constants;



public class UsersPage {


	Select select ;

	//@FindBy(xpath="//li//a[contains(text(),'Users')]")
	//WebElement UsersTap;

	By AddUserButton=By.xpath("//a[@id='add_btn']");

	By name=By.id("user_name");
	By mobileNo=By.id("mobile_no");
	By email=By.id("email");
	By role=By.id("role_id");
	By joiningDate=By.name("joining_date");
	By bloodGroup=By.name("blood_group");

	By bankName=By.id("bank_name");
	By accountNumber=By.id("account_no");
	By ifsc=By.id("ifsc_code");

	By Choosefile=By.xpath("//input[@id='resume']");
	By agreement=By.id("agreement");
	By kyc=By.name("kyc");

	By fatherName=By.id("father_name");
	By fatherMobilerNo=By.id("father_mobile_no");
	By fatherOccupation=By.name("father_occupation");

	By usersStaus=By.name("status");
	By userPassword=By.name("password");
	By usersConfirmPassword=By.name("confirm_password");

	By submit=By.name("add_user");

	By Search=By.xpath("//input[@type='search']");

	By ViewButton=By.xpath("//i[@class=' fa fa-eye']");
	By EdidButton=By.xpath("//i[@class=' fa fa-pencil']");
	By DeleteButton=By.xpath("//i[@class=' fa fa-trash']");






	public UsersPage() {

	}

	public void AddUserButtonTab(){
		//UsersTap.click();
		Constants.driver.findElement(AddUserButton).click();
	}
	public void userPagePersonalDetails(String Name,String MobileNumber,String EmailId,String Role,String JoiningDate,String BloodGroup) {
		Constants.driver.findElement(name).sendKeys(Name);
		Constants.driver.findElement(mobileNo).sendKeys(MobileNumber);
		Constants.driver.findElement(email).sendKeys(EmailId);

		select=new Select(Constants.driver.findElement(role));
		select.selectByVisibleText(Role);

		//Constants.select.selectByVisibleText("admin");

		Constants.driver.findElement(joiningDate).click();
		Constants.driver.findElement(joiningDate).sendKeys(JoiningDate);


		Constants.driver.findElement(bloodGroup).click();
		Select select1=new Select(Constants.driver.findElement(bloodGroup));
		select1.selectByVisibleText(BloodGroup);	
		// Constants.select.selectByVisibleText("O positive");
	}

	public void usersBankDetails(String BankName,String AccountNumber,String IFSCCode) {

		Constants.driver.findElement(bankName).sendKeys(BankName);
		Constants.driver.findElement(accountNumber).sendKeys(AccountNumber);
		Constants.driver.findElement(ifsc).sendKeys(IFSCCode);

	}

	public void userDocuments(String Resume,String Agreement,String KYC) {

		//JavascriptExecutor js=((JavascriptExecutor)Constants.driver);
		//js.executeScript("window.scroll(0,600)");
		Constants.driver.findElement(Choosefile).sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
		Constants.driver.findElement(agreement).sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
		Constants.driver.findElement(kyc).sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");

	}

	public void usersFatherDetails(String FatherName,String	MobileNumber,String FatherOccupation) {
		Constants.driver.findElement(fatherName).sendKeys(FatherName);
		Constants.driver.findElement(fatherMobilerNo).sendKeys(MobileNumber);
		Constants.driver.findElement(fatherOccupation).sendKeys(FatherOccupation);
	}

	public void usersOtherDetails(String Password,String ConfirmPassword) {

		Select select2=new Select(Constants.driver.findElement(usersStaus));
		select2.selectByVisibleText("Active");

		Constants.driver.findElement(userPassword).sendKeys(Password);
		Constants.driver.findElement(usersConfirmPassword).sendKeys(ConfirmPassword);
	}

	public void userSubmitTab() {
		Constants.driver.findElement(submit).click();
	}



	//	public void userPagePersonalDetails() {
	//		Constants.driver.findElement(name).sendKeys("Ashwini");
	//		Constants.driver.findElement(mobileNo).sendKeys("9887766512");
	//		Constants.driver.findElement(email).sendKeys("ash@gmail.com");
	//		select=new Select(Constants.driver.findElement(role));
	//		select.selectByVisibleText("admin");
	//		//Constants.select.selectByVisibleText("admin");
	//		Constants.driver.findElement(joiningDate).click();
	//		Constants.driver.findElement(joiningDate).sendKeys("12-07-2021");
	//		Constants.driver.findElement(bloodGroup).click();
	//		Select select1=new Select(Constants.driver.findElement(bloodGroup));
	//		select1.selectByVisibleText("O positive");	
	//		// Constants.select.selectByVisibleText("O positive");
	//	}
	//	public void usersBankDetails() {
	//		Constants.driver.findElement(bankName).sendKeys("JalgavBank");
	//		Constants.driver.findElement(accountNumber).sendKeys("010101011");
	//		Constants.driver.findElement(ifsc).sendKeys("JJSB0000033");
	//	}
	//	public void userDocuments() {
	//		//JavascriptExecutor js=((JavascriptExecutor)Constants.driver);
	//		//js.executeScript("window.scroll(0,600)");
	//		Constants.driver.findElement(Choosefile).sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
	//		Constants.driver.findElement(agreement).sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
	//		Constants.driver.findElement(kyc).sendKeys("C:\\Users\\Lenovo\\Desktop\\Resume_Ashwini.pdf");
	//	}
	//	public void usersFatherDetails() {
	//		Constants.driver.findElement(fatherName).sendKeys("madhavrao");
	//		Constants.driver.findElement(fatherMobilerNo).sendKeys("9685746352");
	//		Constants.driver.findElement(fatherOccupation).sendKeys("highSchoolTeacher");
	//	}
	//	public void usersOtherDetails() {
	//		Select select2=new Select(Constants.driver.findElement(usersStaus));
	//		select2.selectByVisibleText("Active");
	//		Constants.driver.findElement(userPassword).sendKeys("bholenath");
	//		Constants.driver.findElement(usersConfirmPassword).sendKeys("bholenath");
	//	}
	//	public void userSubmitTab() {
	//		Constants.driver.findElement(submit).click();
	//	}
	//	
	/*
	 * For Search Button on users page
	 */

	public void searchButtonOnUsersPage(String value ) {
		//Constants.driver.findElement(Search).click();
		Constants.driver.findElement(Search).sendKeys(value);

	}

	public void clickOnViewRecordButton() {

		//Constants.driver.findElement(Search).sendKeys(value);
		Constants.driver.findElement(ViewButton).click();

	}
	public void clickOnEditRecordButton(){
		Constants.driver.findElement(EdidButton).click();

	}
	public void clickOnDeleteRecordButton(){
		JavascriptExecutor js=((JavascriptExecutor)Constants.driver);
		js.executeScript("window.scroll(0,600)");
		Constants.driver.findElement(DeleteButton).click();
	}



}
