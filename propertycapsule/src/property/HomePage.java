package property;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver; 	}
	
	 @Test(priority=1)
		public void Test1() throws Exception  
		{
			WebElement propertyLogo = driver.findElement(By.xpath("//img[@src='assets/images/pcVTSGreyLogo.png']")); 
		  	Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", propertyLogo);

		  	if (!ImagePresent) {
		  		System.out.println("Image not displayed.");
		  	} else {
		  		System.out.println("Image displayed.");
		  	}

		  	
		}
	 @Test(priority=2)
		public void Test2() throws Exception  
		{

		  WebElement mapMaker = driver.findElement(By.xpath("//*[@id=\"market-btn\"]"));
		  
		  if (mapMaker.isDisplayed()) 
		  { 
			  System.out.println("Text is displayed as :"+
		      mapMaker.getText()); 
			  mapMaker.click(); 
			  Thread.sleep(3000); } 
		  else {
		  System.out.println("Mapmaker tab is not dispalyed"); }
		  
		 }
		  
	 @Test(priority=3)
		public void Test3() throws Exception  
		{
		  WebElement tourBooks = driver.findElement(By.xpath("//*[@id=\"manage-btn\"]")); 
				  if
				  (tourBooks.isDisplayed()) 
				  { 
				  System.out.println("Text is displayed as :"+tourBooks.getText()); 
				  tourBooks.click(); 
				  Thread.sleep(3000); }
				  else {
				  System.out.println("Tourbooks tab is not dispalyed");
				  }	  
				  
		}
	       @Test(priority=4)
					public void Test4() throws Exception  
					{
					  WebElement EnterpriseAdminLogin = driver.findElement(By.xpath("//a[text()='Enterprise Admin Login']")); 
							  if
							  (EnterpriseAdminLogin.isDisplayed()) 
							  { 
							  System.out.println("Text is displayed as :"+EnterpriseAdminLogin.getText()); 
							  EnterpriseAdminLogin.click(); 
							  Thread.sleep(3000); }
							  else {
							  System.out.println("Enterprise Admin Login tab is not dispalyed");
							  
							  }
							  driver.navigate().back();
					}
	       @Test(priority=5)
			public void Test5() throws Exception  
			{
			  WebElement DealMakerSignupLogin = 
					  driver.findElement(By.xpath("//a[text()='Deal Maker Signup/Login']")); 
					  if
					  (DealMakerSignupLogin.isDisplayed()) 
					  { 
					  System.out.println("Text is displayed as :"+DealMakerSignupLogin.getText()); 
					  DealMakerSignupLogin.click(); 
					  Thread.sleep(3000); }
					  else {
					  System.out.println("DealMakerSignup/Login tab is not dispalyed");
					  					  
		}
					  driver.navigate().back();
				  
		}
	       @Test(priority=6)
			public void Test6() throws Exception  
			{
	    	   driver.findElement(By.xpath("//a[@class='see-for-yourself']")).click();
	    		 Thread.sleep(5000);
	    		 driver.findElement(By.xpath("//i[@class='material-icons contact-us-close-btn']")).click();
	    		 System.out.println("see for yourself Test completed");
	 
			}
            @Test(priority=7)
             public void Test7() throws Exception  
              {
             driver.findElement(By.xpath("//a[text()='Terms of Service ']")).click();
	         Thread.sleep(5000);
	          
	         driver.findElement(By.xpath("//i[@class='material-icons']")).click();
	           System.out.println("Terms of Service Test completed");
           }
            @Test(priority=8)
            public void Test8() throws Exception  
             {
            driver.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
	         Thread.sleep(5000);
	          
	         driver.findElement(By.xpath("//i[@class='material-icons contact-us-close-btn']")).click();
	           System.out.println("Contact Us Test completed");
          }
}