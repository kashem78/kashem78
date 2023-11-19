package Madison_PageAction;


import org.testng.Assert;

import Madison_PageLocator.Madison_HomePageLocator;
import Madison_PageLocator.Madison_SignPageLocator;
import Madison_Utility.Madison_Base;

public class Madison_HomePageAction extends Madison_Base{

	Madison_HomePageLocator madison_HomePageLocator=new Madison_HomePageLocator();   
	
	public void Clickmadlogin() {
		madison_HomePageLocator.madLoginLink.click();
		
	}
	public void ClickonSignupLink () {
		madison_HomePageLocator.madSignupLink.click();
	}
	public void VerifyUsercanSignup() throws Exception {
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		boolean SignupSuccess = madison_HomePageLocator.madSignupLink.isDisplayed();
		Assert.assertTrue(SignupSuccess);
		
	}
}
