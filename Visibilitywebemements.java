package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibilitywebemements {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/register/");	
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
		
		boolean b4 =driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
		System.out.println(b4);
		
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
        boolean b5 =driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
        System.out.println(b5);
        
        Thread.sleep(4000);
		
		driver.close();
	
 

			}

}
