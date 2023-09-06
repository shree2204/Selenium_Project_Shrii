package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AdminPage_PF3;
import pageFactory.Configuration_PF12;
import pageFactory.Emp26_status_PF7;
import pageFactory.HomePage_PF0;
import pageFactory.Job_Titles_PF5;
import pageFactory.Job_categories_PF8;
import pageFactory.LoginPage_PF;
import pageFactory.Organization_PF10;
import pageFactory.PIM_PF1;
import pageFactory.Pay_Grades_PF6;
import pageFactory.Qualifications_PF11;
import pageFactory.User_Management_Search_PF4;
import pageFactory.Work_Shifts_PF9;

public class stepDefinition {

	public WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF0 obj;
	PIM_PF1 obj1;
	AdminPage_PF3 obj3;
	User_Management_Search_PF4 obj4;
	Job_Titles_PF5 obj5;
	Pay_Grades_PF6 obj6;
	Emp26_status_PF7 obj7;
	Job_categories_PF8 obj8;
	Work_Shifts_PF9 obj9;
	Organization_PF10 obj10;
	Qualifications_PF11 obj11;
	Configuration_PF12 obj12;
	
	
	@Given("Open the browser")
	public void open_the_browser() {
	    ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:/Users/SHRIRANP/eclipse-workspace/OrangeHRM_CucumberPF_Project/lib/chromedriver.exe");
	    driver = new ChromeDriver(co);
//		System.setProperty("webdriver.firefox.marionette","C:/Users/SHRIRANP/eclipse-workspace/Cucumber02/lib/geckodriver.exe");  
//	    driver = new FirefoxDriver();
//	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@When("Open the browser2")
	public void open_the_browser2() {
		System.setProperty("webdriver.firefox.marionette","C:/Users/SHRIRANP/eclipse-workspace/OrangeHRM_CucumberPF_Project/lib/geckodriver.exe");  
	    driver = new FirefoxDriver();
	}
	@When("Open the browser3")
	public void open_the_browser3() {
		EdgeOptions co1 = new EdgeOptions();
        co1.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver","C:/Users/SHRIRANP/eclipse-workspace/OrangeHRM_CucumberPF_Project/lib/msedgedriver.exe");
	    driver = new EdgeDriver(co1);
	    driver.manage().window().maximize();
	}
    @When("Navigate to the URL {string}")
	public void navigate_to_the_url(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get(url);
	}
	@When("Enter registered username {string} and password {string}")
	public void enter_registered_username_and_password(String username, String password) throws InterruptedException {
	    login = new LoginPage_PF(driver);
		Thread.sleep(2000);
		login.enterUsername(username);
		Thread.sleep(2000);
		login.enterPassword(password);
	}
	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		login.btnClick();
	}

	@Then("User must successfully login to the web page")
	public void user_must_successfully_login_to_the_web_page() throws InterruptedException {
	    
		obj = new HomePage_PF0(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)","");
		
		Thread.sleep(2000);
		obj.pageText();
	}
//======================================================================================================================================
	//	TestCase--02
	@Then("Invalid credentials must be displayed to the user")
	public void invalid_credentials_must_be_displayed_to_the_user() throws InterruptedException {
		Thread.sleep(2000);
		login.invalidCred();
	}
//======================================================================================================================================
//  TestCase--03
	@Then("Required must be displayed to the user")
	public void required_must_be_displayed_to_the_user() throws InterruptedException {
		 Thread.sleep(2000);
		 login.requiredMsg();
	}
//======================================================================================================================================
//	TestCase--04
	@When("Click on my Info button")
	public void click_on_my_info_button() throws InterruptedException {
		Thread.sleep(2000);
		obj = new HomePage_PF0(driver);
		obj.myInfo();
	}
    @Then("Verify following fields Employee ID, SSN No, SIN No, Driver License No, Date of Birth")
	public void verify_following_fields_employee_id_ssn_no_sin_no_driver_license_no_date_of_birth() throws InterruptedException {
	    
		obj1 = new PIM_PF1(driver);
		Thread.sleep(2000);
		System.out.println("checking field Employee ID");
		obj1.EmpId();
		System.out.println("SSN Number");
		obj1.SSNno();
		System.out.println("SIN Number");
		obj1.SINno();
		System.out.println("Driver's License Number");
		obj1.DLN();
		System.out.println("Date of Birth");
		obj1.DOB();
	}
//=====================================================================================================================================
//   TestCase--05
	
