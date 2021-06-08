package com.BhimanGroup.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.Pages.UsersPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.TestListener;
import com.BhimanGroup.utility.Testutil;
import com.BhimanGroup.utility.screenShot;

@Listeners(com.BhimanGroup.utility.TestListener.class)
public class UsersTest extends MainBase {

	UsersPage userPage;
	MasterPage masterPage = new MasterPage();
	screenShot screen = new screenShot();

	@BeforeClass
	public void BrowserSetUp() {

		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);
		userPage = PageFactory.initElements(Constants.driver, UsersPage.class);

		masterPage.clickOnMasterTab();
		masterPage.clickOnUserTab();

	}

	@Test(priority = 1)
	public void AddUserButtonTest() {
		implicitWait();
		userPage.AddUserButtonTab();
	}



	//@Test(priority=2)
	//	public void usersFormDetailsPageTest()
	//	{
	//		userPage.userPagePersonalDetails();
	//		userPage.usersBankDetails();
	//		implicitWait();
	//		userPage.userDocuments();
	//		implicitWait();
	//		userPage.usersFatherDetails();
	//		userPage.usersOtherDetails();
	//		userPage.userSubmitTab();

	//@Test(priority=2,dataProvider="UsersDataForNewRecords")
	public void usersFormDetailsPageTest(String Name,String MobileNumber,String EmailId,String Role,
			String JoiningDate,String BloodGroup,String BankName,String AccountNumber,String IFSCCode,
			String Resume,String Agreement,String KYC,String FatherName,String MobileNumber1,String FatherOccupation,
			String Status,String Password,String ConfirmPassword) throws InterruptedException
	{
		userPage.userPagePersonalDetails(Name,MobileNumber,EmailId,Role,JoiningDate,BloodGroup);
		userPage.usersBankDetails(BankName,AccountNumber,IFSCCode);
		implicitWait();
		userPage.userDocuments(Resume,Agreement,KYC);
		implicitWait();
		userPage.usersFatherDetails(FatherName,MobileNumber1,FatherOccupation);
		userPage.usersOtherDetails(Password,ConfirmPassword);
		userPage.userSubmitTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//button[normalize-space()='OK']
		Constants.driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(500);
		try {
			if(Constants.driver.findElement(By.cssSelector("#view_btn")).isDisplayed())
			{		
				Constants.driver.findElement(By.cssSelector("#view_btn")).click();
				Constants.driver.findElement(By.cssSelector("#add_btn")).click();
			}
		}
		catch(Exception e)
		{
			Thread.sleep(2000);
			Constants.driver.findElement(By.xpath("//button[normalize-space()='Add User']")).click();
			Constants.driver.findElement(By.xpath("//button[normalize-space()='Add User']")).click();

		}

	}

	//@DataProvider(name = "UsersDataForNewRecords")
	public Object[][] gettext() {
		String excelFilePath = "src\\main\\java\\com\\" + "BhimanaGroup\\testData\\BhimanGroup.xlsx";
		String sheetName = "UsersDetails";
		Integer colNumber = 18;
		return Testutil.getValidInvalidTestDataFromExcel(excelFilePath, sheetName, colNumber);
	}

	@Test(priority = 3)
	public void searchButtonOnUsersTest() {
		String Title = Constants.driver.getTitle();
		// Assert.assertEquals(Title, "user");
		// implicitWait()
		userPage.searchButtonOnUsersPage("nagesh");
	}

	//@Test(priority = 4)
	public void clickOnViewRecordButtonTest() {
		userPage.clickOnDeleteRecordButton();
	}

	//@Test(priority=5)	
	public void clickOnEditRecordButtonTest(){
		userPage.clickOnEditRecordButton();
		userPage.userSubmitTab();

		//screen.takeScreenShot("");
	}
	@Test(priority=6)
	public void clickOnDeleteRecordButtonTest() {
		userPage.clickOnDeleteRecordButton();
	}

	@Test(priority=7)
	public void ClickOnCopyButtonOnBrokersPage() {
		userPage.CopyButtonOnUsersPage();
	}

	@Test(priority=8)
	public void clickOnExcelbuttonOnBrokersPage() {
		userPage.ExcelbuttonOnUsersPage();
	}
	
	@Test(priority=9)
	public void ClickOncSvButtonOnusersPage() {
		userPage.cSvButtonOnUsersPage();

	}
	@Test(priority=10)
	public void ClickOnPdfButtonOnUsersPage() {
		userPage.PdfButtonOnUsersPage();
	}

	@Test(priority=11)
	public void ClickOnPrintButtonOnUsersPage() {
		userPage.PrintButtonOnUsersPage();
	}

	@AfterClass
	public void closeWindow() {
		// tearDown();
	}

}