package com.ShoppersStack_genericUtility;



	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;

	public class Webdriver_Utility {
		Select sel;
		
		public void selectbyValue(WebElement ele , String value) {
			sel=new Select(ele);
			sel.selectByValue(value);
		}
		
		public void selectbyIndex(WebElement ele , int index) {
			sel=new Select(ele);
			sel.selectByIndex(index);
		}
		
		public void selectbyVisibleText(WebElement ele , String text) {
			sel=new Select(ele);
			sel.selectByVisibleText(text);
		}
		
		public void deselectbyValue(WebElement ele , String value) {
			sel=new Select(ele);
			sel.deselectByValue(value);
		}
		
		public void deselectbyIndex(WebElement ele , int index) {
			sel=new Select(ele);
			sel.deselectByIndex(index);	
		}
		
		public void deselectbyVisibleText(WebElement ele , String text) {
			sel=new Select(ele);
			sel.deselectByVisibleText(text);
		}
		
		public void deselectAll(WebElement ele) {
			sel=new Select(ele);
			sel.deselectAll();
		}
		
		public void getWebPageScreenshot() throws IOException {
			TakesScreenshot ts=(TakesScreenshot) Base_Test.sDriver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("");
			FileHandler.copy(temp, dest);
			
		}
		
		public void getWebElementScreenshot(WebElement ele) throws IOException {
			File temp = ele.getScreenshotAs(OutputType.FILE);
			File dest = new File("");
			FileHandler.copy(temp, dest);
		}
		

	
}
