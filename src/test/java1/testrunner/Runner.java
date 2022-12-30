package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java1\\feature",glue = {"stepdefenition.com" , "hooks.com"},dryRun = false
, tags = "@TC105", plugin = {"html:target\\Report\\Adactin_Report.html" ,
		"json:target\\Report\\Adactin_jReport.json"  ,
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner {
	
}
