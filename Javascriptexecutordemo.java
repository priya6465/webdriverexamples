package webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutordemo {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.automationtesting.in/");
		driver.get("http://demo.automationtesting.in/Register.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').value='krishna@gmail.com'");
		//js.executeScript("document.getElementById('enterimg').click()");
	  String str= js.executeScript("return document.title").toString();
	    System.out.println(str);

}
}
