package com.ShoppersStack_genericUtility;


	

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.ISuiteListener;
	import org.testng.ITestListener;
	import org.testng.ITestResult;


	public class Listeners_Utility implements ITestListener,ISuiteListener{
		
		@Override
		public void onTestFailedWithTimeout(ITestResult result) {

			TakesScreenshot ts=(TakesScreenshot)Base_Test.sDriver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("./screenshot/"+result.getName()+".png");
			
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		

	
}
