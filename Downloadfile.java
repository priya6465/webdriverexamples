package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java download");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	driver.findElement(By.linkText("Download Free Java Software")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']")).click();
	Thread.sleep(2000);
	
	driver.close();
			
	}

}
