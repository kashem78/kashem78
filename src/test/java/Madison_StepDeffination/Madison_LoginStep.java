package Madison_StepDeffination;

import Madison_PageAction.Madison_HomePageAction;
import Madison_PageAction.Madison_LoginPageAction;
import Madison_PageAction.Madison_ProfilePageAction;
import Madison_Utility.Madison_Base;
import Madison_Utility.Madison_Utiliti;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Madison_LoginStep extends Madison_Base {
	Madison_HomePageAction madison_HomePageAction=new Madison_HomePageAction();                 
	Madison_LoginPageAction madison_LoginPageAction =new Madison_LoginPageAction ();
	Madison_ProfilePageAction madison_ProfilePageAction=new Madison_ProfilePageAction();
	
	
	
	@Given("^Launch <\"([^\"]*)\"> mad$")
	public void launch_mad(String URL) throws Throwable {
		MadLaunchURL(URL);
		Madison_Utiliti.takeMyScreenshot(driver, "Home page");
	}

	@Then("^Click madlogin$")
	public void click_madlogin() throws Throwable {
		madison_HomePageAction.Clickmadlogin();
	}

	@Then("^Type Username Password click Login$")
	public void type_Username_Password_click_Login() throws Throwable {
		madison_LoginPageAction.typeUsernamePasswordclickLogin(MadPro.getProperty("MadUserName1"), MadPro.getProperty("MadPassword1") );                      
	}

	@Then("^Verify User can Login Successfully$")
	public void verify_User_can_Login_Successfully() throws Throwable {
		madison_ProfilePageAction.VerifyUsercanLoginSuccessfully();
	}

	@Then("^Logout the site$")
	public void logout_the_site() throws Throwable {
		madison_ProfilePageAction.Logoutthesite();
	}


	
	
}
