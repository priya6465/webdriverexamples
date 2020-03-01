package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingegjavascript {
		 static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				//driver.get("http://www.software-testing-tutorials-automation.com/2015/02/scroll-down-up-web-page-using.html");
				driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
				WebElement element=driver.findElement(By.linkText("Ethical Hacking"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
	          
				//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				//Thread.sleep(2000);
//				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)","");
				//jse.executeScript("arguments[0].scrollIntoView(true);","");
              Thread.sleep(3000);

				driver.close();
				
			
	}

}
