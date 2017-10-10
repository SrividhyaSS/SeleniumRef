package yatrapages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YatraRegistration
{
	WebDriver driver;
  @Test (priority = 1)
  public void YatraLogin () 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome2\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.yatra.com/");
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("return document.readyState").toString().equals("complete");
	  
	  System.out.println("Page is loaded");
	  
	  String ActualTitle = driver.getTitle();
	  System.out.println("The actual page title is :"+ ActualTitle);
	  String ExpectedTitle = "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com";
	  if (ActualTitle.equalsIgnoreCase(ExpectedTitle))
	  {
		  System.out.println("Page Title is matching with expected result, Test case is PASSED");
		  
	  }
	  else
	  {
		  System.out.println("Page title is wrong");
	  }
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  Assert.assertTrue(ActualTitle.contains(ExpectedTitle));
	  System.out.println("Test case is PASSED");  
	 	  
	 
	  
	driver.findElement(By.xpath("//img[@src='//www.yatra.com/ythomepagecms/media/distressinventory/2017/Oct/39eec23bfe76fbe2b90b3dd2c7c96557.jpg']")).click();
	WebDriverWait wait = new WebDriverWait (driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Get the Best Holiday Planned by Experts!']")));
	
	
	
	String ele =  (driver.findElement(By.xpath("//*[text()='Get the Best Holiday Planned by Experts!']")).getText());
	System.out.println("Print and Verify the Text of Holiday Package:"+ele);
	
	WebElement Customername = driver.findElement(By.name("customerName"));
	Customername.sendKeys("SRINATH");
	HighlightElement.highLightElement(driver, Customername);
	WebElement Mailid = driver.findElement(By.name("mailId"));
	Mailid.sendKeys("sri@gmail.com");
	HighlightElement.highLightElement(driver, Mailid);
	
	WebElement ISDcodeElement = driver.findElement(By.name("ISDCode"));
	Select ISDCODE = new Select (ISDcodeElement);
	/*String FirstSelectedoption = ISDCODE.getFirstSelectedOption().getText();
	System.out.println("Print The first selected option in drop down is :"+FirstSelectedoption);*/
	
	ISDCODE.selectByIndex(13); 
	String secondSelectedoption = ISDCODE.getFirstSelectedOption().getText();
	System.out.println("Print The newly selected option in drop down is :"+secondSelectedoption);
	
	/*List<WebElement> list = ISDCODE.getOptions();
	int listcount = list.size();
	System.out.println("Print the ISDCODE size:"+listcount);
	
	for (int i=0; i<listcount; i++)
	{
		String data = list.get(i).getText();
		System.out.println(data);
	}*/
	
	
	driver.findElement(By.name("customerMobileNumber")).sendKeys("1234567890");
	WebElement city = driver.findElement(By.name("customerCityName"));
	Select listcity = new Select (city);
	String firstvalue = listcity.getFirstSelectedOption().getText();
	System.out.println("Print the First selected city option :"+firstvalue);
	listcity.selectByIndex(12);
	String secondvalue = listcity.getFirstSelectedOption().getText();
	System.out.println("Print the currently selected city value :"+secondvalue);
	/*List <WebElement> listall = listcity.getOptions();
	int listcount1 = listall.size();
	System.out.println("print the size of the city:"+listcount1);
	for (int i=0; i<listcount1; i++)
	{
		String citydata = listall.get(i).getText();
		System.out.println("print the all the values in city drop down :"+citydata);
		
	}*/
	
	
	
	
/*	driver.findElement(By.id("leadFormDepartureDate")).click();
	 
	DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
    Date date2 = new Date();
    
    String today = dateFormat2.format(date2);
    
    
	 WebElement datewidget =  driver.findElement(By.id("leadFormDepartureDate"));
	 List<WebElement> dateColumns = datewidget.findElements(By.xpath("//*[@id='leadFormDepartureDateCalendar']"));
	 
	  
	  for (WebElement cell :dateColumns )
	  {
		  String date = cell.getText();
		  
		  if(date.equalsIgnoreCase("10"))
		  {
			  cell.click();
			  break;
		  }
	  }
	  
	  
	
	  
	  
	  
	  
	 /* WebElement ele = driver.findElement(By.xpath("//*[@id='userSignInStrip']/a"));
	  Actions act = new Actions(driver);
	  act.moveToElement(ele).build().perform();	  
	  driver.findElement(By.id("signInBtn")).click();
	  driver.findElement(By.id("login-email")).sendKeys("srisri.nath@gmail.com");
	  driver.findElement(By.id("login-continue-btn")).click();
	  
	  WebDriverWait wait = new WebDriverWait (driver,60);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='login-password']")));
			  
	  driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("travel@123");
	  driver.findElement(By.id("login-submit-btn")).click();*/
	  
	  
	  
  }
  

  
 /* @AfterMethod
  public void TearDown ()
  {
	 // driver.close();
  }*/
  

  }

