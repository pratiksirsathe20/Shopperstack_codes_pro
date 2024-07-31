package com.ShoppersStack_pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AddressForm_Page {
		
		public AddressForm_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "Office")
		private WebElement officeRBtn;
		
		@FindBy(id = "Name")
		private WebElement nameTF;
		
		@FindBy(xpath = "//input[contains(@id,'House/Office')]")
		private WebElement houseTF;
		
		@FindBy(xpath = "//input[contains(@id,'Street')]")
		private WebElement streetTF;
		
		@FindBy(id = "Landmark")
		private WebElement landmarkTF;
		
		@FindBy(id = "Country")
		private WebElement countrDD;
		
		@FindBy(id = "State")
		private WebElement stateDD;
		
		@FindBy (id = "City")
		private WebElement cityDD;
		
		@FindBy(id = "Pincode")
		private WebElement pincodeTF;
		
		@FindBy(xpath = "//input[contains(@id,'Phone')]")
		private WebElement phoneTF;
		
		@FindBy(id = "addAddress")
		private WebElement addAddressBTN;

		public WebElement getOfficeRBtn() {
			return officeRBtn;
		}

		public WebElement getNameTF() {
			return nameTF;
		}

		public WebElement getHouseTF() {
			return houseTF;
		}

		public WebElement getStreetTF() {
			return streetTF;
		}

		public WebElement getLandmarkTF() {
			return landmarkTF;
		}

		public WebElement getCountrDD() {
			return countrDD;
		}

		public WebElement getStateDD() {
			return stateDD;
		}

		public WebElement getCityDD() {
			return cityDD;
		}

		public WebElement getPincodeTF() {
			return pincodeTF;
		}

		public WebElement getPhoneTF() {
			return phoneTF;
		}

		public WebElement getAddAddressBTN() {
			return addAddressBTN;
		}
		
	}
	
