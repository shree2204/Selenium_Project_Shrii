Feature: OrangeHRM Website Functionality
  Description: TestCase_01 to TestCase_03

 # Multiple login without different parameters
  @pinfo @all @TC_1_Login
  Scenario Outline: Log-in with valid username and password
    Given Open the browser3
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "<username>" and password "<password>"
    And Click on login button
    Then User must successfully login to the web page

    Examples: 
      | username |  | password |
      | Admin    |  | admin123 |

      
  @pinfo @all  @TC_02
  Scenario Outline: Log-in with Invalid credentials 
  Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "<username>" and password "<password>"
	And Click on login button
	Then Invalid credentials must be displayed to the user
	
	Examples:
	| username |   | password   |
	| Admin    |   | admin1     |   # valid username and wrong password 
	| Adminnn  |   | admin123   |   # wrong username and valid password 
	| Adminnn  |   | admin1     |   # wrong username and wrong password 
	
	 
	 
	@pinfo @all @TC_03
	Scenario Outline: Log-in with Blank credentials
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "<username>" and password "<password>"
	And Click on login button
	Then Required must be displayed to the user
	
	Examples:
	| username |   | password   |
	| Admin    |   |            |   # valid username and blank password 
	| Adminnn  |   |            |   # wrong username and blank password 
	|          |   | admin123   |   # blank username and valid password 
	|          |   | admin1     |   # blank username and wrong password
  |          |   |            |   # blank username and blank password
	