	@When("Remove default value from First name field")
	public void remove_default_value_from_first_name_field() throws InterruptedException {
		Thread.sleep(2000);
		obj1 = new PIM_PF1(driver);
		obj1.Remove_default();
	}
    @When("Enter valid value {string} in First Name field")
	public void enter_valid_value_in_first_name_field(String firstN) {
	    obj1.FirstN_field(firstN);
	}

	@Then("Click on Save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(2000);
		obj1.SaveBtn();
	}
//=====================================================================================================================================
//     TestCase--06
	@Then("Clear default text from first name field")
	public void clear_default_text_from_first_name_field() throws InterruptedException {
		Thread.sleep(2000);
		obj1 = new PIM_PF1(driver);
	    obj1.Remove_default();
	}
    @Then("click on PD save button")
	public void click_on_PD_save_button() throws InterruptedException {
		Thread.sleep(2000);
	    obj1.SaveBtn();
	}

	@Then("Verify the error message is first name field is required")
	public void verify_the_error_message_is_first_name_field_is_required() throws InterruptedException {
		Thread.sleep(2000);
	    obj1.ErrorMsg_FN();
	}
//======================================================================================================================================	
//     TestCase--07
	@When("Click on Image Icon")
	public void click_on_image_icon() throws InterruptedException {
		Thread.sleep(2000);
		obj1 = new PIM_PF1(driver);
		obj1.ImageIcon();
	}
    @When("Click on add button and choose a image file")
	public void click_on_add_button_and_choose_a_image_file() throws InterruptedException {
		Thread.sleep(2000);
		obj1.Add_Jpg();
	}
    @Then("click on save button , image should to be changed")
	public void click_on_save_button_image_should_to_be_changed() throws InterruptedException {
		Thread.sleep(2000);
		obj1.Img_save();
	}
//=====================================================================================================================================
//    TestCase--08
	@When("Click on add button and choose a PNG file")
	public void click_on_add_button_and_choose_a_png_file() throws InterruptedException {
		Thread.sleep(2000);
		obj1.Add_Png();
	}
//=====================================================================================================================================
//    TestCase--09
	@When("Click on add button and choose a GIF file")
	public void click_on_add_button_and_choose_a_gif_file() throws InterruptedException {
		Thread.sleep(2000);
		obj1.Add_Gif();
	}
//=====================================================================================================================================
//    TestCase--10
	@When("Click on add button and choose a docx file")
	public void click_on_add_button_and_choose_a_docx_file() throws InterruptedException {
		Thread.sleep(2000);
		obj1.Add_Docs();
	}
    @Then("Error massage must be displayed to the user")
	public void error_massage_must_be_displayed_to_the_user() {
		obj1 = new PIM_PF1(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		obj1.Img_Error();
	}
//=====================================================================================================================================
//    TestCase--11
	@When("Click on add button and choose a above {int} mb file")
	public void click_on_add_button_and_choose_a_above_mb_file(Integer int1) {
	    obj1.Add_above1mb_Jpg();
	}

	@Then("Size Exceeded massage must be displayed to the user")
	public void size_exceeded_massage_must_be_displayed_to_the_user() {
	    obj1.Size_Exceed_Msg();
	}
//=====================================================================================================================================
//    TestCase--12
	@When("Click on add button and  choose png over size a file")
	public void click_on_add_button_and_choose_png_over_size_a_file() {
	    obj1.Add_above1mb_Png();
	}
//=====================================================================================================================================
//    TestCase--13_01
	@Then("The page load time is measured by the user")
	public void the_page_load_time_is_measured_by_the_user() {
		login = new LoginPage_PF(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login.Load_Time_Measure();
	}

	@Then("The page load time should be less than {int} second")
	public void the_page_load_time_should_be_less_than_second(Integer int1) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login.Page_Load_time_less_than_10sec();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
		driver.quit();
	}
//==================================================================================================================================
//     TestCase--13_02
	@When("The user should be view the application logo")
	public void the_user_should_be_view_the_application_logo() {
		obj = new HomePage_PF0(driver);
	    obj.App_Logo();
	}

	@When("Check no of charactor limitation with {string} and popup error msg and validate main menu Btn function")
	public void check_no_of_charactor_limitation_with_and_popup_error_msg_and_validate_main_menu_btn_function(String firstN) throws InterruptedException {
	    Thread.sleep(2000);
	    obj.myInfo();
	    Thread.sleep(2000);
	    Thread.sleep(2000);
	    obj1 = new PIM_PF1(driver);
	    obj1.FirstN_field(firstN);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    obj1.Exceed_30Char();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    obj.Menu_Button();
	}

	@Then("To check the btn save is having color green or not")
	public void to_check_the_btn_save_is_having_color_green_or_not() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,450)","");
	    
