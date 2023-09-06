package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Job_Titles_PF5 {

	WebDriver driver;
	
	@FindBy(xpath ="//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[2]//i")
	WebElement Job;
	
	@FindBy(xpath ="//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul//ul[@role='menu']/li[1]")
	WebElement JobTitles;
	
	@FindBy(css =".oxd-button.oxd-button--medium.oxd-button--secondary")
	WebElement Add;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']//form[@class='oxd-form']/div[1]/div/div[2]/input")
	WebElement JobTitleField;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']//form[@class='oxd-form']//textarea[@placeholder='Type description here']")
	WebElement JobDescription;
	
	@FindBy(xpath ="(//div[contains(.,'Browse')])[11]")
	WebElement Browse;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']//form[@class='oxd-form']//textarea[@placeholder='Add note']")
	WebElement Note;
	
	@FindBy(css =".orangehrm-left-space.oxd-button.oxd-button--medium.oxd-button--secondary")
	WebElement J_T_Save;
	
	@FindBy(xpath ="(//span[contains(@class,'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message')])[1]")
	WebElement requiredMsg;
	
	@FindBy(xpath ="(//span[contains(@class,'message')])[2]")
	WebElement exceedSizeMsg;
	
	@FindBy(xpath ="(//i[contains(@class,'oxd-icon bi-check oxd-checkbox-input-icon')])[3]")
	WebElement checkbox;
	
	@FindBy(xpath ="(//i[contains(@class,'oxd-icon bi-trash')])[2]")
	WebElement DeleteBtn;
	
	@FindBy(xpath ="//button[@type='button'][contains(.,'Yes, Delete')]")
	WebElement YesDelete;
	
	
	public Job_Titles_PF5(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Job(String role) {
		Job.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JobTitles.click();
	}
	public void add() {
		Add.click();
	}
	public void Job_title_field(String option) {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JobTitleField.sendKeys(option);
	}
    public void Job_Description(String option2) {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	JobDescription.sendKeys(option2);
	}
    public void Browse1() throws AWTException {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	Browse.click();
    	Robot rb = new Robot();

    	rb.delay(2000);
    	StringSelection ss = new StringSelection("C:\\Users\\SHRIRANP\\OneDrive - Capgemini\\Desktop\\orange.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
    public void Note(String option3) {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Note.sendKeys(option3);
    }
    public void J_T_Save() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	J_T_Save.click();
    }
    public void Browse2() throws AWTException {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	Browse.click();
    	Robot rb = new Robot();

    	rb.delay(2000);
    	StringSelection ss = new StringSelection("C:\\Users\\SHRIRANP\\Downloads\\above 1mb.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
    public void requiredMsg() {
    	requiredMsg.getText();
    	System.out.println(requiredMsg.getText());
    }
    public void ExceedMsg() {
    	exceedSizeMsg.getText();
    	System.out.println(exceedSizeMsg.getText());
    }
    public void checkbox() {
    	checkbox.click();
    }
    public void Delete_btn() {
    	DeleteBtn.click();
    }
    public void Yes_Delete() {
    	YesDelete.click();
    }
	
}
