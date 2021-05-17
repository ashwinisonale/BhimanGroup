package com.BhimanGroup.mainBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BhimanGroup.Pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainBase {
		
		static {
			Constants.prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream("src\\main\\resources\\config.properties");
				Constants.prop.load(fis);					
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void openBrowser() {
			String browserName=Constants.prop.getProperty("browser");
			switch (browserName) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				Constants.driver= new ChromeDriver();
				break;
				
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				Constants.driver= new FirefoxDriver();
				break;
				
			case "IE":
				WebDriverManager.iedriver().setup();
				Constants.driver= new InternetExplorerDriver();
				break;
				
			case "Edge":
				WebDriverManager.edgedriver().setup();
				Constants.driver= new EdgeDriver();
				break;
				
			case "Safari":
				Constants.driver= new SafariDriver();
				
			case "HtmlUnit":
				Constants.driver= new HtmlUnitDriver();
				break;
				
			default:
				System.err.println("Invalid browser name");
				break;
			}
			
		}
		
		public static void browserSpecificInfo() {
			openBrowser();
			launchUrl();
			windowMaximize();
			deleteAllCookies();
			impilicitWait();
		}
		
		public static void loginFlow(String user, String pass) {
			browserSpecificInfo();
			LoginPage loginPage = PageFactory.initElements(Constants.driver, LoginPage.class);
			loginPage.executeLoginFlow(user, pass);
		}
		
		public static void launchUrl() {
		     Constants.driver.get(Constants.prop.getProperty("url"));
		}
		
		public static void windowMaximize() {
			Constants.driver.manage().window().maximize();
		}
		
		public static void deleteAllCookies() {
			Constants.driver.manage().deleteAllCookies();
		}
		
		public static void impilicitWait() {
			Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public static void explicitWait() {
			WebDriverWait waits = new WebDriverWait(Constants.driver, 10);
		}
		
		public static void tearDown() {
			Constants.driver.close();
		}

	}


