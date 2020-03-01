package webdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabehandleorangelogin {  //how to nth position element //(//input[@id])[position()=5
   static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
		    Thread.sleep(1000);
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Admin")).click();
		   driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		//WebElement ele= driver.findElement(By.xpath("//table[@id='resultTable']
		 List<WebElement>row=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		int rowcount=row.size();
		System.out.println("Toatal number of rows in webtable is "+ rowcount);
		
		Thread.sleep(5000);
 	 
		   driver.findElement(By.xpath("//a[contains(text(),'sibani')]/parent::td[@class='left']//preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_18']")).click();
		Thread.sleep(6000);
		
	
		driver.close();
		      
		}


			
		}
