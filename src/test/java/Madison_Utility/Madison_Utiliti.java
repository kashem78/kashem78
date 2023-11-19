package Madison_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Madison_Utiliti extends Madison_Base{

	public static long pageLoadTimeout = 50;
	public static long implicitlyWait= 30;
	

public static void takeMyScreenshot(WebDriver driver, String screenshot) {
	
	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String correntdir = System.getProperty("user.dir");
	
	try {
		FileUtils.copyFile(srcfile, new File(correntdir+"/Madison_ScreenShorts/"+screenshot+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}
}