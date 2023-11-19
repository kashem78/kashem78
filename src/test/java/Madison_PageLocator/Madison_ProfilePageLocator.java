package Madison_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Madison_Utility.Madison_Base;

public class Madison_ProfilePageLocator extends Madison_Base{
	
 public  Madison_ProfilePageLocator(){
PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="nameofuser")
	public WebElement MadProfile ;
	
	@FindBy(id="logout2")
	public WebElement MadLogout;
	
	@FindBy(xpath="")
	public WebElement bc;
	}


