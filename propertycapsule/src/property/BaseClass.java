package property;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static  WebDriver driver=null;
	@BeforeTest
	public void launchBrowser() throws Exception  
	{
		 String projectpath= System.getProperty("user.dir");
	     System.out.print("projectpath:"+ projectpath);
		
	     System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
     driver =new ChromeDriver();
	
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     
     driver.manage().window().maximize();
     driver.get("https://www.propertycapsule.com");
       
  	 
  	 
  	System.out.println("Title of page is: "+driver.getTitle()); 
  	
  	Thread.sleep(1000);
	 
	}
//   @AfterTest
//     public void TearDown()
//  {
//	driver.close();
//	 driver.quit();
  }
	


