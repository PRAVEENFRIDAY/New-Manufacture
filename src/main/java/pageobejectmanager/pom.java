package pageobejectmanager;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import locaters.Casescreen;
import locaters.Homepage;
import locaters.Loginpage;
import locaters.Manufacturedetails;
import locaters.Upload;

public class pom extends BaseClass {
	
	public pom(WebDriver driver) {
		this.driver=driver;
	}

	private Loginpage loginpage;

	public Loginpage getLoginpage() {
		if (loginpage==null) {
			loginpage=new Loginpage(driver);
		}
		return loginpage;
	}
	private Homepage homepage;

	public Homepage getHomepage() {
		if (homepage==null) {
			homepage=new Homepage(driver);
			
		}
		return homepage;
	}
	
 private Casescreen casescreen;

public Casescreen getCasescreen() {
	if (casescreen==null) {
	casescreen =new Casescreen(driver);
	}
	return casescreen;
}
  private Manufacturedetails manufacturedetails;

public Manufacturedetails getManufacturedetails() {
	if (manufacturedetails==null) {
		manufacturedetails =new Manufacturedetails(driver);
		
	}
	return manufacturedetails;
}

private Upload upload;

public Upload getUpload() {
	if (upload==null) {
		upload =new Upload(driver);	
	}
	return upload;
} 
  

}
