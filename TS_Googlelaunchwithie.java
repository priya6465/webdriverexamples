package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TS_Googlelaunchwithie {

	public static void main(String[] args) {
	 
	System.setProperty("webdriver.ie.driver","F:\\selenium software\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			
	 WebDriver driver= new InternetExplorerDriver();
	driver.get("https://www.google.com/");
	 
	driver.quit();
	}

}
