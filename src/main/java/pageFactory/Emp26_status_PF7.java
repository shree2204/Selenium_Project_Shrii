package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emp26_status_PF7 {

	WebDriver driver;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	WebElement Emp_status;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement Emp_status_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement Emp_s_name;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")
	WebElement Emp_n_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/button[2]/i[1]")
	WebElement Emp_s_edit;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
	WebElement Emp_s_checkbox;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/button[1]/i[1]")
	WebElement Emp_s_delete;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]")
	WebElement Y_delete;
	
	@FindBy(xpath ="//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[2]//i")
	WebElement Job;
	
	public Emp26_status_PF7(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void job() {
		Job.click();
	}
	public void Emp_status() throws InterruptedException {
		Thread.sleep(2000);
		Emp_status.click();
	}
    public void Emp_s_add() throws InterruptedException {
    	Thread.sleep(2000);
    	Emp_status_add.click();
	}
    public void Emp_name_save(String A) throws InterruptedException {
    	Emp_s_name.sendKeys(A);
    	Thread.sleep(2000);
    	Emp_n_save.click();
    }
    public void edit() throws InterruptedException {
    	Thread.sleep(2000);
    	Emp_s_edit.click();
	}
    public void Emp_name1_save1(String B) throws InterruptedException {
    	Emp_s_name.sendKeys(B);
    	Thread.sleep(2000);
    	Emp_n_save.click();
    }
    public void Emp_checkbox() throws InterruptedException {
    	Thread.sleep(2000);
    	Emp_s_checkbox.click();
    }
    public void delete() throws InterruptedException {
    	Thread.sleep(2000);
    	Emp_s_delete.click();
    }
    public void Yes_delete() throws InterruptedException {
    	Thread.sleep(2000);
    	Y_delete.click();
}
    
}
