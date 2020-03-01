package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateHandling {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
    driver.get("https://www.cleartrip.com/");
	driver.manage().window().maximize();
//	Thread.sleep(5000);
	DateHandling dt=new DateHandling();
	dt.searchflightdetails();
	 
	}
	public void searchflightdetails()
	{
	driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
	driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Bangalore, IN - KempegowdaInternational Airport (BLR)");
	driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Mumbai, IN - Chatrapati ShivajiAirport (BOM)");
	driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
	List<WebElement> departurelist = driver.findElements(By.xpath("//div[contains(@class,'monthBlockfirst')]//td//a"));
	int departurecount = departurelist.size();
	for(int i=0;i<departurecount;i++)
	{
	String departurevalue = departurelist.get(i).getText();
	if(departurevalue.equalsIgnoreCase("30"))
	{
	departurelist.get(i).click();
	break;
	}
	}
	driver.findElement(By.xpath("//input[@id='ReturnDate']")).click();
	List<WebElement> returnlist = driver.findElements(By.xpath("//div[contains(@class,'monthBlocklast')]//td//a"));
	int returncount=returnlist.size();
	for (int j=0;j<returncount;j++)
	{
	String returnvalue = returnlist.get(j).getText();
	if (returnvalue.equalsIgnoreCase("30"))
	{
	returnlist.get(j).click();break;
	}
	}
	driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
	driver.quit();
	}


}