	    String expected = "#76BC21";
	    obj1.SaveBtn1();
	}
//====================================================================================================================================
//    TestCase--14
	@Then("Check the pages are fit in a web browser displayed on a computer set to {int} x {int} pixels")
	public void check_the_pages_are_fit_in_a_web_browser_displayed_on_a_computer_set_to_x_pixels(Integer int1, Integer int2) {
		Dimension dimension = new Dimension(640, 480);
  	  driver.manage().window().setSize(dimension);
  	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
  	  driver.manage().window().maximize();
  	  
  	  driver.manage().window().setSize(dimension);
  	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
  	  driver.manage().window().maximize();
  	  
  	  System.out.println("pages are fit in a web browser displayed on a computer set to 640 x 480 pixels");
	}
//====================================================================================================================================
//     TestCase--15
	@When("Verify screen resolution of Homepage")
	public void verify_screen_resolution_of_homepage() {
		obj = new HomePage_PF0(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		Dimension resolution = new Dimension(1920, 1080);
		driver.manage().window().setSize(resolution);
		driver.manage().window().fullscreen();
		
		obj.Web_Text();
	}
    @Then("Check the color codes of Homepage webelement")
	public void check_the_color_codes_of_homepage_webelement() {
	    obj.Web_Color();
	}
//=====================================================================================================================================
//     TestCase--16
	@When("verify browser compatibility, screen resolution, and UI acceptance test")
	public void verify_browser_compatibility_screen_resolution_and_ui_acceptance_test() throws InterruptedException {
		login = new LoginPage_PF(driver);
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		Thread.sleep(4000);
		login.Site_Logo();  
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		Dimension resolution = new Dimension(1920, 1080);
		driver.manage().window().setSize(resolution);
	}

	@Then("Navigate all browsers with Forword, back and Refresh")
	public void navigate_all_browsers_with_forword_back_and_refresh() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.navigate().refresh();
	}
