package baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver browser_launch(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 2021-12\\workspace\\Mavenproject\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	
	public static boolean elementisdisplay(WebElement element) {
		boolean display=false;
		try {
			display=element.isDisplayed();
		} catch (Exception e) {
			System.err.println("the element is not available :"+e.getMessage());
		}
		return display;
	}
	public static void elementsendkey(WebElement element,String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.err.println("The value can't be passed :"+e.getMessage());
		}
	}
	public static void elementlclick(WebElement element) {
		try {
			
			WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(30));
			wb.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			System.err.println("The button can't able to click"+e.getMessage());
		}
	}
	public static byte[] screenshot() {
		byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	   return screenshotAs;
	
	}
	
	public static void actionclick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.click(element).build().perform();
	}
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
}
