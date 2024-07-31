package com.ShoppersStack_pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;



	public class Myprofile_Page {
		
		public Myprofile_Page(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "(//div[contains(@class,'MuiGrid-root')])[4]")
		private WebElement myAddressBtn;


		public WebElement getMyAddressBtn() {
			return myAddressBtn;
		}
		
		

	}

