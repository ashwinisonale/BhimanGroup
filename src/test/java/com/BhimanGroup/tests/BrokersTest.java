package com.BhimanGroup.tests;

import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BhimGroup.tableFramework.DataTable;
import com.BhimanGroup.Pages.BrokersPage;
import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.screenShot;


@Listeners(com.BhimanGroup.utility.TestListener.class)
public class BrokersTest extends MainBase {

	BrokersPage brokerspage;
	MasterPage masterPage = new MasterPage();
	screenShot screen = new screenShot();


	@BeforeClass
	public void BrowserSetUp() {

		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);
		brokerspage = PageFactory.initElements(Constants.driver, BrokersPage.class);
		masterPage.clickOnBrokersTab();

	}
	@Test(priority=1)
	public void ClickOnAddBrokerButton(){
		brokerspage .ClickOnAddBroker();
	}
	@Test(priority=2)
	public void BrokersformDetailsPage() throws InterruptedException{
		brokerspage.BrokersPersonalDetailsPage();
		brokerspage.BankDetailsOfBrokersPage();
		brokerspage.DocumentsDetails();
		brokerspage.SubmitButtonOnBrokerPage();
		//Constants.driver.switchTo().alert().accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Constants.driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(1000);
		screenShot.getCurrentDateOrTime();

		brokerspage.ViewBrokerButton();
	}
	@Test(priority=3)
	public void ClickOnCopyButtonOnBrokersPage() {
		brokerspage.CopyButtonOnBrokersPage();
	}

	@Test(priority=4)
	public void clickOnExcelbuttonOnBrokersPage() {
		brokerspage.ExcelbuttonOnBrokersPage();
	}
	@Test(priority=5)
	public void ClickOncSvButtonOnBrokersPage() {
		brokerspage.cSvButtonOnBrokersPage();
	}
	@Test(priority=6)
	public void ClickOnPdfButtonOnBrokersPage() {
		brokerspage.PdfButtonOnBrokersPage();
	}
	
	@Test(priority=7)
	public void ClickOnPrintButtonOnBorkersPage() {
		brokerspage.PrintButtonOnBorkersPage();
	}
	
	@AfterClass
	public void closeWindow() {
		//tearDown();
	}

}