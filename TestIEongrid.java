package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestIEongrid {
	WebDriver driver;
	@Test
	public void Test1() throws MalformedURLException{
		
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	

		// start application
		driver.get("http://learn-automation.com/");

		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		cap.setPlatform(Platform.WINDOWS);
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		String huburl="http://192.168.43.57:4444/wd/hub";

		// Create driver with hub address and capability
		WebDriver driver=new RemoteWebDriver(new URL(huburl),options);
		
		
		// get the title and print the same
		System.out.println("Blog title is "+driver.getTitle());

		driver.close();

		}
		
	}

