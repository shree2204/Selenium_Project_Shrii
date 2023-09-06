package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Organization_PF10 {

	WebDriver driver;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[3]")
	WebElement organization;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
	WebElement general_info;
	
	@FindBy(css =".oxd-switch-input.oxd-switch-input--active.--label-left")
	WebElement edit;
	
	@FindBy(css ="button[type='submit']")
	WebElement GI_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]")
	WebElement Locations;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement Loc_Add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement name;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement zipcode;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/div[2]/input[1]")
	WebElement phone;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement contry;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
	WebElement L_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
	WebElement checkbox;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/button[1]/i[1]")
	WebElement L_delete;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement L_Ydelete;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[3]")
	WebElement structure;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	WebElement stru_edit;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]")
	WebElement stru_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement sub_unit_name;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[2]")
	WebElement sub_unit_save;
	
	@FindBy(xpath ="//button[@class='oxd-icon-button org-action-icon']")
	WebElement stru_delete;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement stru_Ydelete;
	
	public Organization_PF10(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void organization() throws InterruptedException {
		Thread.sleep(2000);
		organization.click();
	}
    public void general_info() throws InterruptedException {
    	Thread.sleep(2000);
    	general_info.click();
	}
    public void edit() throws InterruptedException {
    	Thread.sleep(2000);
    	edit.click();
    }
    public void GI_save() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,750)","");
    	Thread.sleep(2000);
    	GI_save.click();
	}
    public void Locations() throws InterruptedException {
    	Thread.sleep(2000);
    	Locations.click();
    }
    public void Loc_Add() throws InterruptedException {
    	Thread.sleep(2000);
    	Loc_Add.click();
    }
    public void Enter_all_Detailes(String A, String B, String C) throws InterruptedException, AWTException {
    	Thread.sleep(2000);
    	name.sendKeys(A);
    	Thread.sleep(2000);
    	zipcode.sendKeys(B);
    	Thread.sleep(2000);
    	phone.sendKeys(C);
    	contry.click();
    	Robot rb = new Robot();
        rb.delay(2000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	}
    public void L_save() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)","");
    	Thread.sleep(5000);
    	L_save.click();
    }
    public void checkbox() throws InterruptedException {
    	Thread.sleep(2000);
    	checkbox.click();
    }
    public void L_delete() throws InterruptedException {
    	Thread.sleep(2000);
    	L_delete.click();
    }
    public void L_Ydelete() throws InterruptedException {
    	Thread.sleep(2000);
    	L_Ydelete.click();
    }
    public void structure() throws InterruptedException {
    	organization.click();
    	Thread.sleep(2000);
    	structure.click();
    }
    public void stru_edit() throws InterruptedException {
    	Thread.sleep(2000);
    	stru_edit.click();
    }
    public void stru_add() throws InterruptedException {
    	Thread.sleep(2000);
    	stru_add.click();
    }
    public void sub_unit_name(String H) throws InterruptedException {
    	Thread.sleep(2000);
    	sub_unit_name.sendKeys(H);
    }
    public void sub_unit_save() throws InterruptedException {
    	Thread.sleep(2000);
    	sub_unit_save.click();
    }
    public void stru_delete() throws InterruptedException {
    	Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)","");
        Thread.sleep(2000);
    	stru_delete.click();
    }
    public void stru_Ydelete() throws InterruptedException {
    	Thread.sleep(2000);
    	stru_Ydelete.click();
    }
}
