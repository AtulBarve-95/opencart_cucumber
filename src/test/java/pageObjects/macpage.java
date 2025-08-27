package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class macpage extends BasePage {

	public macpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Action method

	

	
	@FindBy(xpath="//a[text()=\"Desktops\"]") WebElement desktop;
	
	@FindBy(xpath="//a[text()=\"Mac (1)\"]") WebElement mac1;

	
	
	public void desktop()
	{
		
		desktop.click();
	}
	
	public void mac()
	{
		
		mac1.click();
	}
	
	

}
