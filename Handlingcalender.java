package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handlingcalender {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://classic.freecrm.com/index.html");
	 driver.findElement(By.name("username")).sendKeys("batchautomation");
	 driver.findElement(By.name("password")).sendKeys("Test@12345");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 driver.manage().window().maximize();
//     Actions act=new Actions(driver);
//     act.moveToElement(driver.findElement(By.xpath("//a[@title='Calendar']"))).perform();
	 driver.switchTo().frame("mainpanel");
   driver.findElement(By.xpath("//a[@title='Calendar']")).click();
	 
   driver.switchTo().frame("mainpanel");
	 String date="22-February-2020";
	   String[]dateArr=date.split("-");
	 String day=dateArr[0];
	 String month=dateArr[1];
	 String year=dateArr[2];
	 Select select=new Select(driver.findElement(By.name("slctMonth")));
	 select.selectByVisibleText(month);
	 
	 Select select1=new Select(driver.findElement(By.name("slctYear")));
	 select1.selectByVisibleText(year);
	 
	 String beforexpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
	 String afterxpath="]/td[";
	 
	 final int totalweeksdays=7;
	 
	 for(int rowNum=2;rowNum<=7;rowNum++){
		 for(int colNum=1;colNum<=totalweeksdays;colNum++)
		 {
			String dayvalue= driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
		System.out.println(dayvalue);
		 }
	 }
	 
	 
	 
	
   driver.close();

	}

}