//=====================================================================================================================================
//     TestCase--19
	@When("A static image must be correctly shown")
	public void a_static_image_must_be_correctly_shown() throws InterruptedException {
		login = new LoginPage_PF(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
        
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(4000);
        login.site_side_logo();
	}
//=====================================================================================================================================
//     TestCase--20
	@When("Click on Admin button")
	public void click_on_admin_button() {
		obj = new HomePage_PF0(driver);
		obj.Admin_Btn();
	}
    @When("Select Users from User Management")
	public void select_users_from_user_management() throws InterruptedException {
	    obj3 = new AdminPage_PF3(driver);
	    Thread.sleep(2000);
	    obj3.User_Management();
	}
    @When("Click on Add button")
	public void click_on_add_button() throws InterruptedException {
		Thread.sleep(2000);
	    obj3.Add_Button();
	}
	@When("Select the user role as Admin")
	public void select_the_user_role_as_admin() throws AWTException{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		obj3.role();
	}
    @When("Select status as a enabled from the status dropdown")
	public void select_status_as_a_enabled_from_the_status_dropdown() throws AWTException{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    obj3.Status();
	}
    @When("Add Employee name to the employee name field")
	public void add_employee_name_to_the_employee_name_field() throws InterruptedException, AWTException {
	    obj3.Emp_Hint("s");
	    Robot rb = new Robot();
	    Thread.sleep(6000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
	}
    @When("Add Username to the username field")
	public void add_username_to_the_username_field() throws InterruptedException {
		Thread.sleep(2000);
	    obj3.UserName("Shriii2204");
	}
    @When("Add Password to the password field")
	public void add_password_to_the_password_field() throws InterruptedException {
	   Thread.sleep(2000);
	   obj3.PassWord("ShreE#22p");
	}
    @When("Re-enter the password in password confirmation field")
	public void re_enter_the_password_in_password_confirmation_field() {
	   obj3.Re_enter_password("ShreE#22p");
	}
	@Then("Click on save1 button")
	public void click_on_save1_button() {
	    obj3.savebtn();
	}
//============================================================================================================================================
//     TestCase--21
	@When("Search each one separately like use Username or UserRole or Employee name or status")
	public void search_each_one_separately_like_use_username_or_user_role_or_employee_name_or_status() throws InterruptedException, AWTException {
		obj4 = new User_Management_Search_PF4(driver);
		obj4.Username_search("Admin");
		Thread.sleep(2000);
		obj4.Search_button();
		Thread.sleep(2000);
		obj4.Reset_button();
		obj4.User_role_search("Admin");
		obj4.Search_button();
		Thread.sleep(2000);
		obj4.Reset_button();
		obj4.Emp_name_search("f");
		Thread.sleep(6000);
		obj4.Search_button();
		Thread.sleep(2000);
		obj4.Reset_button();
		obj4.Status_search("Enabled");
		Thread.sleep(3000);
		obj4.Search_button();
		Thread.sleep(2000);
	}
    @Then("Click on Search")
	public void click_on_search() {
    	obj4.Search_button();
	}
    @Then("Search multiple criteria like by Username and UserRole")
	public void search_multiple_criteria_like_by_username_and_user_role() throws InterruptedException {
		obj4.Username_search("Admin");
		Thread.sleep(2000);
		obj4.User_role_search("Admin");
	}
    @Then("Search multiple criteria like by Username and UserRole and Employee name")
	public void search_multiple_criteria_like_by_username_and_user_role_and_employee_name() throws InterruptedException, AWTException {
		obj4.Username_search("Admin");
		Thread.sleep(2000);
		obj4.User_role_search("Admin");
		Thread.sleep(2000);
		obj4.Emp_name_search("s");
		Thread.sleep(4000);
	}
    @Then("Search multiple criteria like by Username and UserRole and Employee name and status")
	public void search_multiple_criteria_like_by_username_and_user_role_and_employee_name_and_status() throws InterruptedException, AWTException {
		obj4.Username_search("Admin");
		Thread.sleep(2000);
		obj4.User_role_search("Admin");
		Thread.sleep(2000);
		obj4.Emp_name_search("s");
		Thread.sleep(4000);
		obj4.Status_search("Enabled");
		Thread.sleep(3000);
	}
    @Then("Click on Reset button and check all value clear or not")
	public void click_on_reset_button_and_check_all_value_clear_or_not() throws InterruptedException {
    	Thread.sleep(8000);
    	obj4.Reset_button();
	}
//=====================================================================================================================================
//      TestCase--22
    @When("Scroll down user management page")
    public void scroll_down_user_management_page() {
    	obj4 = new User_Management_Search_PF4(driver);
    	obj4.scroll_down();
    }
    @When("Click on Check box")
    public void click_on_check_box() {
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       obj4.Check_box();
    }
    @Then("Click on delete button")
    public void click_on_delete_button() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        obj4.Delete_Btn();
    }
    @Then("Click on Yes-delete button for delete system user")
    public void click_on_yes_delete_button_for_delete_system_user() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj4.confirm_Delete();
    }
