package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Tooltipdemo {
    static WebDriver driver;
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
//		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[text()='Hover over me']"))).perform();
//       String Text= driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
//       System.out.println(Text);
//       Assert.assertTrue(Text.contains("Hooray"));
//       driver.close();

		//*************************Or****************
		driver.get("https://seleniumpractise.blogspot.com/2019/08/tooltip-in-selenium-or-help-text-example.html");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='tooltip']"))).perform();
       String Text= driver.findElement(By.xpath("//span[@class='tooltiptext']")).getText();
       System.out.println(Text);
       Assert.assertTrue(Text.contains("Tooltip text"));
       driver.quit();
	}

}
