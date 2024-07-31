package com.ShoppersStack_pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class MyAddress_Page {
		public MyAddress_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//button[text()='Add Address']")
		private WebElement addAddressBtn;
		
		@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")
		private WebElement deleteBtn;
		
		
		@FindBy(xpath = "//button[text()='Yes']")
		private WebElement yesBtn;

	    @FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[1]")
	    private WebElement editbtn;
	    
	    @FindBy(xpath = "//button[contains(@id,'Update')]")
	    private WebElement updateBtn;

		public WebElement getAddAddressBtn() {
			return addAddressBtn;
		}


		public WebElement getDeleteBtn() {
			return deleteBtn;
		}


		public WebElement getYesBtn() {
			return yesBtn;
		}


		public WebElement getEditbtn() {
			return editbtn;
		}	
		
		public WebElement getupdateBtn() {
			return updateBtn;
		}

	}

