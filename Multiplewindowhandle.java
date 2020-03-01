package webdriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowhandle {

	static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		 driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		 String parent=driver.getWindowHandle();
		 System.out.println("parent window id is"+parent);
	     Set<String>allwindow=driver.getWindowHandles();
	     ArrayList<String>tabs=new ArrayList<String>(allwindow);
	     
	     driver.switchTo().window(tabs.get(0));
         System.out.println("Title of parent window is " +driver.getTitle());
         
   
	     driver.switchTo().window(tabs.get(1));
         System.out.println("Title of child window is " +driver.getTitle());
         
         driver.findElement(By.xpath("//a[text()='Images']"));
        
//         driver.switchTo().window(tabs.get(3));
       
              
	}
	}

