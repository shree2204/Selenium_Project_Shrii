package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PIM_PF1 {

	WebDriver driver;

	@FindBy(css = "div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) > .oxd-input-field-bottom-space.oxd-input-group  .oxd-label")
	WebElement EmpId;

	@FindBy(css = "div:nth-of-type(3) > div:nth-of-type(1) > .oxd-input-field-bottom-space.oxd-input-group  .oxd-label")
	WebElement SSNno;

	@FindBy(css = "div:nth-of-type(3) > div:nth-of-type(2) > .oxd-input-field-bottom-space.oxd-input-group  .oxd-label")
	WebElement SINno;

	@FindBy(css = "div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > .oxd-input-field-bottom-space.oxd-input-group  .oxd-label")
	WebElement DLN;

	@FindBy(css = "div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(1) > .oxd-input-field-bottom-space.oxd-input-group  .oxd-label")
	WebElement DOB;

	@FindBy(xpath = "//*[@name='firstName']")
	WebElement FirstName;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement SaveBtn;

	@FindBy(css = ".orangehrm-background-container img[alt='profile picture']")
	WebElement Photo;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/input")
	WebElement UploadFile;

	@FindBy(css = ".oxd-form-actions > .orangehrm-left-space.oxd-button.oxd-button--medium.oxd-button--secondary")
	WebElement ImgSaveBtn;
	
	@FindBy(xpath ="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement ImgErrorMsg;
	
	@FindBy(xpath ="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement SizeExceedMsg;
	
	@FindBy(xpath ="//div[@id='app']//div[@class='orangehrm-background-container']//div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[1]/div[1]/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group']/div[@class='--name-grouped-field']/div[1]/span[.='Should not exceed 30 characters']")
	WebElement Exceed30Char;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	WebElement FirstN_errorMsg;
	

	public PIM_PF1(WebDriver driver) {

		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}

	public void EmpId() {
		Assert.assertTrue(EmpId.isDisplayed());
	}

	public void SSNno() {
		Assert.assertTrue(SSNno.isDisplayed());
	}

	public void SINno() {
		Assert.assertTrue(SINno.isDisplayed());
	}

	public void DLN() {
		Assert.assertTrue(DLN.isDisplayed());
	}

	public void DOB() {
		Assert.assertTrue(DOB.isDisplayed());
	}

	public void Remove_default() {
		FirstName.sendKeys(Keys.CONTROL + "a");
		FirstName.sendKeys(Keys.DELETE);
	}

	public void FirstN_field(String firstN) {
		FirstName.sendKeys(firstN);
	}

	public void SaveBtn() {
		SaveBtn.click();
	}
	public void SaveBtn1() {
		String btnColor = SaveBtn.getCssValue("background-color");
        System.out.println(btnColor);
        String hexColor = Color.fromString(btnColor).asHex();
        System.out.println(hexColor);
	}

	public void ImageIcon() {
		Photo.click();
	}

	public void Add_Jpg() {
		UploadFile.sendKeys("C:\\Users\\SHRIRANP\\OneDrive - Capgemini\\Desktop\\orange.jpeg");
	}

	public void Img_save() {
		ImgSaveBtn.click();
	}

	public void Add_Png() {
		UploadFile.sendKeys("C:\\Users\\SHRIRANP\\Downloads\\welcomein.png");
	}

	public void Add_Gif() {
		UploadFile.sendKeys("C:\\Users\\SHRIRANP\\Downloads\\gifImage.gif");
	}
	
	public void Add_Docs() {
		UploadFile.sendKeys("C:\\Users\\SHRIRANP\\Downloads\\shivam.docx");
	}
	
	public void Img_Error() {
	    ImgErrorMsg.getText();
		System.out.println(ImgErrorMsg.getText());
	}
	public void Add_above1mb_Jpg() {
		UploadFile.sendKeys("C:\\Users\\SHRIRANP\\Downloads\\above 1mb.jpg");
	}
	public void Size_Exceed_Msg() {
		SizeExceedMsg.getText();
		System.out.println(SizeExceedMsg.getText());
	}
	public void Add_above1mb_Png() {
		UploadFile.sendKeys("C:\\Users\\SHRIRANP\\Downloads\\png above1 mb.png");
	}
	public void Exceed_30Char() {
		Exceed30Char.getText();
		System.out.println(Exceed30Char.getText());
	}
	public void ErrorMsg_FN() {
		FirstN_errorMsg.getText();
		System.out.println(FirstN_errorMsg.getText());
	}
}
