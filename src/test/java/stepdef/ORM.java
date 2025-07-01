package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ORM {
		WebDriver driver;

		@Given("user is on ORM Login page")
		public void user_is_on_orm_login_page()
		{
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		}

		@When("user enters username and passowrd")
		public void user_enters_username_and_passowrd()
		{
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("raj");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("raj123");
		}

		@When("user click on login button")
		public void user_click_on_login_button()
		{
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		}

		@Then("user navigate to dashboard page")
		public void user_navigate_to_dashboard_page()
		{
		        boolean Logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		       
		       // System.out.println("Display logo"+Logo);
		        Assert.assertEquals(Logo, true);
		}

	

	}

