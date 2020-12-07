package test;

import org.testng.annotations.Test;

import property.BaseClass;
import property.HomePage;

public class RunClass extends BaseClass {

	
	@Test
    public void init() throws Exception { 
   
		
		HomePage HP = new HomePage(driver);
		HP.Test1();
		HP.Test2();
		HP.Test3();
		HP.Test4();
		HP.Test5();
		HP.Test6();
	}
}
