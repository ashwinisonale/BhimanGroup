package com.BhimanGroup.tests;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.BankPage;
import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class BankTest extends MainBase{
	MasterPage master =new MasterPage();
	BankPage bank= new BankPage();




	public BankTest() {
		super();
		//PageFactory.initElements(Constants.driver, MasterPage.class);

	}

	@BeforeClass
	public void setUp() {

		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);

		master = PageFactory.initElements(Constants.driver, MasterPage.class);
	}


	@Test(priority=1)
	public void ClickOnMasterTab() {
		
		master.clickOnMasterTab();
		master.clickOnBankTab();

		bank.AddBank();
	}




	@Test(priority=2,dataProvider="InValidBankTestData")
	public void InValidBankCredentialsTest(String BankName, String AccountHolderName,String AccountNo, String BankaccountType,String IFSCCode,String MIRCCode) {
		bank.executeBankFlow(BankName,AccountHolderName,AccountNo,BankaccountType,IFSCCode,MIRCCode);	
		
		Constants.driver.switchTo().alert().accept();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@DataProvider(name = "InValidBankTestData")
	public Object[][] gettext() {
		String excelFilePath = "D:\\Selenium java prog\\BhimanGroup\\src\\main\\java\\com\\BhimanaGroup\\testData\\InValidBankTestData.xlsx";
		String sheetName = "Bank";
		Integer colNumber=6;
		return Testutil.getValidInvalidTestDataFromExcel(excelFilePath, sheetName, colNumber);
	
	}
  
	@Test(priority=3)
	public void NewScreenshot() {


		AShot ashot=new AShot();
		Screenshot sc=ashot.takeScreenshot(Constants.driver);

		try {
			ImageIO.write(sc.getImage(),"PNG", new File("D:\\Selenium java prog\\BhimanGroup\\src\\main\\java\\Screenshots\\bank_Screenshot"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@AfterClass
	public void closeBrowser() {
	}


}
