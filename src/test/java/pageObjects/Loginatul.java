package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginatul extends BasePage {

	// Constructor

	public Loginatul(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	// Element

	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement input_email;
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement input_password;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement Login;

	// Action method.

	public void enter_email(String E_email) {
		input_email.sendKeys(E_email);

	}

	public void enter_password(String E_pwd) {

		input_password.sendKeys(E_pwd);

	}

	public void submit() {

		Login.click();

	}

}