//====================================================================================================================================
//      TestCase--23_1
    @When("Select Job Titles from Job")
    public void select_job_titles_from_job() {
    	obj5 = new Job_Titles_PF5(driver);
    	obj5.Job("Job Titles");
    }
    @When("Click on Job Titles add button")
    public void click_on_job_titles_add_button() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        obj5.add();
    }
    @Then("In Edit Job Title enter {string} and {string} and {string}")
    public void in_edit_job_title_enter_and_and(String option, String option2, String option3) {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.Job_title_field(option);
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.Job_Description(option2);
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.Note(option3);
    }
    @Then("Validate Job Specification having less than and greater than {int} mb file")
    public void validate_job_specification_having_less_than_and_greater_than_mb_file(Integer int1) throws AWTException {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.Browse1();
    }
    @Then("Click on Job Title Save button")
    public void click_on_job_title_save_button() {
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       obj5.J_T_Save();
    }
//===============================================================================================================================
//    TestCase--23_2
    @Then("Validate Job Specification having greater than {int} mb file")
    public void validate_job_specification_having_greater_than_mb_file(Integer int1) throws AWTException {
        obj5.Browse2();
    }
    @Then("Check Error massage displayed or not")
    public void check_error_massage_displayed_or_not() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.requiredMsg();
    	obj5.ExceedMsg();
}
//===============================================================================================================================
//   TestCase--24
    @When("Click on a Job titles Checkbox")
    public void click_on_a_job_titles_checkbox() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.checkbox();
    }
    @When("Click on a Job Titles Delete button")
    public void click_on_a_job_titles_delete_button() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.Delete_btn();
    }
    @Then("Click on Yes-delete button for delete Job Titles")
    public void click_on_yes_delete_button_for_delete_job_titles() {
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	obj5.Yes_Delete();
    }
//===============================================================================================================================
//   TestCase--25
    @When("Select Pay Grades from Job")
    public void select_pay_grades_from_job() throws InterruptedException {
    	obj6 = new Pay_Grades_PF6(driver);
    	obj6.paygrades();
    }
    @When("Click on Pay Grades add button")
    public void click_on_pay_grades_add_button() throws InterruptedException {
    	obj6.PaygradesAdd();
    }
    @When("Enter in Name field {string} and click on save button")
    public void enter_in_name_field_and_click_on_save_button(String name) throws InterruptedException {
        obj6.PG_nameField(name);
        obj6.Paygrade_save();
    }
    @When("Click on Currencies add button")
    public void click_on_currencies_add_button() throws InterruptedException {
    	obj6.currencies_add();
    }
    @When("Select AFN Afghanistan Afghani from currency dropdown")
    public void select_afn_afghanistan_afghani_from_currency_dropdown() throws AWTException, InterruptedException {
    	obj6.currency_dropdown();
    }
    @When("Enter Minimum Salary {string} and maximum salary {string}")
    public void enter_minimum_salary_and_maximum_salary(String salary, String salary2) throws InterruptedException {
        obj6.Min_salary(salary);
        obj6.Max_salary(salary2);
    }
    @Then("click on Add currency save button")
    public void click_on_add_currency_save_button() throws InterruptedException {
       obj6.addCurrency_save();
    }
    @Then("Select AED Utd Arab Emir Dirham from currency dropdown")
    public void select_aed_utd_arab_emir_dirham_from_currency_dropdown() throws AWTException, InterruptedException {
    	obj6.currency_dropdown2();
    }
