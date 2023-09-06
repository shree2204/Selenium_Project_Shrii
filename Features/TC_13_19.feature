Feature: OrangeHRM Website Functionality
  Description: TestCase_13 to TestCase_19
  
  @pinfo @all @TC_13_1
	Scenario: Validate page load time over a 56k modem connection
  Given Open the browser3
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  Then The page load time is measured by the user
  Then The page load time should be less than 10 second
  And Close the browser

  @pinfo @all @TC_13_2
	Scenario Outline: Validate the Admin page UI and functionality
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "<username>" and password "<password>"
	And Click on login button
	And The user should be view the application logo
	And Check no of charactor limitation with "<firstN>" and popup error msg and validate main menu Btn function
	Then To check the btn save is having color green or not
	
	Examples: 
      | username |  | password |   | firstN                          | 
      | Admin    |  | admin123 |   | asdfghjklzxcvbnmpoiuytrewqasdfg |
      
  
  @pinfo @all @TC_14
	Scenario: Validate pagefit in a web browser displayed on a computer set to pixels
  Given Open the browser3
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter registered username "Admin" and password "admin123"
  And Click on login button
  And Click on my Info button
  Then Click on Image Icon
  Then Check the pages are fit in a web browser displayed on a computer set to 640 x 480 pixels
  
  @pinfo @all @TC_15
	Scenario: Validate browser compatibility, screen resolution and UI acceptance test of Homepage
  Given Open the browser3
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter registered username "Admin" and password "admin123"
  And Click on login button
	And Verify screen resolution of Homepage
	Then Check the color codes of Homepage webelement
	
	@pinfo @all @TC_16
	Scenario: Validate the site is compatible with Edge browser, Firefox browser and Google chrome
	Given Open the browser
	When Open the browser2
	When Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And verify browser compatibility, screen resolution, and UI acceptance test 
	Then Navigate all browsers with Forword, back and Refresh
	
	@pinfo @all @TC_19
	Scenario: Validate page fit in a web browser displayed on a computer set to pixels
  Given Open the browser3
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And A static image must be correctly shown
	