package Madison_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Madison_Utility.Madison_Base;

public class Madison_LoginPageLocator extends Madison_Base {
	
public Madison_LoginPageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="loginusername")
	public WebElement madUserName ;
	
	@FindBy(id="loginpassword")
	public WebElement madPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement madLoginButton;
	
}
