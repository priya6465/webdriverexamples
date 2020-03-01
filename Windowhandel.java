package webdriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandel {
	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parent=driver.getWindowHandle();//before clicking need return me parent window id
		
		System.out.println("parent window id"+ parent);
		
		WebElement ele=driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
		ele.click();
		
		Set<String>handler=driver.getWindowHandles(); //return type is set
		
		int count=handler.size();
		
		System.out.println("total window "+count);
		
		for(String child:handler)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				
				driver.findElement(By.name("q")).sendKeys("seleniumwebdriver");
				
				System.out.println("Child window Title"+driver.getTitle());
				
				Thread.sleep(2000);
				driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window Title"+driver.getTitle());


	}}