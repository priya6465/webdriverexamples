package webdriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broknlinks {
   static WebDriver driver;  
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++){
			WebElement element=links.get(i);
			String url=element.getAttribute("href");//store href in url
			URL link=new URL(url);//pass the url
			//create coneection using URLobject link
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			//establish connection 
			httpconn.connect();
			int rescode=httpconn.getResponseCode();//return responsecode.if res code is above 400 brokenlons
			if(rescode>=400){
			System.out.println(url  +"   "+"Broken link");
			}
			else
				System.out.println(url + "   "+ "is valid links");
			}   
		 
		 }
	}
		
