package locaters;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Homepage extends BaseClass{
	
	public Homepage(WebDriver Driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this );
	}
	
	@FindBy(xpath = "//mat-icon[text()='menu']")
	public WebElement burger_button;
	
	@FindBy(xpath = "(//div[@class='mat-list-item-content'])[2]")
	public WebElement case_button;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
	public WebElement verify_case;
	
	

}
