package stepDefinitions;

import java.util.Map;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.Accountregistration2;
import pageObjects.HomePage;

public class regi {

	HomePage hp;
	Accountregistration2 regpage;

	@Given("the user go to the registration page")
	public void registration_page()

	{
		hp = new HomePage(BaseClass.getDriver());

		hp.clickMyAccount();
		hp.clickRegister();
	}

	@When("User eneter all the details")
	public void user_eneter_all_the_details(DataTable dataTable)

	{

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

		regpage = new Accountregistration2(BaseClass.getDriver());
		regpage.firtsname(dataMap.get("firstName"));
		regpage.lastname(dataMap.get("lastName"));
		regpage.setEmail("atulbarve1236@gmail.com");
		regpage.telephone(dataMap.get("telephone"));
		
		
		regpage.password1(dataMap.get("password"));
		regpage.conpassword1(dataMap.get("password"));

	}

	@When("User select the privacy policy")
	public void user_select_the_privacy_policy() 
	{

		
		regpage.add();

	}

	@When("the user click on the Continue button")
	public void the_user_click_on_the_continue_button() {

		regpage.continuee();

		
	}

	@Then("the user account should created succesfully.")
	public void the_user_account_should_created_succesfully() {

		String confmsg = regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");

	}

}
