package com.BhimanGroup.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BhimanGroup.mainBase.MainBase;

public class BankPage extends MainBase{
	
	@FindBy(xpath="name=\"bank_name\"")
	WebElement bankName;
	
	@FindBy(xpath="//input[@name='account_name']")
	WebElement AccountholderName;

}
