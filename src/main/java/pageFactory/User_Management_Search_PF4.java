package pageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Management_Search_PF4 {
	
	WebDriver driver;

	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']//div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[1]/div/div[2]/input")
	WebElement Username_search;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']//div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[2]/div/div[2]/div[@class='oxd-select-wrapper']/div[1]/div[@class='oxd-select-text-input']")
	WebElement UserRoleSearch;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']//div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[3]/div//div[@class='oxd-autocomplete-wrapper']/div/input[@placeholder='Type for hints...']")
	WebElement EmpNameSearch;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']//div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[4]/div/div[2]/div[@class='oxd-select-wrapper']/div[1]/div[@class='oxd-select-text-input']")
	WebElement StatusSearch;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']//div[@class='oxd-table-filter-area']/form[@class='oxd-form']//button[@type='submit']")
	WebElement SearchBtn;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']//div[@class='oxd-table-filter-area']/form[@class='oxd-form']//button[@type='button']")
	WebElement ResetBtn;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']//div[@role='table']/div[2]/div[3]/div[@role='row']/div[1]//i")
	WebElement CheckBox;
	
	@FindBy(xpath ="/html//div[@id='app']/div[@class='oxd-layout']//div[@role='table']/div[2]/div[3]/div[@role='row']/div[6]/div/button[1]")
	WebElement DeleteBtn;
	
	@FindBy(xpath ="//div[@id='app']/div[@role='dialog']//div[@role='document']/div[@class='orangehrm-modal-footer']/button[2]")
	WebElement ConfirmDelete;
	
	public User_Management_Search_PF4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Username_search(String username) {
		Username_search.sendKeys(Keys.CONTROL + "a");
		Username_search.sendKeys(Keys.DELETE);
		Username_search.sendKeys(username);
	}
	public void selectFromDropdown(WebElement dropdown, String option) {
	    while(!dropdown.getText().equals(option)) dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.click();
	}
    public void User_role_search(String role) {
    	UserRoleSearch.click();
		if (role.isEmpty()) return;
		selectFromDropdown(UserRoleSearch, role);
	}
    public void Emp_name_search(String charr) throws AWTException, InterruptedException {
    	EmpNameSearch.sendKeys(Keys.CONTROL + "a");
    	EmpNameSearch.sendKeys(Keys.DELETE);
    	EmpNameSearch.sendKeys(charr);
    	Robot rb = new Robot();
	    Thread.sleep(5000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
	}
    public void Status_search(String status) {
    	StatusSearch.sendKeys(status);
    	StatusSearch.click();
	}
    public void Search_button() {
    	SearchBtn.click();
    }
    public void Reset_button() {
    	ResetBtn.click();
    }
    public void scroll_down() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,850)","");
    }
    public void Check_box() {
    	CheckBox.click();
    }
    public void Delete_Btn() {
    	DeleteBtn.click();
    }
    public void confirm_Delete() {
    	ConfirmDelete.click();
    }
   
}
