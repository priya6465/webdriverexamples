package webdriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	
	public class Googlenavigate {
		public static void main(String[] args) {
			System.setProperty("webdriver.ie.driver","F:\\Selenium Software\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
	    
		 
		//launch Google//
		 driver.get("https://www.google.com/");
		 //click gmail link//
		 driver.findElement(By.linkText("Gmail")).click();
		 //navigate to Google//
		 driver.navigate().back();
		 driver.navigate().forward();
		 
		//cloise to driver// 
		 driver.close();
		}
	}
		 
		
		
	

