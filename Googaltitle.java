package webdriver;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

	
	public class Googaltitle {
		public static void main(String[] args) {
		 
//	  System.setProperty("webdriver.gecko.driver"+"river","F:\\Selenium setup\\geckodriver-v0.26.0-win32\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
			
			System.setProperty("webdriver.ie.driver","F:\\Selenium Software\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
	    
		
		 driver.get("https://www.google.com/");
		  
		 String title= driver.getTitle();
		 
		 System.out.println("title is + title");
		 
		 if(title.equalsIgnoreCase("Google")){
			 System.out.println("title is matched");
		 }
		 else {
			 System.out.println("title is mitchmatched");
		 }
			  
		 driver.close();
		}
	}
		 
		
		
	

