package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class google 
{	
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("browser is open");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() 
	{
		System.out.println("google search page");
		driver.get("https://www.google.com/");	
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException 
	{
	    System.out.println("enter text in search box");
	    driver.findElement(By.name("q")).sendKeys("Naresh IT");
	    Thread.sleep(5000);
	}

	@When("hits enter")
	public void hits_enter() throws InterruptedException 
	{
	   System.out.println("enter button");
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   Thread.sleep(5000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_serch_results()
	{
	  System.out.println("navigate to search results");
	  driver.getPageSource().contains("Online Training");
	//  driver.quit();
	}



}
