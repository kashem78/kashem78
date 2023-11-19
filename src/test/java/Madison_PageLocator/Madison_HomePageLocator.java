package Madison_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Madison_Utility.Madison_Base;

public class Madison_HomePageLocator extends Madison_Base {

public Madison_HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="login2")
	public WebElement madLoginLink ;
	
	@FindBy(id="signin2")
	public WebElement madSignupLink;
	
	@FindBy(id="")
	public WebElement ab;
}
