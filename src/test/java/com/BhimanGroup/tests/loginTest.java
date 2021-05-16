package com.BhimanGroup.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.loginPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

public class loginTest extends MainBase{
	loginPage login;

	public loginTest() {
		super();
		PageFactory.initElements(Constants.driver, loginPage.class);
	}

	@BeforeClass
	public void setUp() {
		browserSpecificInfo();
		login=PageFactory.initElements(Constants.driver, loginPage.class);
		impilicitWait();
	
	}
//
//	@Test(dataProvider="loginTestData",dataProviderClass=loginTest.class)
//	public void LoginPageDetailsTest(String UserName, String Password) {
//		login.LoginDetails(UserName, Password);
//		
//		/*String actualTitle=Constants.driver.getTitle();
//		String expectedTitle="Bhiman Admin";
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.err.println("Invalid username and password");*/
//		
//		
//		boolean PNl = Constants.driver.findElement(By.xpath("//img[@class='logo-icon margin-r-10']")).isDisplayed();
//		Assert.assertTrue(PNl,"homepage not lounch");
//	}
//	
		
	//Please Enter Proper Mobile Number
	//Your password must be at least 5 characters long 
	
	@Test(priority=1,dataProvider="InvalidloginTestData")
	public void invalidLoginCredentialsTest(String UserName, String Password) {
		login.executeLoginFlow(UserName, Password);		
	}

	@DataProvider(name = "InvalidloginTestData")
	public Object[][] gettext() {
		return Testutil.getValidInvalidTestDataFromExcel();

	}
	
	@Test(priority=2)
	public void ValidLoginCredentailTest() {
		login.executeLoginFlow(Constants.prop.getProperty("username"),Constants.prop.getProperty("password"));
		
		boolean text = login.verifyDashboardText();
		Assert.assertTrue(text);
		
		login.clickOnLogoutLink();
	}
	

	@AfterClass
	public void closeBrowser() {
		tearDown();
	}

}