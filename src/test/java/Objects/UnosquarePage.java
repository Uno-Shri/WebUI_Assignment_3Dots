package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UnosquarePage {
	
	WebDriver driver=null; // no null is also fine , just to save some memories
  By threedots =    By.xpath("//span[@class='navbar-toggler-icon']");
	//By button_search= By.name("btnK");
	
   // By text_aboutus = By.xpath("//a[normalize-space()='What we do']");	
  By text_aboutus = By.xpath("//li[@data-menuanchor='about-us']");
  
  By text_personal= By.xpath("//div[@class='about-button']//h3[@class='about-btn-main'][normalize-space()='Personal']");

	public UnosquarePage(WebDriver driver)
	{
	this.driver = driver;
	
	}
	
	public void clickDotButton()
	
	{
	
		driver.findElement(threedots).click();
	//	driver.findElement(text_aboutus).click();
	}
	
	
public void clickAboutUs() throws InterruptedException
{
	 
	Thread.sleep(2000);
	driver.findElement(text_aboutus).click();
	}


public void clickPersonal() throws InterruptedException
{
	 
	Thread.sleep(2000);
	driver.findElement(text_personal).click();
	}

}
