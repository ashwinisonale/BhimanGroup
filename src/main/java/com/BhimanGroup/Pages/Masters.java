package com.BhimanGroup.Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BhimanGroup.mainBase.Constants;

public class Masters {
	
	//public static WebElement element;
	
	@FindBy(xpath="//a//span[contains(text(),'Masters')]")
	WebElement masters;
	

	By master=By.xpath("//a//span[contains(text(),'Masters')]");
	
	
	@FindBy(xpath="//*[@id=\"respMenu\"]/li[2]/ul")
	WebElement  listsOfMastersTab;
	
	public Masters() {
		//PageFactory.initElements(Constants.driver, Masters.class);
	}
	
	public void moveToMasters() throws InterruptedException {
	   Constants.action=new  Actions(Constants.driver);
       Constants.action.moveToElement(Constants.driver.findElement(master)).build().perform();
   }
	
	//public static String element;

	public void allElementsFromMastersList(String element) {
		 List<WebElement>	alllist=Constants.driver.findElements(By.cssSelector("body > div:nth-child(3) > nav:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > ul:nth-child(2)"));
		 for(WebElement listsOfMastersTab:alllist) {
		  
				
					element=listsOfMastersTab.getText();
					System.out.println(element);
					
				String str=listsOfMastersTab.getText();
				
				
				if(str.equals(listsOfMastersTab.getText())) {
					 Constants.driver.findElement(By.xpath("//a[contains(text(),'Banks ')]")).click();
					 
		 }
		       switch(str) {
				 case "Banks":
					 Constants.driver.findElement(By.xpath("//a[contains(text(),'Banks ')]")).click();
					 break;
				 case "Users":
					 Constants.driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
					 break;	 
				 case " Branches":
						 Constants.driver.findElement(By.xpath("//a[contains(text(),'Branches')]")).click();
						 break;	
				 case " Customers":
						 Constants.driver.findElement(By.xpath("//a[normalize-space()='Customers']")).click();
						 break;	
				case " Brokers":
							 Constants.driver.findElement(By.xpath("//a[normalize-space()='Brokers']")).click();
							 break;	
					case " Vendors":
							 Constants.driver.findElement(By.xpath("//a[normalize-space()='Vendors']")).click();
							 break;	
					case " Enquiry":
							 Constants.driver.findElement(By.xpath("//a[normalize-space()='Enquiry']")).click();
							 break;	
				    case " Projects":
								 Constants.driver.findElement(By.xpath("//a[normalize-space()='Projects']")).click();
								 break;	
					default:
						System.err.println("Invalid submenu");
						break;
				 }
				
					//}
		 
		 }
				 
				 
			}
			 
			 
		 }
		



