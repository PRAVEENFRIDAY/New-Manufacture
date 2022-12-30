package stepdefenition.com;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobejectmanager.pom;

public class Stepdefenition extends BaseClass {
	@Given("user lauch the {string} Browser")
	public void user_lauch_the_browser(String string) {
	   browser_launch(string);
	}

	@Given("user navigate the url {string}")
	public void user_navigate_the_url(String string) {
	    geturl(string);
	}
	
	pom obj=new pom(driver);
	
	@Then("user wants to click on the login button")
	public void user_wants_to_click_on_the_login_button() {
	    elementlclick(obj.getLoginpage().login_error_button);
	}

	
	  @Then("user verify login page") public void user_verify_login_page() {
	  assertTrue(elementisdisplay(obj.getLoginpage().isdisplay_sigon));
	 
	}

	@Then("user enter the valid username {string}")
	public void user_enter_the_valid_username(String string) {
	   elementsendkey(obj.getLoginpage().username, string);
	}

	@Then("user enter the valid password {string}")
	public void user_enter_the_valid_password(String string) {
	   elementsendkey(obj.getLoginpage().password, string );
	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		elementlclick(obj.getLoginpage().sign_on);
	   
	}

	@Then("user verify the login successfully")
	public void user_verify_the_login_successfully() throws InterruptedException {
		Thread.sleep(3000);
	    assertTrue(elementisdisplay(obj.getLoginpage().realtime));
	}
	
	@Then("user wants to click burget button")
	public void user_wants_to_click_burget_button() throws InterruptedException {
		Thread.sleep(3000);
	    elementlclick(obj.getHomepage().burger_button);
	}
	@Then("user clicks on the case button")
	public void user_clicks_on_the_case_button() {
	    elementlclick(obj.getHomepage().case_button);
	}
	@Then("user verify the case screen")
	public void user_verify_the_case_screen() throws InterruptedException  {	
		Thread.sleep(30000);
		assertTrue(elementisdisplay(obj.getHomepage().verify_case) );
		
		
	}
	
	

	@Then("user wants to click on the Create case button")
	public void user_wants_to_click_on_the_create_case_button() throws InterruptedException  {
		Thread.sleep(10000);	
		jsClick(obj.getCasescreen().create_button);
	    
	}
	@Then("user click on the case type button")
	public void user_click_on_the_case_type_button()  {
		elementlclick(obj.getCasescreen().case_type);
		
	}
	@Then("user clicks on the New manufacture button'")
	public void user_clicks_on_the_new_manufacture_button()  {
		elementlclick(obj.getCasescreen().new_manufacture);
		
	}
	@Then("user clicks on the nect button")
	public void user_clicks_on_the_nect_button() throws InterruptedException {
		elementlclick(obj.getCasescreen().next_button);
		
	}
	@Then("verify the manufacture details page")
	public void verify_the_manufacture_details_page() {
		assertTrue(elementisdisplay(obj.getCasescreen().manufacture_screen));
	    }
	@Then("user enter the manufacture name {string}")
	public void user_enter_the_manufacture_name(String string) {
	    elementsendkey(obj.getManufacturedetails().man_name, string);
	}
	@Then("user click the country origin button")
	public void user_click_the_country_origin_button() {
	   elementlclick(obj.getManufacturedetails().origin);
	}
	@Then("user selects the respective country")
	public void user_selects_the_respective_country() {
	    elementlclick(obj.getManufacturedetails().country_name);
	}
	@Then("user  enter the emails name {string}")
	public void user_enter_the_emails_name(String string) {
	    elementsendkey(obj.getManufacturedetails().email, string);
	}
	@Then("user enter the manufacture number {string}")
	public void user_enter_the_manufacture_number(String string) {
	    elementsendkey(obj.getManufacturedetails().man_number, string);
	}
	@Then("user clicks on the next button")
	public void user_clicks_on_the_next_button() {
	    elementlclick(obj.getManufacturedetails().next_button);
	}
	@Then("user verify the Manufacture screen")
	public void user_verify_the_manufacture_screen() throws InterruptedException {
		Thread.sleep(30000);
	    assertTrue(elementisdisplay(obj.getManufacturedetails().verify_page));
	}
	@Then("user clicks on the upload natis button")
	public void user_clicks_on_the_upload_natis_button()  {
	    
	    elementsendkey(obj.getUpload().upload_natis, "C:\\Eclipse IDE 2021-12\\workspace\\Mavenproject\\src\\test\\resources\\upload\\Test eNatis.pdf");
	}
	@Then("user clicks on the upload registration button")
	public void user_clicks_on_the_upload_registration_button()  {
		
	    elementsendkey(obj.getUpload().upload_registration, "C:\\Eclipse IDE 2021-12\\workspace\\Mavenproject\\src\\test\\resources\\manufacture\\Test Manufacturer Registration.pdf");
	}
	@Then("user clicks on the upload homolagation button")
	public void user_clicks_on_the_upload_homolagation_button()  {
		
	    elementsendkey(obj.getUpload().upload_homolagation, "C:\\Eclipse IDE 2021-12\\workspace\\Mavenproject\\src\\test\\resources\\homologation\\Test Homologation.pdf");
	}
	@Then("user verify the upload is done")
	public void user_verify_the_upload_is_done() throws InterruptedException {
		Thread.sleep(3000);
	    assertTrue(elementisdisplay(obj.getUpload().ambas));
	}
	@Then("user clicks on the lastnext button")
	public void user_clicks_on_the_lastnext_button() {
	    jsClick(obj.getUpload().last_next);
	}
	@Then("user verify the case details page for the manufacture")
	public void user_verify_the_case_details_page_for_the_manufacture() throws InterruptedException {
		Thread.sleep(3000);
	    assertTrue(elementisdisplay(obj.getUpload().case_details));
	}
}
