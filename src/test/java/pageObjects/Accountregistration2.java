package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistration2 extends BasePage {

	// constructor.
	public Accountregistration2(WebDriver driver) {

		super(driver);

	}

	// Element

	@FindBy(name = "firstname")
	WebElement firstname;
	@FindBy(name = "lastname")
	WebElement lastname;
	@FindBy(id = "input-email")
	WebElement Email;
	@FindBy(id = "input-telephone")
	WebElement telephone;
	
	
	@FindBy(id = "input-password")
	WebElement password;
	@FindBy(id = "input-confirm")
	WebElement conpassword;

	@FindBy(xpath = "//input[@name=\"newsletter\"]")
	WebElement sub;
	
	
	@FindBy(name = "agree")
	WebElement agg;

	

	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	WebElement conti;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	// Action method.

	public void firtsname(String name)

	{
		firstname.sendKeys(name);

	}

	public void lastname(String lname) {

		lastname.sendKeys(lname);
	}

	public void setEmail( String email)

	{
		Email.sendKeys(email);

	}

	public void telephone(String tel) {

		telephone.sendKeys(tel);
	}

	public void password1(String pwd) {

		password.sendKeys(pwd);
	}

	public void conpassword1(String cpwd) {

		conpassword.sendKeys(cpwd);
	}


	public void add() {

		agg.click();
	}

	public void continuee() {

		conti.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}

}
