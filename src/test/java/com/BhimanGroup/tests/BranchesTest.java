package com.BhimanGroup.tests;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BhimGroup.tableFramework.DataTable;
import com.BhimanGroup.Pages.BranchesPage;
import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

public class BranchesTest extends MainBase{

	MasterPage masterPage=new MasterPage();
	BranchesPage branchPage=null;

	@BeforeClass
	private void setUp() {

		String user=Constants.prop.getProperty("username");
		String pass=Constants.prop.getProperty("password");
		loginFlow(user, pass);
		branchPage=PageFactory.initElements(Constants.driver, BranchesPage.class);
		masterPage.clickOnMasterTab();
	}


	@Test(priority=1, dataProvider = "BranchDetails")
	public void addBranchDetailsTest(String BranchName, String Address, String City,
			    String ContactNumber, String AlternateContactNumber, String EmailId) {
		masterPage.clickOnBranchesTab();
		branchPage.populateData(BranchName, Address, City, ContactNumber, AlternateContactNumber, EmailId);
		branchPage.clickOnSubmit();


	}

	@DataProvider(name="BranchDetails")
	Object[][] getBranchDetails(){
		String path="src\\main\\java\\"
				+"com\\BhimanaGroup\\testData\\AddingBranchesInBhiman.xlsx";
		String sheetName="Sheet1";
		Integer colNumber=6;
		return Testutil.getValidInvalidTestDataFromExcel(path, sheetName, colNumber);

	}

	@Test(priority=2)
	public void searchRecordTest() {
		masterPage.clickOnBranchesTab();
		String searchKeyword = "Pune";
		branchPage.clickOnSearchBoxTextbox(searchKeyword);
		implicitWait(6);
		DataTable table = new DataTable("datatable3");
		table.getData().stream().forEach(System.out::println);
		boolean present = true;
		for(Map<String, String> map : table.getData() ) {
			if(!map.get("Branch Name").contains(searchKeyword) && !map.get("Address").contains(searchKeyword))
				Assert.assertTrue(false,"Search Failed.");

		}

	}
	
	@AfterClass
	public void closeBrowser() {
		tearDown();
	}

}

