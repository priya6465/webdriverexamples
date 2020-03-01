package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	   static  WebDriver driver;
	   
	  public static void main(String[]args){
		  
	   		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		   
     WebElement ele= driver.findElement(By.xpath("//button[@class='dropbtn'and text()='Automation Tools']"));
		   Actions act=new Actions(driver);
		     act.moveToElement(ele).perform();
		  List<WebElement>link= driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		  
		  int links=link.size();
		  
		    for(int i=0;i<links;i++){
		    	
		    	WebElement element=link.get(i);
		    	String text=element.getAttribute("innerHTML");
		    	System.out.println(text);
		    	
		    boolean status=element.isEnabled();
		    
		    System.out.println("Link name is "  + text +"link status is"+status);
		    
		    if(text.equalsIgnoreCase("Selenium"))
		    {
		    	element.click();
		    	break;
		    }
		      driver.close();
}}}