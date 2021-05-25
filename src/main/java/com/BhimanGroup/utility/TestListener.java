package com.BhimanGroup.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.BhimanGroup.mainBase.MainBase;

public class TestListener extends screenShot implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
<<<<<<< HEAD

=======
		
>>>>>>> 00e2270e8fd7909570f8aa4b036d7ae89bf1370e
	}

	@Override
	public void onTestSuccess(ITestResult result) {
<<<<<<< HEAD

		System.out.println("passed  testcases"+ result.getName());
		try {
			takeScreenShot(result.getMethod().getMethodName());

		}catch(Exception e) {

			e.printStackTrace();
		}

=======
		
		System.out.println("passed  testcases"+ result.getName());
		try {
		takeScreenShot(result.getMethod().getMethodName());
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			
		
		
>>>>>>> 00e2270e8fd7909570f8aa4b036d7ae89bf1370e
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed Test case"+result.getName());
<<<<<<< HEAD

		try {

			failedTestCase(result.getMethod().getMethodName());

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {


=======
		
	try {
		
		failedTestCase(result.getMethod().getMethodName());
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		
>>>>>>> 00e2270e8fd7909570f8aa4b036d7ae89bf1370e
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
<<<<<<< HEAD

=======
		
>>>>>>> 00e2270e8fd7909570f8aa4b036d7ae89bf1370e
	}

	@Override
	public void onStart(ITestContext context) {
<<<<<<< HEAD

=======
		
		
>>>>>>> 00e2270e8fd7909570f8aa4b036d7ae89bf1370e
	}

	@Override
	public void onFinish(ITestContext context) {
<<<<<<< HEAD

	}

=======
		
	}
	
>>>>>>> 00e2270e8fd7909570f8aa4b036d7ae89bf1370e

}
