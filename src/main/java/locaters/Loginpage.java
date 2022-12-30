package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Loginpage extends BaseClass {

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	public WebElement login_error_button;
	
	@FindBy(id = "username")
	public WebElement username;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "signOnButton")
	public WebElement sign_on;
	
	@FindBy(xpath = "//h4[text()='Log In']")
	public WebElement isdisplay_sigon;
	
	@FindBy(xpath = "//h4[text()=' Real-time Statistics ']")
	public WebElement realtime;
}
