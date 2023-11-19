package Madison_StepDeffination;

import Madison_PageAction.Madison_HomePageAction;
import Madison_PageAction.Madison_SingUpPageAcction;
import Madison_Utility.Madison_Base;
import cucumber.api.java.en.Then;

public class Madison_SugnUP extends Madison_Base{
	
	
	
	Madison_HomePageAction madison_HomePageAction =new Madison_HomePageAction();                  
	Madison_SingUpPageAcction madison_SingUpPageAcction = new Madison_SingUpPageAcction();
	
	
	@Then("^Click on Signup Link$")
	public void click_on_Signup_Link() throws Throwable {
		madison_HomePageAction.ClickonSignupLink();
	}

	@Then("^Type madUsername Password click Signup Button$")
	public void type_madUsername_Password_click_Signup_Button() throws Throwable {
		madison_SingUpPageAcction.TypemadUsernamePasswordclickSignupButton();
	}

	@Then("^Verify User can Signup$")
	public void verify_User_can_Signup() throws Throwable {
		madison_HomePageAction.VerifyUsercanSignup();
	}
	
	

}
