package pageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage_PF3 {
    WebDriver driver;
    
	
	@FindBy(css ="ul > .--parent.--visited.oxd-topbar-body-nav-tab")
	WebElement UserManagement;
	
	@FindBy(css =".orangehrm-header-container .oxd-button--secondary")
	WebElement AddBtn;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[1]/div/div[2]/div[@class='oxd-select-wrapper']/div[1]")
	WebElement UserRole1;
	
	@FindBy(xpath="//label[contains(normalize-space(),'User Role')]/../..//div[@class='oxd-select-text-input']")
    WebElement UserRole;

    @FindBy(xpath="//label[contains(normalize-space(),'Status')]/../..//div[@class='oxd-select-text-input']")
    WebElement Status;
    
    @FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[4]/div/div[2]/input")
    WebElement Username;
    
    @FindBy(xpath ="//div[@id='app']//form[@class='oxd-form']/div[@class='oxd-form-row user-password-row']/div/div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']/div//input[@type='password']")
    WebElement Password;
    
    @FindBy(xpath ="//div[@id='app']//form[@class='oxd-form']/div[@class='oxd-form-row user-password-row']/div/div[@class='oxd-grid-item oxd-grid-item--gutters']/div//input[@type='password']")
    WebElement Re_Password;
	
    @FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']//form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[2]/div//div[@class='oxd-autocomplete-wrapper']/div/input[@placeholder='Type for hints...']")
    WebElement EmpHint;
    
    @FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']//form[@class='oxd-form']//button[@type='submit']")
    WebElement save;
	
	
	public AdminPage_PF3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void User_Management() {
		UserManagement.click();
	}
	public void Add_Button() {
		AddBtn.click();
	}
//	public void selectFromDropdown(WebElement dropdown, String option) {
//	    while(!dropdown.getText().equals(option)) dropdown.sendKeys(Keys.ARROW_DOWN);
//		dropdown.click();
//	}
	public void role() throws AWTException {
		UserRole.click();
//		if (role.isEmpty()) return;
//		selectFromDropdown(UserRole, role);
		Robot rb = new Robot();
	    rb.delay(3000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
	    UserRole.click();
	}
     public void Status() throws AWTException {
		Status.click();
		Robot rb = new Robot();
		rb.delay(3000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
	}
	public void Emp_Hint(String charr) {
		EmpHint.sendKeys(charr);
	}
	public void UserName(String username) {
		Username.sendKeys(username);
	}
	public void PassWord(String password) {
		Password.sendKeys(password);
	}
	public void Re_enter_password(String Repass) {
		Re_Password.sendKeys(Repass);
	}
	public void savebtn() {
		save.click();
	}
	
	
	
}
