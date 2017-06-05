package stepDefinitionTC01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TDDtestcase 

{
WebDriver driver;
	
	@Given("^Open Chrome and start the application url =\"(.*?)\"$")
	public void open_Chrome_and_start_the_application_url(String URL) 
	{
	
		   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumChrome\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get(URL);
	    
	}

	@When("^Enter valid username \"(.*?)\" and valid password \"(.*?)\"$")
	public void enter_valid_username_and_valid_password(String username, String password) 
	{
	  
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() 
	{
	    
		  driver.findElement(By.name("login")).click();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed()  
	{
	    
	   
		  driver.close();
	

}
}

