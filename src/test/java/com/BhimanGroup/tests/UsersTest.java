package com.BhimanGroup.tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.Pages.UsersPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.screenShot;


public class UsersTest extends MainBase {


	UsersPage userPage;	
	MasterPage masterPage=new MasterPage(); 
	screenShot screen=new screenShot();


	@BeforeClass	
	public void BrowserSetUp() {

		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);
		userPage=PageFactory.initElements(Constants.driver, UsersPage.class);



		masterPage.clickOnMasterTab();
		masterPage.clickOnUserTab();
		
	}
	@Test(priority=1,enabled=false)
	public void AddUserButtonTest() {
		implicitWait();
		userPage.AddUserButtonTab();
	}	

	@Test(priority=2,enabled=false)
	public void usersFormDetailsPageTest()
	{
		userPage.userPagePersonalDetails();
		userPage.usersBankDetails();
		implicitWait();
		userPage.userDocuments();
		implicitWait();
		userPage.usersFatherDetails();
		userPage.usersOtherDetails();
		userPage.userSubmitTab();
	}

 @Test(priority=3)
  public void searchButtonOnUsersTest(){
	//implicitWait();
	userPage.searchButtonOnUsersPage("ashwini");
	screen.takeScreenShot();
	
}

	@AfterClass
	public void closeWindow() {
		//tearDown();
	}


}