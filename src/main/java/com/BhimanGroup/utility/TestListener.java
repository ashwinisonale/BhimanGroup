package com.BhimanGroup.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.BhimanGroup.mainBase.MainBase;

public class TestListener extends screenShot implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("passed  testcases"+ result.getName());
		try {
		takeScreenShot(result.getMethod().getMethodName());
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed Test case"+result.getName());
		
	try {
		
		failedTestCase(result.getMethod().getMethodName());
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
