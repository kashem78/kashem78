package Madison_PageAction;


import Madison_PageLocator.Madison_LoginPageLocator;
import Madison_Utility.Madison_Base;

public class Madison_LoginPageAction  extends Madison_Base{
	Madison_LoginPageLocator madison_LoginPageLocator =new Madison_LoginPageLocator ();      
	
		public void typeUsernamePasswordclickLogin (String u, String p) throws Exception {
			Thread.sleep(5000);
			madison_LoginPageLocator.madUserName.sendKeys("ripon1");
			madison_LoginPageLocator.madPassword.sendKeys("12345");
			madison_LoginPageLocator.madLoginButton.click();
		}
}
