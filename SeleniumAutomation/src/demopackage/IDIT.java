package demopackage;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class IDIT
{
	WebDriver driver;
	@BeforeMethod 
	
	public void IDITLogin ()
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome2\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://52.174.238.82/idit-web/web-framework/login.do");
		 driver.findElement(By.id("UserName")).sendKeys("ramyagopal");
		 driver.findElement(By.id("Password")).sendKeys("1111");
		 Select station = new Select (driver.findElement(By.id("Station")));
		 station.selectByValue("1");
		 driver.findElement(By.id("Login")).click();
		 
	}
	
	@Test (priority = 0)
	public void LegalContactCreation ()
	{
		driver.findElement(By.id("NewMainMenu")).click();
		driver.findElement(By.id("NewContactNewGenFromMenu_Link")).click();
		driver.findElement(By.id("LastName")).sendKeys("FleetAuto");
		driver.findElement(By.xpath("//*[text()='Norway(Norway)']")).click();
		 
	 driver.findElement(By.xpath("//*[@id='IDITForm@primaryAddressForDisplay@addressVO@cityName']")).sendKeys("Norway");
		
	driver.findElement(By.xpath("//*[@id='performFinishForIrregularities']")).click();	
	driver.findElement(By.xpath("//*[text() = 'Pending']")).click();	
		
	driver.findElement(By.xpath("//*[@id='linkSuggestedContactStatus']")).click();
	}
	
		
		
		@AfterMethod
		public void TearDown()
		{
			driver.close();
			
		}
	
	
		
	}
	




