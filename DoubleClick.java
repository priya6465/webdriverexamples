package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","F:\\selenium software\\geckodriver-v0.20.1-win32\\geckodriver.exe");
	
	 WebDriver driver= new FirefoxDriver();
	 
	 driver.get("https://www.google.com/");
	 
	Actions action = new Actions(driver);	
	
	action.moveToElement(driver.findElement(By.xpath("//input[@name='btnI']"))).doubleClick().perform(); 
      
	}
}
 
