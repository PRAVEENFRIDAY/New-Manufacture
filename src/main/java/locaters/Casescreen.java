package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class Casescreen extends BaseClass {

	public Casescreen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


	
	//@FindBy(xpath = "//div[text()=' Create New Case ']")
	@FindBy(id="create-case-button")
	public WebElement create_button;
	
	@FindBy(id = "mat-select-value-3")
	public WebElement case_type;
	
	@FindBy(xpath = "//span[text()=' New Manufacturer ']")
	public WebElement new_manufacture;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[2]")
	public WebElement next_button;
	
	@FindBy(xpath = "(//span[text()='Create Case - New Manufacturer'])")
	public WebElement manufacture_screen;
}
