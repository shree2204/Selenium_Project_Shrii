Feature: OrangeHRM Website Functionality
  Description: TestCase_04 to TestCase_07



  @pinfo @all @TC_04
	Scenario: Check the fields on the Personal information Page
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	Then Verify following fields Employee ID, SSN No, SIN No, Driver License No, Date of Birth
	
	
	@pinfo @all @TC_05
	Scenario: Modification with valid values - First Name
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Remove default value from First name field
	And Enter valid value "shrirangPatil" in First Name field
	Then Click on Save button
	
	
	@pinfo @all @TC_06
  Scenario: Verify error message when FirstName field is blank
    Given Open the browser3
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Enter registered username "Admin" and password "admin123"
    Then Click on login button
    And Click on my Info button
    And Clear default text from first name field
    Then click on PD save button
    And Verify the error message is first name field is required
    
	
	