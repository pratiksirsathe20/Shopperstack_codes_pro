package com.FlipkartProject_Scripts;




	import org.testng.annotations.Test;

	import com.ShoppersStack_genericUtility.Base_Test;
	import com.ShoppersStack_pom.MyAddress_Page;
	import com.ShoppersStack_pom.Myprofile_Page;


	public class Verify_User_is_able_to_Delete_Address_or_not_Test extends com.ShoppersStack_genericUtility.Base_Test {
		
		@Test
		
		public void deleteAddress() throws InterruptedException {
			home.getSetting().click();
			home.getMyProfile().click();
			
		    com.ShoppersStack_pom.Myprofile_Page page=new com.ShoppersStack_pom.Myprofile_Page(driver);
		    page.getMyAddressBtn().click();
			
			
			com.ShoppersStack_pom.MyAddress_Page address=new com.ShoppersStack_pom.MyAddress_Page(driver);
			
			Thread.sleep(1000);
			address.getDeleteBtn().click();
		
			Thread.sleep(2000);
			address.getYesBtn().click();
			Thread.sleep(1000);
			
			driver.switchTo().alert().accept();
			
			
			
		
	}
}
