package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_Cromelanuch {

	public static void main(String[] args) throws InterruptedException {
	 //system setting Chrome
System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	//launch ff browser
 WebDriver driver=new ChromeDriver();
 //launch google
 driver.get("https://www.google.com/");
 //browser close
 Thread.sleep(5000);
 driver.close();
	}
 	 
	}

