package com.BhimanGroup.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.BhimanGroup.Pages.Customer;
import com.BhimanGroup.Pages.MasterPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;
import com.BhimanGroup.utility.Testutil;

//@Listeners(com.BhimanGroup.utility.Listeners.class)
public class customerTest extends MainBase{
	MasterPage masterpage=new MasterPage();
	Customer page=new Customer();
	public customerTest() {
		super();
	}
	
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		String user = Constants.prop.getProperty("username");
		String pass = Constants.prop.getProperty("password");
		loginFlow(user, pass);
	     masterpage.clickOnCustomerTab();
  }
	
	@Test(priority=1)
	public void verifyTitleOfTheCustomerPage()  {
	    
	    String Title=Constants.driver.getTitle();
	    Assert.assertEquals(Title, "Customers");
	    System.out.println("Title of the customer page:"+Title);
	   }
	@Test(priority=2)
	public void CountNoOfRecords() {
		page.countTotalNoofRecords();
	}
	
	@Test(priority=2,dataProvider="ValidCustomerTestData",enabled=false)
	public void customerPersonalDeatils(String customer_name,String Customer_MobNo,String Customer_Email,String Customer_Address,String State,String District,String Taluka,String City,String pincode
			,String  Birthdate,String Anniversary_date,String Occupation) throws InterruptedException
	{
		 page.clickOnAddCustomer();
	page.customerPersonalDeatils(customer_name,Customer_MobNo,Customer_Email);
	page.customerAddress(Customer_Address,State,District,Taluka,City,pincode);
	page.customerOtherDeatils(Birthdate,Anniversary_date,Occupation);
	page.clickOnSubmit();
	page.clickOnOkBtn();
     implicitWait(5);
    
     	try {
		if(Constants.driver.findElement(By.xpath("//a[normalize-space()='View Customers']")).isDisplayed())
		{		
		Constants.driver.findElement(By.xpath("//a[normalize-space()='View Customers']")).click();
		Constants.driver.findElement(By.xpath("//a[contains(text(),'Add Customers')]")).click();
		//implicitWait(3);
		}
	}
	catch(Exception e)
	{
		//implicitWait(4);
		Constants.driver.findElement(By.xpath("//a[contains(text(),'Add Customers')]")).click();
		Constants.driver.findElement(By.xpath("//a[contains(text(),'Add Customers')]")).click();
	}
     	

  }

	@DataProvider(name = "ValidCustomerTestData")
	public Object[][] gettext() {
		String excelFilePath = "src\\main\\java\\com\\"
				+ "BhimanaGroup\\testData\\BhimanGroupCustomer.xlsx";
		String sheetName = "Sheet1";
		Integer colNumber=12;
		return Testutil.getValidInvalidTestDataFromExcel(excelFilePath, sheetName, colNumber);
	}
	
	
	@Test(priority=3)
	public void editCustomerInfo() throws InterruptedException {
		
		page.clickOnEditIcon("207");
		page.editinfo();
		page.clickOnSubmit();
		Constants.driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Constants.driver.findElement(By.xpath("//a[normalize-space()='View Customers']")).click();
		
		
	}
	
	@Test(priority=4)
	public void verifyViewIconToViewCustomer() throws IOException {
		page.clickOnSearch("Ashwini");
		page.clickOnViewImage();//view particular Record
		page.clickOnClose();
		
		}
	@Test(priority=5,enabled=false)
	public void verifyDeletedCustomerName() {
	   implicitWait(2);
		page.clickOnSearch("208");
		page.clickOnDelete();
		Constants.driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		
	}
	
	@Test(priority=6)
	public void toVerifyAllTheBtnOnCustomerViewPage() {
		page.verifyAllButtonsOnCustomerViewPage();
	}
	
}