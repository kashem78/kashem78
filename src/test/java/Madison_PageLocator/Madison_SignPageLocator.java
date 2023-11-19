package Madison_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Madison_Utility.Madison_Base;

public class Madison_SignPageLocator extends Madison_Base{
	
public Madison_SignPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="sign-username")
	public WebElement madSignupUserName ;
	
	@FindBy(id="sign-password")
	public WebElement madSignupPassword;
	
	@FindBy(xpath="//button[text()='Sign up']")
	public WebElement madSignupButton;
	
	

}
