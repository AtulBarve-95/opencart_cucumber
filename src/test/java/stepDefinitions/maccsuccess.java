package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.macpage;

public class maccsuccess {

	macpage m1;

@Given("Click on the desktop and Macc.")
public void click_on_the_desktop_and_macc() 
{
   m1= new macpage(BaseClass.getDriver());
   m1.desktop();
   m1.mac();
}

@When("User click on the add to cart.")
public void user_click_on_the_add_to_cart()

{
    
}

@Then("success messsgae should be display.")
public void success_messsgae_should_be_display()
{
    
	
	
}
}
