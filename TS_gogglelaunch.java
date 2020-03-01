package webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS_gogglelaunch {
WebDriver driver;

@BeforeClass
public void setupp(){
	 System.setProperty("webdriver.chrome.d"+ "river","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		}
@Test
public void TitleTest(){
	String title1= driver.getTitle();
		System.out.println(title1);
		driver.quit();
}

@Test
public void clickongmail(){
//	driver.findElement(By.xpath("//input[@data-ved='0ahUKEwj6r97ko-3nAhUtzTgGHbhaC_EQ4dUDCAo']")).click();
	driver.findElement(By.linkText("//a[text()='Gmail']")).click();
	driver.close();
	
}
@AfterClass
	public void teardown(){
	System.out.println("close the browser");
	driver.quit();
}
}