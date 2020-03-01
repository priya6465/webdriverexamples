package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getattribute {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     
    String Attributevalue= driver.findElement(By.name("Submit")).getAttribute("value");
    System.out.println(Attributevalue);

	 Thread.sleep(3000);
	 //close driver
	 driver.close();
	
	}

}
