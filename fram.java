package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fram {
	static WebDriver driver;  
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		int sizeofframe= driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frame"+sizeofframe);
		
		driver.switchTo().frame("IF1");
		
		driver.close();
		
	}

}
