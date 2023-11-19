package Madison_PageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Madison_PageLocator.Madison_SignPageLocator;
import Madison_Utility.Madison_Base;
import Madison_Utility.Madison_TestData;

public class Madison_SingUpPageAcction extends Madison_Base{

public void TypemadUsernamePasswordclickSignupButton() throws Exception {
	Thread.sleep(3000);
	Madison_SignPageLocator madison_SignPageLocator=new Madison_SignPageLocator();
	madison_SignPageLocator.madSignupUserName.sendKeys(Madison_TestData.MadUserName2);
	madison_SignPageLocator.madSignupPassword.sendKeys(Madison_TestData.MadPassword2);
	madison_SignPageLocator.madSignupButton.click();
}
}
