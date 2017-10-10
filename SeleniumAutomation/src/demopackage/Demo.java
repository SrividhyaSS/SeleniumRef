package demopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Demo
{
	
	WebDriver driver;
	
  @Test (priority = 0)
  
  public void SampleTestCase ()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome2\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")).click();
  }  
   
	@Test  (priority = 1)
  public void AlertHandling()
	  {
		  try
		  {
			  WebDriverWait wait =  new WebDriverWait(driver, 15);
			  wait.until(ExpectedConditions.alertIsPresent());
			  Alert alert = driver.switchTo().alert();
			  System.out.println("Alert is present");
			  alert.accept();
		  }
		  
		  catch (NoAlertPresentException  e)
		  {
			 System.out.println("Alert is not present");
		  }
		  
	  }
  }
  
	  
	 
	  
	  
	   
	  
	  
	  
	  
  

