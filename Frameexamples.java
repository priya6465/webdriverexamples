package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameexamples {
		static WebDriver driver;  
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dezlearn.com/testingpage/");
			
			// find the total number of frame on webpage
			int sizeofframe= driver.findElements(By.tagName("iframe")).size();
			System.out.println("total number of frame"+sizeofframe);	
			
		   driver.switchTo().frame("contact-iframe");
		
		   driver.findElement(By.id("ninja_forms_field_11")).sendKeys("priyanka");
		 driver.switchTo().parentFrame(); 
		
		   Thread.sleep(3000);
		   
		driver.switchTo().frame("do-it-iframe");
	   driver.findElement(By.xpath("//input[@class='search-submit']")).click();
          driver.switchTo().parentFrame();
  
		driver.findElement(By.xpath("//a[@id='popup']")).click();
			driver.quit();
		
	}

}
