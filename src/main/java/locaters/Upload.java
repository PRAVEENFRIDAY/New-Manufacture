package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Upload extends BaseClass{
   
	public Upload(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@type='file'])[1]")
	public WebElement upload_natis;
	
	@FindBy(xpath = "(//input[@type='file'])[2]")
	public WebElement upload_registration;
	
	@FindBy(xpath = "(//input[@type='file'])[3]")
	public WebElement upload_homolagation;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[6]")
	public WebElement upload_next_button;
	
	@FindBy(xpath = "//h2[text()='AMBASSDARS']")
	public WebElement ambas;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[9]")
	public WebElement last_next;
	
	@FindBy(xpath = "//h3[text()='Case Details']")
	public WebElement case_details;
}
