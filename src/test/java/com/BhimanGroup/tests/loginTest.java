package com.BhimanGroup.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.loginPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

public class loginTest extends MainBase {
	loginPage login;

	public loginTest() {
		super();
		PageFactory.initElements(Constants.driver, loginPage.class);
		//loginTest test =new loginTest();
	}

	@BeforeMethod
	public void setUp() {
		openBrowser();
		launchUrl();
		maximize();
		login=PageFactory.initElements(Constants.driver, loginPage.class);
		impilicitWait();
	
	}

	@Test(dataProvider="loginTestData",dataProviderClass=loginTest.class)
	public void LoginWithValidInvaliTestdDP(String UserName, String Password) {
	      login.LoginForDP(UserName, Password);
	
	
		//String actualTitle=Constants.driver.getTitle();
		//String expectedTitle="Bhiman Admin";
		//Assert.assertEquals(actualTitle, expectedTitle);
		//System.err.println("Invalid username and password");
		
		Assert.assertTrue(Constants.driver.findElement(By.xpath("//img[@class='logo-icon margin-r-10']")).isDisplayed(),"homepage not lounch");
	}

	@DataProvider(name = "loginTestData")
	public Object[][] gettext() {
		return Testutil.getValidInvalidTestDataFromExcel();

	}
	
	//@Test(priority=1)
	//public void ValidCredentailLoginTest() {
		
		//login.LoginDetails();
		//login.LoginDetails(Constants.prop.getProperty("username"),Constants.prop.getProperty("password"));
		//Assert.assertTrue(Constants.driver.findElement(By.xpath("//img[@class='logo-icon margin-r-10']")).isDisplayed(),"homepage not lounch");
	//}
	
	

	@AfterMethod
	public void closeBrowser() {
		MainBase.tearDown();
	}

}