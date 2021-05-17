package com.BhimanGroup.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BhimanGroup.Pages.Master;

import com.BhimanGroup.Pages.loginPage;
import com.BhimanGroup.mainBase.Constants;
import com.BhimanGroup.mainBase.MainBase;

public class MastersTest extends MainBase {

	Master page=new Master();
	loginTest login;
	
	public MastersTest() {
		super();
		 }
	
	@BeforeClass
	public void setUp() {
	login=new loginTest();
	login.setUp();
	login.ValidLoginCredentailTest();
	
	   }
	
	
	@Test
	public void clicktoMasters() throws InterruptedException {
         page.moveToMasters();
      }
	
	@Test
	public void getAllElementList() {
		page.allElementsFromMastersList("Customers");
	}
	
}