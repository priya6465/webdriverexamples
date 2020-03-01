package webdriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandel2 {

	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		 driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		Thread.sleep(2000);
		Set<String>handler=driver.getWindowHandles();
		
         Iterator<String>it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent windowid"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child windowid"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window popup title"+driver.getTitle());
      driver.close();
     driver.switchTo().window(parentWindowId);
   Thread.sleep(2000);
	System.out.println("parent window popup title"+driver.getTitle());
	driver.quit();
	
	}
}
