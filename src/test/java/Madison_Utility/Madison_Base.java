package Madison_Utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class Madison_Base {
	
	public static WebDriver driver;
	public static Properties MadPro;

	public Madison_Base () {
		try {
				FileInputStream MadFle=new 	FileInputStream(System.getProperty("user.dir")+ ( "//src//test//java/Madison_Config//Madison_Config.Properties"));     
				MadPro =new 	Properties ();
				MadPro.load(MadFle);
		}catch (FileNotFoundException e)	{
			// TOODO Auto -generated catch block
			System.out.println("Please look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}
	
}
	public void MadBrowser()  {
	
	String MadAllBrowser =	MadPro.getProperty("MadBrowser1");
	if ( MadAllBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Madison_ChromeDriver//chromedriver.exe"));
		ChromeOptions app = new ChromeOptions();
		app.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Madison_Utiliti .pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Madison_Utiliti .implicitlyWait));
		driver.manage().window().maximize();
		
		
	}
	else if (MadAllBrowser.equalsIgnoreCase("Edge"))  {
		
		System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Madison_EdgeDriver//msedgedriver.exe"));
		EdgeOptions aapp = new EdgeOptions();
		aapp.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Madison_Utiliti.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Madison_Utiliti.implicitlyWait));
		driver.manage().window().maximize();
						
						}
	
				}
	public static void  MadLaunchURL (String URL) {
		driver.get(MadPro.getProperty("MadURL"));
	}
		
}