package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.navigate().to("https://javaconceptoftheday.com/");
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.getCurrentUrl();
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		   String availableText= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).getText();
		    System.out.println("Text avaliable:"+availableText);
		    Thread.sleep(5000);
		driver.close();
	}

}
