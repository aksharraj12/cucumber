package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep1 {

@Given("user is on login in page")
public void user_is_on_login_in_page()
{
    System.out.println("chandan");
}

@When("enter usr and pswd")
public void enter_usr_and_pswd() 
{
   System.out.println("vikram");
}

@When("click login")
public void click_login() 
{
   System.out.println("shivaji");
}

@Then("display page")
public void display_page()
{
    System.out.println("rabbani");
}



}
