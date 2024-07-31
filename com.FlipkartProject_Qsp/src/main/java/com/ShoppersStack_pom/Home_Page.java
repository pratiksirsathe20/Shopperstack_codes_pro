package com.ShoppersStack_pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Home_Page {
		public Home_Page(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge MuiBadge-badge')]")
		private WebElement setting;
		
		@FindBy(xpath = "//li[text()='My Profile']")
		private WebElement myProfile;
		
		@FindBy(xpath = "//li[text()='Logout']")
		private WebElement logOut;

		public WebElement getSetting() {
			return setting;
		}


		public WebElement getMyProfile() {
			return myProfile;
		}


		public WebElement getLogOut() {
			return logOut;
		}


	}

