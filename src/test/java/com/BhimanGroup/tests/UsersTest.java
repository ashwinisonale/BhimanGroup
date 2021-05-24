package com.BhimanGroup.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.Pages.UsersPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class UsersTest extends MainBase {


	UsersPage userPage;	
	//MasterTest test=new MasterTest();
	MasterPage masterPage=new MasterPage(); 
	
	@BeforeClass	
	public void BrowserSetUp() {
		
		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);
		userPage=PageFactory.initElements(Constants.driver, UsersPage.class);
		masterPage.clickOnMasterTab();
		masterPage.clickOnUserTab();
	}
	@Test
	public void AddUserButtonTest() {
		implicitWait();
		userPage.AddUserButtonTab();
		userPage.userPagePersonalDetails();
		userPage.usersBankDetails();
		implicitWait();
		userPage.userDocuments();
		implicitWait();
		userPage.usersFatherDetails();
		userPage.usersOtherDetails();
	}


     @AfterClass
     public void closeWindow() {
	//tearDown();
}


}