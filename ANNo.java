package webdriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ANNo {
	@BeforeSuite
	public void setup(){
		System. out.println("setup for chrom");
	}
	@BeforeTest
	public void launchbrowser(){
		System.out.println("launch browser");
	}
	@BeforeClass
	public void login (){
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterurl(){
		System.out.println("enter url");
	}
	@Test
	public void googleTitletest(){
		System.out.println("google login test");
	}
   @Test
   public void googlelogotest(){
	   System.out.println("logo test");
   }
   
   
   @AfterMethod
   public void logout(){
	   System.out.println("logout app");
   }
   @AfterClass
   public void closeBrowser(){
	   System.out.println("close browser");
   }
   @AfterTest
   public void deleteallcookies(){
	   System.out.println("delete cookies");
   }
   
  
}
