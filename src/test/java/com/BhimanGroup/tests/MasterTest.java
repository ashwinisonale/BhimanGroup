package com.BhimanGroup.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class MasterTest extends MainBase{
	LoginTest test;
	MasterPage master = null;

	@BeforeClass
	public void setUp() {

		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);
		
		master = PageFactory.initElements(Constants.driver, MasterPage.class);
		
	}
	
	@Test(priority=1)
	public void ClickOnMasterTabTest(){	
		master.clickOnMasterTab();
		
		 
		master.clickOnUserTab();
		master.clickOnBankTab();
		master.clickOnBranchesTab();
		master.clickOnCustomerTab();
		master.clickOnBranchesTab();
		master.clickOnVendorsTab();
		master.clickOnEnquiryTab();
		master.clickOnProjectsTab();
		
	}




	@AfterClass
	public void closeBrowser() {
		tearDown();
	}
}