//=============================================================================================================================
//    TestCase--26
    @When("Select Employment status from Job")
    public void select_employment_status_from_job() throws InterruptedException {
    	obj7 = new Emp26_status_PF7(driver);
    	obj7.job();
    	obj7.Emp_status();
    }
    @When("Click on Emp status add button")
    public void click_on_emp_status_add_button() throws InterruptedException {
        obj7.Emp_s_add();
    }
    @When("Enter in Employment status name field {string} and click on save button")
    public void enter_in_employment_status_name_field_and_click_on_save_button(String A) throws InterruptedException {
        obj7.Emp_name_save(A);
    }
    @When("Click on saved field edit button")
    public void click_on_saved_field_edit_button() throws InterruptedException {
        obj7.edit();
    }
    @When("Change Employment status name field with {string} and click on save button")
    public void change_employment_status_name_field_with_and_click_on_save_button(String B) throws InterruptedException {
        obj7.Emp_name1_save1(B);
    }
    @When("Click on field check box")
    public void click_on_field_check_box() throws InterruptedException {
        obj7.Emp_checkbox();
    }
    @When("Click on Delete1 button")
    public void click_on_delete1_button() throws InterruptedException {
        obj7.delete();
    }
    @Then("Click on Yes Delete button")
    public void click_on_yes_delete_button() throws InterruptedException {
        obj7.Yes_delete();
    }
//=================================================================================================================================
//     TestCase--27
    @When("Select Job Categories from Job")
    public void select_job_categories_from_job() throws InterruptedException {
        obj8 = new Job_categories_PF8(driver);
        obj8.JobCatego();
    }
    @When("Click on Job Categories add button")
    public void click_on_job_categories_add_button() throws InterruptedException {
        obj8.JC_add();
    }
    @When("Enter in Job Categories name field {string} and click on save button")
    public void enter_in_job_categories_name_field_and_click_on_save_button(String A) throws InterruptedException {
        obj8.JC_name_save(A);
    }
    @When("Click on Jfield check box")
    public void click_on_jfield_check_box() throws InterruptedException {
        obj8.JC_checkbox();
    }
    @When("Click on Delete2 buttonS")
    public void click_on_delete2_button_s() throws InterruptedException {
        obj8.JC_Delete();
    }
    @Then("Click on Yes Delete2 button")
    public void click_on_yes_delete2_button() throws InterruptedException {
        obj8.JC_YDelete();
    }
