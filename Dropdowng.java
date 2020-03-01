package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowng {
	 static WebDriver driver;  
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Select momth_dropdown=new Select(driver.findElement(By.id("month")));
		momth_dropdown.selectByIndex(4);
		momth_dropdown.selectByVisibleText("May");
		momth_dropdown.selectByValue("Jun");
		
		
		
		}
		

}
