package locaters;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Manufacturedetails extends BaseClass {

	public Manufacturedetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "mat-input-1")
	public WebElement man_name;
	
	@FindBy(id = "mat-select-value-5")
	public WebElement origin;
	
	@FindBy(xpath = "//span[text()=' India ']")
	public WebElement country_name;
	
	@FindBy(id = "mat-input-2")
	public WebElement email;
	
	@FindBy(id = "mat-input-3")
	public WebElement man_number;
	
	@FindBy(xpath = "//div[@class='ml-2 mb-1']")
	public WebElement next_button;
	
	@FindBy(xpath = "//p[text()='Upload Attachments']")
	public WebElement verify_page;
	
}
