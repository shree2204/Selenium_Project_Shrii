package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_01_pageObj {
	
	WebDriver driver;

	By txt_username = By.name("username");
	
	By txt_password = By.name("password");
	
	By btn_login = By.xpath("//button[@type='submit']");
	
	By page_text = By.cssSelector("[class] .orangehrm-dashboard-widget:nth-of-type(3) .orangehrm-dashboard-widget-header .oxd-text--p");
	
	
	public TC_01_pageObj(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		
	driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
	driver.findElement(txt_password).sendKeys(password);
	}
	public void clickButton() {
		
	driver.findElement(btn_login).click();
	}
	
	public void pageText() {
		
		String pageText1 = driver.findElement(page_text).getText();	
		String expectedpageText = "Quick Launch";
		String actualpageText = pageText1;
		Assert.assertTrue(actualpageText.contains(expectedpageText));
	}

//==============================================================================================
	
//	TestCase--02
	public void invalidCred() {
		if(driver.getPageSource().contains("Invalid cre")) 
		  {
		  System.out.println("Text Print"); 
		  } else {
		  System.out.println("Text not Print"); }
		
	}
	
//==============================================================================================
	
//	TestCase--03
	public void requiredMsg() {
		if(driver.getPageSource().contains("Req")) 
		  {
		  System.out.println("Text Print"); 
		  } else {
		  System.out.println("Text not Print"); }
	}
	
}
