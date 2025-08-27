package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.Loginatul;
import pageObjects.MyAccountPage;

public class logiat {

	HomePage hp;
	Loginatul lo;
	MyAccountPage macc;

	@Given("User navigate to the login page.")
	public void user_navigate_to_the_login_page() {
		
		hp= new HomePage(BaseClass.getDriver());

		hp.clickMyAccount();
		hp.clickLogin();

	}

	

	@When("user enter the email valid email and password")
	public void user_enter_the_email_valid_email_and_password() {

		lo= new Loginatul(BaseClass.getDriver());
		lo.enter_email("atulbarve@gmail.com");
        lo.enter_password("test@123");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {

		lo.submit();

	}

	@Then("Login should be done successfully.")
	public void login_should_be_done_successfully() {
	    
		macc=new MyAccountPage(BaseClass.getDriver());
		boolean targetpage=macc.isMyAccountPageExists();
				
		Assert.assertEquals(targetpage, true);

	
}
	}
