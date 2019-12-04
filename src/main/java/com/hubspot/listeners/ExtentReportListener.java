package com.hubspot.listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ExtentReportListener implements ITestListener {

	//When test case get started, this method is called.
	public void onTestStart(ITestResult result) {
	System.out.println(result.getName()+"test case is started");
	System.out.println("Extent Report Results");
		
	}

	//When test case get passed ,this method is called
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test case passed");
		
	}

	//When test case get failed , this method is called
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the test case failed is: "+result.getName());
		
		
	}

	//When test case get skipped, this method is called
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the test case skipped is: "+result.getName());
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
	Reporter.log("About to begun executing test "+ context.getName(),true);	
		
	}

	
	public void onFinish(ITestContext context) {
		Reporter.log("Completed executing test "+ context.getName(),true);		
		
	}
	

}
