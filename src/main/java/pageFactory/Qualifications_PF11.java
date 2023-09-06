package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qualifications_PF11 {
	
	WebDriver driver;

	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]")
	WebElement skills;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[2]")
	WebElement Education;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]")
	WebElement Licenses;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[4]/a[1]")
	WebElement Languages;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[5]/a[1]")
	WebElement Memberships;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	WebElement Quali_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement Quali_name;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
	WebElement Quali_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[4]/span[1]")
	WebElement Qualification;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]")
	WebElement Nationalities;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement Nati_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement Nati_name;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")
	WebElement Nati_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
	WebElement Nati_checkbox;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/button[1]/i[1]")
	WebElement Nati_delete;
	
	@FindBy(css ="button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement Nati_Ydelete;
	
	public Qualifications_PF11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Quali_add() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Quali_add.click();
	}
    public void Quali_name(String a) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	Quali_name.sendKeys(a);
	}
    public void Quali_name2(String b) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	Quali_name.sendKeys(b);
	}
    public void Quali_name3(String c) throws InterruptedException {
    	Thread.sleep(2000);
    	Quali_name.sendKeys(c);
	}
    public void Quali_name4(String d) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	Quali_name.sendKeys(d);
	}
    public void Quali_name5(String f) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	Quali_name.sendKeys(f);
	}
    public void Quali_save() throws InterruptedException {
    	Thread.sleep(2000);
    	Quali_save.click();
    }
    public void skills() throws InterruptedException {
    	Thread.sleep(2000);
    	Qualification.click();
    	skills.click();
    }
    public void Education() throws InterruptedException {
    	Thread.sleep(2000);
    	Qualification.click();
    	Education.click();
    }
    public void Licenses() throws InterruptedException {
    	Thread.sleep(2000);
    	Qualification.click();
    	Licenses.click();
	}
    public void Languages() throws InterruptedException {
    	Thread.sleep(2000);
    	Qualification.click();
    	Languages.click();
	}
    public void Memberships() throws InterruptedException {
    	Thread.sleep(2000);
    	Qualification.click();
    	Memberships.click();
    }
    public void Nationalities() throws InterruptedException {
    	Thread.sleep(2000);
    	Nationalities.click();
    }
    public void Nati_add() throws InterruptedException {
    	Thread.sleep(2000);
    	Nati_add.click();
    }
    public void Nati_name(String a) throws InterruptedException {
    	Thread.sleep(2000);
    	Nati_name.sendKeys(a);
    }
    public void Nati_save() throws InterruptedException {
    	Thread.sleep(2000);
    	Nati_save.click();
    }
    public void Nati_checkbox() throws InterruptedException {
    	Thread.sleep(2000);
    	Nati_checkbox.click();
    }
    public void Nati_delete() throws InterruptedException {
    	Thread.sleep(2000);
    	Nati_delete.click();
    }
    public void Nati_Ydelete() throws InterruptedException {
    	Thread.sleep(2000);
    	Nati_Ydelete.click();
    }
	
}
