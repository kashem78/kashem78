package Madison_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Madison_Utility.Madison_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Madison_Feature"},
plugin = {"json:target/cucumber.json"},
glue = "Madison_StepDeffination", tags = {"@Arham, @Kakon"})

// AbstractTestNGCucumberTests  
public class Madison_TestRunner extends   AbstractTestNGCucumberTests  {

	
	
	@BeforeTest
	public void madStartURL()  {
		Madison_Base mad =new Madison_Base();
		mad.MadBrowser();
	}
	
	@AfterTest
	public void madCloserURL() {
		Madison_Base mad =new Madison_Base ();
		mad.driver.quit();
	}
	
}
