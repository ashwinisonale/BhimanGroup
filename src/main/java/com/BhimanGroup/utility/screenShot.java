package com.BhimanGroup.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.BhimanGroup.mainBase.Constants;

public class screenShot {

	public static void takeScreenShot(String testMethodname){
		
		File file=((TakesScreenshot)Constants.driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(file, new File("C:\\Users\\Lenovo\\eclipse-projects\\com.BhimanGroup"
					+ ""
					+ "\\src\\main\\resources\\screenShot\\"+testMethodname+".png"));
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
		
	public  static String getCurrentDateOrTime() {
		
		DateFormat formate=new SimpleDateFormat("mm_dd_yyyy_hh_mm_ss");
		Date currentdate=new Date();
		return formate.format(currentdate);
	}
	
	public static void failedTestCase(String testMethodname) {
		takeScreenShot(testMethodname );
			
	}
	
}
	