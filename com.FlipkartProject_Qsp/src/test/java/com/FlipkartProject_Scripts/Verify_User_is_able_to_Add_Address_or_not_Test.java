package com.FlipkartProject_Scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.ShoppersStack_genericUtility.Base_Test;
import com.ShoppersStack_genericUtility.Listeners_Utility;
import com.ShoppersStack_pom.AddressForm_Page;
import com.ShoppersStack_pom.MyAddress_Page;
import com.ShoppersStack_pom.Myprofile_Page;
import com.aventstack.extentreports.Status;
//import org.testng.annotations.*;
//import org.testng.internal.annotations.*;	
//import org.testng.annotations.*;

@Listeners(Listeners_Utility.class)
public class Verify_User_is_able_to_Add_Address_or_not_Test extends Base_Test {

	@Test

	public void addAddress() throws EncryptedDocumentException, IOException {
		test.log(Status.INFO, "addAddress successfullly");
		home.getSetting().click();
		home.getMyProfile().click();
		test.log(Status.INFO, "My profile addAddress successfullly");
		Myprofile_Page profile = new Myprofile_Page(driver);
		profile.getMyAddressBtn().click();
		test.log(Status.INFO, " my addAddress successfullly");
		MyAddress_Page myAddress = new MyAddress_Page(driver);

		myAddress.getAddAddressBtn().click();

		AddressForm_Page addressForm = new AddressForm_Page(driver);
		addressForm.getOfficeRBtn().click();
		addressForm.getNameTF().sendKeys(file.readExcelData("Sheet1", 1, 0));
		addressForm.getHouseTF().sendKeys(file.readExcelData("Sheet1", 1, 1));
		addressForm.getStreetTF().sendKeys(file.readExcelData("Sheet1", 1, 2));
		addressForm.getLandmarkTF().sendKeys(file.readExcelData("Sheet1", 1, 3));
		addressForm.getCountrDD().sendKeys(file.readPropertyData("country"));
		addressForm.getStateDD().sendKeys(file.readPropertyData("state"));
		addressForm.getCityDD().sendKeys(file.readPropertyData("city"));
		addressForm.getPincodeTF().sendKeys(file.readExcelData("Sheet1", 1, 4));
		addressForm.getPhoneTF().sendKeys(file.readExcelData("Sheet1", 1, 5));
		addressForm.getAddAddressBTN().click();

	}

}
