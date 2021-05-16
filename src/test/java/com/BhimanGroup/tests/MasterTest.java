package com.BhimanGroup.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.Pages.loginPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

public class MasterTest extends MainBase{
	loginTest test;
	MasterPage master =new MasterPage();



	public MasterTest() {
		super();
		//PageFactory.initElements(Constants.driver, MasterPage.class);

	}

	@BeforeClass
	public void setUp() {

		//browserSpecificInfo();
		loginTest test= new loginTest();
		test.setUp();
		test.ValidLoginCredentailTest();

	}
	@Test(priority=1)
	public void ClickOnMasterTabTest(){	
		master.ClickOnMasterTab();
		
		master.clickOnBankTab(); 
		master.clickOnUserTab();
		master.clickOnBranchesTab();
		master.clickOnCustomerTab();
		master.clickOnBranchesTab();
		master.clickOnVendorsTab();
		master.clickOnEnquiryTab();
		master.clickOnProjectsTab();
		
	}




	@AfterClass
	public void closeBrowser() {
		//tearDown();
	}
}



