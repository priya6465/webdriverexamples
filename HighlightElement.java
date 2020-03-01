package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();

			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		    
		    drawBorder(loginbtn,driver);
		     
		    genrateAlert(driver,"there is issue with login button on login page");
		    
		   System.out.println(gettitlebyjs(driver));
		   
		    Thread.sleep(3000);
		    driver.quit();
	}
		    public static void drawBorder(WebElement element,WebDriver driver){
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='3px solid red'",element);
		    }
		    public static void genrateAlert(WebDriver driver,String message){
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("alert('"+message+"')");
		    	
		    }
		    
		    public static String gettitlebyjs(WebDriver driver){
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
				String title=js.executeScript("return document.title").toString();
				return title;
		    	
		    }
		    
	}
	
