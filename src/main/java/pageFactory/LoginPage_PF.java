package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;
	
	@FindBy(name ="username")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(name ="password")
	@CacheLookup
	WebElement txt_password;
	
	@FindBy(xpath ="//button[@type='submit']")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(css =".orangehrm-login-branding > img[alt='company-branding']")
	WebElement SiteLogo;
	
	@FindBy(xpath ="//div[@class='orangehrm-login-logo']//img[@src='/web/images/ohrm_logo.png']")
	WebElement SiteSideLogo;
	
	
	public LoginPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String username) {
		
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		
		txt_password.sendKeys(password);
	}
	public void btnClick() {
		
		btn_login.click();
	}
	
	public void invalidCred() {
		if(driver.getPageSource().contains("Invalid cre")) 
		  {
		  System.out.println("Text Print"); 
		  } else {
		  System.out.println("Text not Print"); }
		
	}
	public void requiredMsg() {
		if(driver.getPageSource().contains("Req")) 
		  {
		  System.out.println("Text Print"); 
		  } else {
		  System.out.println("Text not Print"); }
	}
	public void Load_Time_Measure() {
		Long loadTime = (Long) ((JavascriptExecutor) driver).executeScript(
	    "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
	}
	public void Page_Load_time_less_than_10sec() {
		long loadTime = 0;
		if(loadTime < 10000) {
        	  System.out.println("Page load successfully within 10 sec");
          }else {
        	  System.out.println("Page took more than 10 sec to load");
          }
	}
	public void Site_Logo() {
		if(SiteLogo.isDisplayed()) {
	    	  System.out.println("Logo is present on the webpage");
	      }else {
	    	  System.out.println("Logo is not present on the webpage");
	      }
	}
	public void site_side_logo() {
		if(SiteSideLogo.isDisplayed()) {
		    System.out.println("Logo is present on the webpage");
	        }else {
		    System.out.println("Logo is not present on the webpage");
	}
	}
}