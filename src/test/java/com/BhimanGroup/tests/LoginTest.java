package com.BhimanGroup.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BhimanGroup.Pages.LoginPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

public class LoginTest extends MainBase{
	LoginPage login;

	@BeforeClass
	public void setUp() {
		browserSpecificInfo();
		login=PageFactory.initElements(Constants.driver, LoginPage.class);
		impilicitWait();
	}
	
	@Test(priority=1,dataProvider="InvalidloginTestData")
	public void invalidLoginCredentialsTest(String UserName, String Password) {
		login.executeLoginFlow(UserName, Password);		
	}

	@DataProvider(name = "InvalidloginTestData")
	public Object[][] gettext() {
		return Testutil.getValidInvalidTestDataFromExcel();
	}
	
	@Test(priority=2)
	public void validLoginCredentailTest() {
		login.executeLoginFlow(Constants.prop.getProperty("username"),Constants.prop.getProperty("password"));

		String title=Constants.driver.getTitle();	
		Assert.assertEquals(title, "Bhiman Admin Login page");
		
		login.clickOnLogoutLink();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		tearDown();
	}

}