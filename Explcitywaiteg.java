package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explcitywaiteg {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
			 Actions action=new Actions(driver);
			action.contextClick(driver.findElement(By.id("txtUsername"))).perform();;
			action.doubleClick().build().perform();
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();
             
            driver.close();

			 
}

}
