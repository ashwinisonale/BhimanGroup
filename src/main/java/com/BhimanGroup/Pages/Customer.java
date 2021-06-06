package com.BhimanGroup.Pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;

public class Customer {

	By  customer=By.xpath("//a[normalize-space()='Customers']");

	By add_customer=By.xpath("//a[contains(text(),'Add Customers')]");

	By customer_name=By.name("customer_name");

	By customer_MobileNo=By.name("mobile_no");

	By customer_Email=By.name("email");

	By customer_Address=By.name("address");

	By state=By.name("state");

	By district=By.name("district");

	By taluka=By.name("taluka");

	By city=By.name("city");

	By pincode=By.name("pincode");

	By birthDate=By.name("birth_date");

	By anniversaryDate=By.name("anniversary_date");

	By occupation=By.name("occupation");
	
	By submit=By.name("add_customer");

	By cancel=By.id("Reset");
	
	By deleteIcon=By.xpath("//button[@class='btn btn-danger btn-border btn-rounded btn-xs deleteBtn']");
	
	By viewUser=By.xpath("//a[normalize-space()='View Customers']");
	
	By viewIcon=By.xpath("//tbody/tr[1]/td[7]/button[1]/i[1]");
	
    By closeOnViewBtn=By.xpath("//button[contains(text(),'Close')]");
   
	
	By editIcon=By.xpath("//tbody/tr[1]/td[7]/button[2]/i[1]");
	
	By okbtn=By.xpath("//button[contains(text(),'OK')]");
	
	By  row=By.xpath("//table[@id='datatable3']/tbody/tr");
	
	By search=By.xpath("//input[@type='search']");
	
	By copy=By.xpath("//span[normalize-space()='Copy']");
	By excel=By.xpath("//span[normalize-space()='Excel']");
	By csv=By.xpath("//button[@class='dt-button buttons-csv buttons-html5']");
	By pdf=By.xpath("//span[normalize-space()='PDF']");
	By print=By.xpath("//span[normalize-space()='Print']");
    
	public void clickOnAddCustomer()  {
        Constants.driver.findElement(add_customer).click();
	}

    public void customerPersonalDeatils(String Customer_name,String Customer_MobNo,String Customer_Email) {
        Constants.driver.findElement(customer_name).sendKeys(Customer_name);
        Constants.driver.findElement(customer_MobileNo).sendKeys(Customer_MobNo);
	    Constants.driver.findElement(customer_Email).sendKeys(Customer_Email);
		
	}
	public void customerAddress(String Customer_Address,String State,String District,String Taluka,String City,String Pincode) {
		Constants.driver.findElement(customer_Address).sendKeys(Customer_Address);
		Constants.driver.findElement(state).sendKeys(State);
		Constants.driver.findElement(district).sendKeys(District);
		Constants.driver.findElement(taluka).sendKeys(Taluka);
	    Constants.driver.findElement(city).sendKeys(City);
		Constants.driver.findElement(pincode).sendKeys(Pincode);
	
	}
	public void customerOtherDeatils(String  Birthdate,String Anniversary_date,String Occupation) {
		Constants.driver.findElement(birthDate).sendKeys(Birthdate);
		Constants.driver.findElement(anniversaryDate).sendKeys(Anniversary_date);
		Constants.driver.findElement(occupation).sendKeys(Occupation);
	
		 }
	
	public void clickOnSubmit() {
		JavascriptExecutor js=((JavascriptExecutor)Constants.driver);
			js.executeScript("window.scroll(0,500)");
            Constants.driver.findElement(submit).click();
		}
	
	public void clickOnOkBtn() {
		Constants.driver.findElement(okbtn).click();
	}
	public void clickOnSearch(String value) {
		Constants.driver.findElement(search).click();
		Constants.driver.findElement(search).sendKeys(value);
		Constants.driver.findElement(search).clear();
	}
	public  void clickOnDelete() {
		Constants.driver.findElement(deleteIcon).click();
		Constants.driver.switchTo().alert().accept();
	}
	public void clickOnViewImage() {
		Constants.driver.findElement(viewIcon).click();
		
		
	}
	public void clickOnClose() {
		
		
		Constants.driver.findElement(closeOnViewBtn).click();
		Constants.driver.switchTo().activeElement().click();
		
	
		}
	
	public void clickOnEditIcon(String value) {
		Constants.driver.findElement(search).sendKeys(value);
	}
	public void editinfo() {
		Constants.driver.findElement(editIcon).click();
		Constants.driver.findElement(occupation).clear();
		Constants.driver.findElement(occupation).sendKeys("conductor");
		
		
	}
	
	public void clickOnViewUser() {
		Constants.driver.findElement(viewUser).click();
	}
	
	public void verifyAllButtonsOnCustomerViewPage() {
		Constants.driver.findElement(copy).isDisplayed();
	    Point locationofCopyfile=Constants.driver.findElement(copy).getLocation();
	    
	    Constants.driver.findElement(excel).isDisplayed();
	   Point locationofexcelfile= Constants.driver.findElement(excel).getLocation();
	   
	    Constants.driver.findElement(csv).isDisplayed();
	    Point locationofcsvfile= Constants.driver.findElement(excel).getLocation();
	    
		Constants.driver.findElement(pdf).isDisplayed();
		 Point locationofpdffile= Constants.driver.findElement(excel).getLocation();
		 
		Constants.driver.findElement(print).isDisplayed();
		 Point locationofprintbtn= Constants.driver.findElement(excel).getLocation();
		 
		System.out.println("Location of COPY Btn:"+locationofCopyfile +"Location of excel Btn"+locationofexcelfile +"Location of CSV Btn:"+locationofcsvfile
			+"Location of PDF Btn:"	+locationofpdffile +"Location of Print Btn:");
	}
	public void countTotalNoofRecords() {
		
		List<WebElement> rowCount=Constants.driver.findElements(row);
		System.out.println("Total no of Records:"+rowCount.size());
		
	 
		
	}
 
}