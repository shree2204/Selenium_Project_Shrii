package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_categories_PF8 {

	WebDriver driver;
	
	@FindBy(xpath ="//div[@id='app']//header[@class='oxd-topbar']//nav[@role='navigation']/ul/li[2]//i")
	WebElement Job;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[4]")
	WebElement JobCatego;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement JC_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement JC_nameField;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement JC_nameSave;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
	WebElement JC_checkbox;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/button[1]/i[1]")
	WebElement JC_Delete;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement JC_YDelete;
	
	public Job_categories_PF8(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void JobCatego() throws InterruptedException {
		Job.click();
		Thread.sleep(2000);
		JobCatego.click();
	}
    public void JC_add() throws InterruptedException {
    	Thread.sleep(2000);
    	JC_add.click();
	}
    public void JC_name_save(String A) throws InterruptedException {
    	Thread.sleep(2000);
    	JC_nameField.sendKeys(A);
    	Thread.sleep(2000);
    	JC_nameSave.click();
    }
    public void JC_checkbox() throws InterruptedException {
    	Thread.sleep(2000);
    	JC_checkbox.click();
    }
    public void JC_Delete() throws InterruptedException {
    	Thread.sleep(2000);
    	JC_Delete.click();
    }
    public void JC_YDelete() throws InterruptedException {
    	Thread.sleep(2000);
    	JC_YDelete.click();
    }
}
