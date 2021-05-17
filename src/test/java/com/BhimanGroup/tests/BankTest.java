package com.BhimanGroup.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.BankPage;
import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class BankTest extends MainBase{
	loginTest test;
	MasterPage master =new MasterPage();
	BankPage bank= new BankPage();


	

	public BankTest() {
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
	public void ClickOnMasterTab() {
	  bank.ClickOnMasterTab();
	}
	

	@Test(priority=2)
	public void ClickOnBankTabTest(){	
		bank.clickOnBankTab();
		}
	
	@Test(priority=3)
	public void ClickOnAddBankTab() {
		bank.clickOnAddBankTab();
	}
	
	@Test(priority=4)
	public void verifytitletext() {
		boolean text = bank.verifyTitleText();
		Assert.assertTrue(text);
		String title=Constants.driver.getTitle();
		Assert.assertEquals(title, "Banks");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  @AfterClass
	public void closeBrowser() {
	}

	
}
