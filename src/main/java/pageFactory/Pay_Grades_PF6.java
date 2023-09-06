package pageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Pay_Grades_PF6 {

	WebDriver driver;
	
	@FindBy(xpath ="//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[2]//i")
	WebElement Job;
	
	@FindBy(xpath ="//a[@href='#'][contains(.,'Pay Grades')]")
	WebElement paygrades;
	
	@FindBy(xpath ="//button[@type='button'][contains(.,'Add')]")
	WebElement PaygradesAdd;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement PG_nameField;
	
	@FindBy(xpath ="//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
	WebElement Paygrade_save;
	
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement currencies_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement currency_dropdown;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement Min_salary;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement Max_salary;
	
	@FindBy(xpath ="(//button[@type='submit'][contains(.,'Save')])[2]")
	WebElement addCurrency_save;
	
	
	public Pay_Grades_PF6(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void paygrades() throws InterruptedException {
		Thread.sleep(2000);
		Job.click();
		Thread.sleep(2000);
		paygrades.click();
	}
    public void PaygradesAdd() throws InterruptedException {
    	Thread.sleep(2000);
    	PaygradesAdd.click();
	}
    public void PG_nameField(String name) throws InterruptedException {
    	PG_nameField.sendKeys(Keys.CONTROL + "a");
    	PG_nameField.sendKeys(Keys.DELETE);
    	Thread.sleep(2000);
    	PG_nameField.sendKeys(name);
	}
    public void Paygrade_save() throws InterruptedException {
    	Thread.sleep(4000);
    	Paygrade_save.click();
    }
    public void currencies_add() throws InterruptedException {
    	Thread.sleep(2000);
    	currencies_add.click();
    }
    public void currency_dropdown() throws AWTException, InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
    	currency_dropdown.click();
    	Thread.sleep(4000);
    	Robot rb = new Robot();
	    rb.delay(2000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
    }
    public void Min_salary(String salary) throws InterruptedException {
    	Thread.sleep(2000);
    	Min_salary.sendKeys(salary);
    }
    public void Max_salary(String salary2) throws InterruptedException {
    	Thread.sleep(2000);
    	Max_salary.sendKeys(salary2);
    }
    public void addCurrency_save() throws InterruptedException {
    	Thread.sleep(3000);
    	addCurrency_save.click();
    }
    public void currency_dropdown2() throws AWTException, InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
    	currency_dropdown.click();
    	Thread.sleep(4000);
    	Robot rb = new Robot();
	    rb.delay(2000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
    }

}
