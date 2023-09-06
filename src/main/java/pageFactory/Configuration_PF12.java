package pageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configuration_PF12 {

	WebDriver driver;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[7]")
	WebElement configuration;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")
	WebElement Email_confi;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement Email_confi_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[7]/ul[1]/li[2]")
	WebElement Email_subscri;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/span[1]")
	WebElement Email_subscri_enable;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[7]/ul[1]/li[3]/a[1]")
	WebElement Localization;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement Loca_dropdown;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
	WebElement Loca_save;
	
	@FindBy(css ="header[class='oxd-topbar'] li:nth-child(4) a:nth-child(1)")
	WebElement Langu_package;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement Langu_package_add;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	WebElement Langu_package_dropdown;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/button[2]")
	WebElement Langu_package_dropdown_save;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[7]/ul[1]/li[5]/a[1]")
	WebElement Modules;
	
	@FindBy(css ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > label:nth-child(1) > span:nth-child(2)")
	WebElement time_module;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement TM_save;
	
	public Configuration_PF12(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void configuration() throws InterruptedException {
		Thread.sleep(3000);
		configuration.click();
	}
	public void Email_confi() throws InterruptedException {
		Thread.sleep(2000);
		Email_confi.click();
	}
	public void Email_confi_save() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,750)","");
		Email_confi_save.click();
	}
	public void Email_subscri() throws InterruptedException {
		Thread.sleep(3000);
		Email_subscri.click();
	}
	public void Email_subscri_enable() throws InterruptedException {
		Thread.sleep(2000);
		Email_subscri_enable.click();
	}
	public void Localization() throws InterruptedException {
		Thread.sleep(2000);
		Localization.click();
	}
	public void Loca_dropdown() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		Loca_dropdown.click();
		Robot rb = new Robot();
	    rb.delay(3000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
	}
	public void Loca_save() throws InterruptedException {
		Thread.sleep(3000);
		Loca_save.click();
	}
	public void Langu_package() throws InterruptedException {
		Thread.sleep(4000);
		Langu_package.click();
	}
	public void Langu_package_add() throws InterruptedException {
		Thread.sleep(2000);
		Langu_package_add.click();
	}
	public void Langu_package_dropdown() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		Langu_package_dropdown.click();
		Robot rb = new Robot();
	    rb.delay(2000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
	}
	public void Langu_package_dropdown_save() throws InterruptedException {
		Thread.sleep(2000);
		Langu_package_dropdown_save.click();
	}
	public void Modules() throws InterruptedException {
		Thread.sleep(2000);
		Modules.click();
	}
    public void time_module() throws InterruptedException {
/*		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(time_module).perform();
*/      time_module.click();
        Thread.sleep(4000);
        time_module.click();

	}
    public void TM_save() throws InterruptedException {
    	Thread.sleep(2000);
    	TM_save.click();
	}
}
