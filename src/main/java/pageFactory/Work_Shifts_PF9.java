package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Work_Shifts_PF9 {

	WebDriver driver;
	
	@FindBy(xpath ="//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[2]//i")
	WebElement Job;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
	WebElement Work_shifts;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement Work_S_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement Shift_name;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]")
	WebElement from_watch;
	
	@FindBy(css ="input[value='AM']")
	WebElement Am;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/i[2]")
	WebElement Hour_down;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")
	WebElement to_watch;
	
	@FindBy(css ="input[value='PM']")
	WebElement Pm;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/i[1]")
	WebElement Hour_up;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement assign_Emp;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/button[2]")
	WebElement WS_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
	WebElement checkbox;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/button[1]/i[1]")
	WebElement delete;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement Ydelete;
	
	
	public Work_Shifts_PF9(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Work_shifts() throws InterruptedException {
		Job.click();
		Thread.sleep(2000);
		Work_shifts.click();
	}
    public void Work_S_add() throws InterruptedException {
    	Thread.sleep(2000);
    	Work_S_add.click();
	}
    public void Shift_name(String A) throws InterruptedException {
    	Thread.sleep(2000);
    	Shift_name.sendKeys(A);
    }
    public void Set_working_hours() throws InterruptedException {
    	from_watch.click();
    	Thread.sleep(2000);
    	Am.click();
    	Thread.sleep(2000);
    	Actions act = new Actions(driver);
    	act.doubleClick(Hour_down).perform();
    	Thread.sleep(2000);
    	to_watch.click();
    	Thread.sleep(2000);
    	Pm.click();
    	Thread.sleep(2000);
    	act.doubleClick(Hour_up).perform();
    }
    public void assign_Emp(String B) throws InterruptedException {
    	Thread.sleep(2000);
    	assign_Emp.sendKeys(B);
    }
    public void WS_save() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,450)","");
    	Thread.sleep(2000);
    	WS_save.click();
    }
    public void checkbox() throws InterruptedException {
    	Thread.sleep(2000);
    	checkbox.click();
    }
    public void delete() throws InterruptedException {
    	Thread.sleep(2000);
    	delete.click();
    }
    public void Ydelete() throws InterruptedException {
    	Thread.sleep(2000);
    	Ydelete.click();
    }
    
	
}