//===================================================================================================================================
//     TestCase--28
    @When("Select Work Shifts from Job")
    public void select_work_shifts_from_job() throws InterruptedException {
    	obj9 = new Work_Shifts_PF9(driver);
    	obj9.Work_shifts();
    }
    @When("Click on Work Shifts add button")
    public void click_on_work_shifts_add_button() throws InterruptedException {
        obj9.Work_S_add();
    }
    @When("Enter shift name as {string}")
    public void enter_shift_name_as(String A) throws InterruptedException {
        obj9.Shift_name(A);
    }
    @When("Set Working hours {double} AM to {double} PM")
    public void set_working_hours_am_to_pm(Double double1, Double double2) throws InterruptedException {
       obj9.Set_working_hours();
    }
    @When("Enter Assigned Employees in Field")
    public void enter_assigned_employees_in_field() throws AWTException, InterruptedException {
    	obj9.assign_Emp("g");
    	Robot rb = new Robot();
	    Thread.sleep(6000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyRelease(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER); 
    }
    @When("Click on Work Shifts save button")
    public void click_on_work_shifts_save_button() throws InterruptedException {
        obj9.WS_save();
    }
    @When("Click on work shifts checkbox")
    public void click_on_work_shifts_checkbox() throws InterruptedException {
        obj9.checkbox();
    }
    @When("Click on work shifts delete")
    public void click_on_work_shifts_delete() throws InterruptedException {
       obj9.delete();
    }
    @When("Click on work shifts Ydelete")
    public void click_on_work_shifts_ydelete() throws InterruptedException {
        obj9.Ydelete();
    }
//=================================================================================================================================
//     TestCase--29
    @When("Select General Information from Organization")
    public void select_general_information_from_organization() throws InterruptedException {
    	obj10 = new Organization_PF10(driver);
    	obj10.organization();
    	obj10.general_info();
    }
    @When("Click on GI edit button")
    public void click_on_gi_edit_button() throws InterruptedException {
        obj10.edit();
    }
    @When("Save updated detailes in general information")
    public void save_updated_detailes_in_general_information() throws InterruptedException {
        obj10.GI_save();
    }
//=================================================================================================================================
//    testCase--30
    @When("Select Locations from Organization")
    public void select_locations_from_organization() throws InterruptedException {
    	obj10 = new Organization_PF10(driver);
    	obj10.organization();
    	obj10.Locations();
    	System.out.println("TestCase Start");
    }
    @When("Click on Locations add button")
    public void click_on_locations_add_button() throws InterruptedException {
       obj10.Loc_Add();
    }
    @When("Enter add locations detailes as name {string} zipcode {string} phone {string}")
    public void enter_add_locations_detailes_as_name_zipcode_phone(String A, String B, String C) throws InterruptedException, AWTException {
        obj10.Enter_all_Detailes(A, B, C);
    }
    @When("Click on Locations save buttton")
    public void click_on_locations_save_buttton() throws InterruptedException {
       obj10.L_save();
    }
    @When("Click on Locations checkbox")
    public void click_on_locations_checkbox() throws InterruptedException {
        obj10.checkbox();
    }
    @When("Click on Locations delete button")
    public void click_on_locations_delete_button() throws InterruptedException {
        obj10.L_delete();
    }
    @When("Click on Locations Ydelete button")
    public void click_on_locations_ydelete_button() throws InterruptedException {
        obj10.L_Ydelete();
        System.out.println("TestCase Complete");
        
    }
//==============================================================================================================================================
//     TestCase--31
    @When("Select Structures from Organization")
    public void select_structures_from_organization() throws InterruptedException {
    	obj10 = new Organization_PF10(driver);
    	obj10.structure();
    	System.out.println("TestCase Start");
    }
    @When("Click on Structures edit button")
    public void click_on_structures_edit_button() throws InterruptedException {
        obj10.stru_edit();
    }
    @When("Click on Structures plus add button")
    public void click_on_structures_plus_add_button() throws InterruptedException {
        obj10.stru_add();
    }
    @When("Enter name as {string} in name field")
    public void enter_name_as_in_name_field(String H) throws InterruptedException {
       obj10.sub_unit_name(H);
    }
    @When("Click on Structures save button")
    public void click_on_structures_save_button() throws InterruptedException {
       obj10.sub_unit_save();
    }
    @When("Click on Structures delete button")
    public void click_on_structures_delete_button() throws InterruptedException {
       obj10.stru_delete();
    }
    @When("Click on Structures Ydelete button")
    public void click_on_structures_ydelete_button() throws InterruptedException {
       obj10.stru_Ydelete();
       System.out.println("TestCase Complete");
    }
//=================================================================================================================================
//     testCase--32
    @When("Select Skills from Qualifications")
    public void select_skills_from_qualifications() throws InterruptedException {
    	obj11 = new Qualifications_PF11(driver);
    	obj11.skills();
    	System.out.println("TestCase Start");
    }
    @When("Click on Q add")
    public void click_on_q_add() throws InterruptedException {
        obj11.Quali_add();
    }
    @When("Enter Skill name {string} and save")
    public void enter_skill_name_and_save(String a) throws InterruptedException {
       obj11.Quali_name(a);
    }
    @When("Select Education from Qualifications")
    public void select_education_from_qualifications() throws InterruptedException {
           obj11.Education();
    }
    @When("Enter Education name {string} and save")
    public void enter_education_name_and_save(String b) throws InterruptedException {
        obj11.Quali_name2(b);
    }
    @When("Select Licenses from Qualifications")
    public void select_licenses_from_qualifications() throws InterruptedException {
        obj11.Licenses();
    }
    @When("Enter Licenses name {string} and save")
    public void enter_licenses_name_and_save(String c) throws InterruptedException {
       obj11.Quali_name3(c);
    }
    @When("Select Languages from Qualifications")
    public void select_languages_from_qualifications() throws InterruptedException {
       obj11.Languages();
    }
    @When("Enter Languages name {string} and save")
    public void enter_languages_name_and_save(String d) throws InterruptedException {
       obj11.Quali_name4(d);
    }
    @When("Select Memberships from Qualifications")
    public void select_memberships_from_qualifications() throws InterruptedException {
       obj11.Memberships();
    }
    @When("Enter Memberships name {string} and save")
    public void enter_memberships_name_and_save(String f) throws InterruptedException {
       obj11.Quali_name5(f);
       System.out.println("TestCase Complete");
    }
//===========================================================================================================================
//     TestCase--33
    @When("Click on Nationalities")
    public void click_on_nationalities() throws InterruptedException {
    	obj11 = new Qualifications_PF11(driver);
    	obj11.Nationalities();
    	System.out.println("TestCase Start");
    }
    @When("Click on Nationalities add button")
    public void click_on_nationalities_add_button() throws InterruptedException {
        obj11.Nati_add();
    }
    @When("Enter in Nationalities name field as {string}")
    public void enter_in_nationalities_name_field_as(String a) throws InterruptedException {
       obj11.Nati_name(a);
    }
    @When("Click on Nationalities save button")
    public void click_on_nationalities_save_button() throws InterruptedException {
       obj11.Nati_save();
    }
    @Then("Verify delete function in Nationalities")
    public void verify_delete_function_in_nationalities() throws InterruptedException {
       obj11.Nati_checkbox();
       obj11.Nati_delete();
       obj11.Nati_Ydelete();
       System.out.println("TestCase Complete");
    }
//===============================================================================================================================
//     TestCase--34
    @When("Select Email Configuration from Configuration")
    public void select_email_configuration_from_configuration() throws InterruptedException {
    	obj12 = new Configuration_PF12(driver);
    	obj12.configuration();
    	obj12.Email_confi();
    	System.out.println("TestCase Start");
    }
    @When("Enter all details and click on save button")
    public void enter_all_details_and_click_on_save_button() throws InterruptedException {
       obj12.Email_confi_save();
    }
    @When("Click on Email subscriptions")
    public void click_on_email_subscriptions() throws InterruptedException {
       obj12.configuration();
       obj12.Email_subscri();
    }
    @When("Save any one Email subscriptions record")
    public void save_any_one_email_subscriptions_record() throws InterruptedException {
       obj12.Email_subscri_enable();
    }
    @When("Click on Localization")
    public void click_on_localization() throws InterruptedException {
    	obj12.configuration();
    	obj12.Localization();
    }
    @When("Select Chinese taiwan language from dropdown and save")
    public void select_chinese_taiwan_language_from_dropdown_and_save() throws InterruptedException, AWTException {
       obj12.Loca_dropdown();
       obj12.Loca_save();
    }
    @When("Click on Language packages and then click add button")
    public void click_on_language_packages_and_then_click_add_button() throws InterruptedException {
    	obj12.configuration();
        obj12.Langu_package();
        obj12.Langu_package_add();
    }
    @When("Select afrikaans language from dropdown and then save")
    public void select_afrikaans_language_from_dropdown_and_then_save() throws InterruptedException, AWTException {
       obj12.Langu_package_dropdown();
       obj12.Langu_package_dropdown_save();
       System.out.println("TestCase Complete");
    }
//===========================================================================================================================================
//     TestCase--35
    @When("Select Modules from Configuration")
    public void select_modules_from_configuration() throws InterruptedException {
    	obj12 = new Configuration_PF12(driver);
    	obj12.configuration();
    	obj12.Modules();
    	System.out.println("TestCase Start");
    }
    @When("First disable then again enable time module")
    public void first_disable_then_again_enable_time_module() throws InterruptedException {
        obj12.time_module();
    }
    @Then("Click on module configuration save button")
    public void click_on_module_configuration_save_button() throws InterruptedException {
       obj12.TM_save();
       System.out.println("TestCase Complete");
    }
}
//=======================================================================================================================================
    



