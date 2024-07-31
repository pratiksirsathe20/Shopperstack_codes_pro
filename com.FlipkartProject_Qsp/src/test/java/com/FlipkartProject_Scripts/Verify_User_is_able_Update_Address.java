package com.FlipkartProject_Scripts;



	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.annotations.Test;

import com.ShoppersStack_genericUtility.Base_Test;
import com.ShoppersStack_pom.AddressForm_Page;
	import com.ShoppersStack_pom.MyAddress_Page;
	import com.ShoppersStack_pom.Myprofile_Page;

	public class Verify_User_is_able_Update_Address extends Base_Test {
		@Test
		
		public void updateAddress() throws EncryptedDocumentException, IOException, InterruptedException {
			
			home.getSetting().click();
			home.getMyProfile().click();
			
			Myprofile_Page profile=new Myprofile_Page(driver);
			profile.getMyAddressBtn().click();
			
			MyAddress_Page address=new MyAddress_Page(driver);
			address.getEditbtn().click();
			
			AddressForm_Page form=new AddressForm_Page(driver);
			form.getNameTF().clear();
			
			Thread.sleep(2000);
			
			form.getNameTF().sendKeys(file.readExcelData("Sheet1", 1, 0));
			
			Thread.sleep(1000);
			
			form.getHouseTF().clear();
			Thread.sleep(2000);
			
			form.getHouseTF().sendKeys(file.readExcelData("Sheet2", 1, 1));
			Thread.sleep(1000);
			
			form.getStreetTF().clear();
			Thread.sleep(2000);
			
			form.getStreetTF().sendKeys(file.readExcelData("Sheet1", 1, 2));
			Thread.sleep(1000);
			
			form.getLandmarkTF().clear();
			Thread.sleep(2000);
			
			form.getLandmarkTF().sendKeys(file.readExcelData("Sheet1", 1, 3));
			Thread.sleep(1000);
			
			form.getPincodeTF().clear();
			Thread.sleep(2000);
			
			form.getPincodeTF().sendKeys(file.readExcelData("Sheet1", 1, 4));
			Thread.sleep(1000);
			
			form.getPhoneTF().clear();
			Thread.sleep(2000);
			
			form.getPhoneTF().sendKeys(file.readExcelData("Sheet1", 1, 5));
			Thread.sleep(1000);
			
			address.getupdateBtn().click();
			
			
			
		

	}
}
