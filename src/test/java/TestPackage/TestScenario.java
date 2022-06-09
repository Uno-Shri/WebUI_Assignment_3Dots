package TestPackage;

import org.testng.annotations.Test;

import Objects.UnosquarePage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestScenario {
	
	WebDriver driver;
	UnosquarePage objRepo;
	
	
	  @BeforeTest
	  public void testNG_TC_beforeTest() {

		  	WebDriverManager.chromedriver().setup();
		  	driver=new ChromeDriver();
		  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); //time for synchrnization
		  	driver.get("https://people.unosquare.com/");
		  	driver.manage().window().maximize();
		  
	          }
 
 	  @Test (priority=1)
      public void testNG_TC1_click_Dots() {
 		  
 		  objRepo = new UnosquarePage(driver);
 
 		  objRepo.clickDotButton();
 	  
 	  }


 	 @Test (priority=2)
     public void testNG_TC2_click_AboutUs() throws InterruptedException {
		  
		 objRepo = new UnosquarePage(driver);
		 objRepo.clickAboutUs();
	  }
 	 
 	 

 	 @Test (priority=3)
     public void testNG_TC3_click_Personal() throws InterruptedException {
		  
		 objRepo = new UnosquarePage(driver);
		 objRepo.clickPersonal();
	  }
 	 
 	 
    @AfterTest
    public void testNG_TC_afterTest() throws InterruptedException {
	  
	  
		Thread.sleep(5000);
		driver.quit();
  }

}
