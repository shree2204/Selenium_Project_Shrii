package pageFactory;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF0 {
     
	WebDriver driver;
	
	@FindBy(css ="[class] .orangehrm-dashboard-widget:nth-of-type(3) .orangehrm-dashboard-widget-header .oxd-text--p")
	WebElement page_text;
	
	@FindBy(xpath ="//div[@id='app']//aside[@class='oxd-sidepanel']/nav[@role='navigation']//ul[@class='oxd-main-menu']//a[@href='/web/index.php/pim/viewMyDetails']")
	WebElement my_info;
	
	@FindBy(xpath ="//img[@alt='client brand banner']")
	WebElement AppLogo;
	
	@FindBy(xpath ="/html//div[@id='app']//aside[@class='oxd-sidepanel']/nav[@role='navigation']//button[@role='none']/i")
	WebElement MenuBtn;
	
	@FindBy(xpath ="/html//div[@id='app']//div[@class='oxd-layout-context']/div/div[1]/div//div[@class='orangehrm-dashboard-widget-name']/p[@class='oxd-text oxd-text--p']")
	WebElement WebText;
	
	@FindBy(xpath ="/html//div[@id='app']//div[@class='oxd-layout-context']/div/div[1]/div//button[@type='button']")
	WebElement WebEleCor1;
	
	@FindBy(xpath ="//div[@id='app']//aside[@class='oxd-sidepanel']/nav[@role='navigation']//ul[@class='oxd-main-menu']//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement Admin;
	
	
	
	
        public HomePage_PF0(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
//		PageFactory.initElements(factory, this);
	}
	
	
	public void pageText() {
		String pageText1 = page_text.getText();
		String expectedpageText = "Quick Launch";
		String actualpageText = pageText1;
		Assert.assertTrue(actualpageText.contains(expectedpageText));
	}
	public void myInfo() {
		my_info.click();
	}
	public void App_Logo() {
		AppLogo.isDisplayed();
		if(AppLogo.isDisplayed()) {
       	 System.out.println("displayed");
        }else {
       	 System.out.println("Not displayed");
        }
	}
	public void Menu_Button()  {
		MenuBtn.click();
	}
	public void Web_Text() {
		WebText.getText();
		System.out.println(WebText.getText());
	}
	public void Web_Color() {
		String backColor  = WebEleCor1.getCssValue("background-color");
        System.out.println(backColor);
        String hexBackColor = Color.fromString(backColor).asHex();
        System.out.println(hexBackColor);
        if(hexBackColor.equals("#ff7b1d")) {
       	 System.out.println("Test for find flight passed");
        }else {
       	 System.out.println("Test for find flight failed");
        }
        String Color1  = WebText.getCssValue("background-color");
        System.out.println(backColor);
        String hexBackColor1 = Color.fromString(backColor).asHex();
        System.out.println(hexBackColor);
        if(hexBackColor.equals("#ff7b1d")) {
       	 System.out.println("Test for find flight passed");
        }else {
       	 System.out.println("Test for find flight failed");
        }
	}
	public void Admin_Btn() {
		Admin.click();
	}
	
}
