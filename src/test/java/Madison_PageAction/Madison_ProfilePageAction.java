package Madison_PageAction;


import org.testng.Assert;

import Madison_PageLocator.Madison_ProfilePageLocator;
import Madison_Utility.Madison_Base;
import Madison_Utility.Madison_Utiliti;

public class Madison_ProfilePageAction extends Madison_Base {
	
Madison_ProfilePageLocator madison_ProfilePageLocator=new Madison_ProfilePageLocator();  
			public void VerifyUsercanLoginSuccessfully() throws Exception {
				Thread.sleep(5000);
		boolean profileverification =	 madison_ProfilePageLocator.MadProfile.isDisplayed();
		Assert.assertTrue(profileverification);
		
		Madison_Utiliti.takeMyScreenshot(driver, "Profile Page");
	}
public void Logoutthesite() {
	madison_ProfilePageLocator.MadLogout.click();
}
}
