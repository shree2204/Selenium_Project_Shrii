Feature: OrangeHRM Website Functionality
  Description: TestCase_20 to TestCase_23

  @pinfo @all @TC_20
  Scenario: Verify OrangeHrm Admin module user management and Add feature
  Given Open the browser3
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter registered username "Admin" and password "admin123"
  And Click on login button
  And Click on Admin button
  And Select Users from User Management
  And Click on Add button
  And Select the user role as Admin
  And Select status as a enabled from the status dropdown
  And Add Employee name to the employee name field
  And Add Username to the username field
  And Add Password to the password field
  And Re-enter the password in password confirmation field
  Then Click on save1 button
  
  @pinfo @all @TC_21
  Scenario: Validate OrangeHrm User management search and or reset feature
  Given Open the browser3
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter registered username "Admin" and password "admin123"
  And Click on login button
  And Click on Admin button
  And Select Users from User Management
  And Search each one separately like use Username or UserRole or Employee name or status
  And Click on Admin button
  And Search multiple criteria like by Username and UserRole
  Then Click on Search
  And Search multiple criteria like by Username and UserRole and Employee name
  Then Click on Search
  And Search multiple criteria like by Username and UserRole and Employee name and status
  Then Click on Search
  Then Click on Reset button and check all value clear or not
  
  @pinfo @all @TC_22
  Scenario: Validate OrangeHrm User management Delete feature with checkbox
  Given Open the browser2
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter registered username "Admin" and password "admin123"
  And Click on login button
  And Click on Admin button
  And Scroll down user management page
  And Click on Check box
  Then Click on delete button
  Then Click on Yes-delete button for delete system user
  
  @pinfo @all @TC_23_1
  Scenario: Validate OrangeHrm Job Job Titles with mandatory fields
  Given Open the browser2
  When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter registered username "<username>" and password "<password>"
  And Click on login button
  And Click on Admin button
  And Select Job Titles from Job
  And Click on Job Titles add button
  Then In Edit Job Title enter "<Job Title>" and "<Job Description>" and "<Note>"
  And Validate Job Specification having less than and greater than 1 mb file
  Then Click on Job Title Save button
  
  
  Examples:
  | username |  | password |   | Job Title       |  | Job Description    | |  Note        |
  | Admin    |  | admin123 |   | Java Developer  |  | SpringBoot         | |   note       |
  
  @pinfo @all @TC_23_2
  Scenario: Validate OrangeHrm Job Job Titles empty fields
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "<username>" and password "<password>"
    And Click on login button
    And Click on Admin button
    And Select Job Titles from Job
    And Click on Job Titles add button
    Then In Edit Job Title enter "<Job Title>" and "<Job Description>" and "<Note>"
    And Validate Job Specification having greater than 1 mb file
    And Click on Job Title Save button
    Then Check Error massage displayed or not

    Examples: 
      | username |  | password |  | Job Title |  | Job Description |  | Note |
      | Admin    |  | admin123 |  |           |  | SpringBoot      |  | note |
      
  @pinfo @all @TC_24
  Scenario: Validate OrangeHrm Job Title Delete feature with checkbox
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Job Titles from Job
    And Click on a Job titles Checkbox
    And Click on a Job Titles Delete button
    Then Click on Yes-delete button for delete Job Titles
    
  @pinfo @all @TC_25
  Scenario: Validate OrangeHrm Pay Grade by setting min salary max salary and the currency to be pain in
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Pay Grades from Job
    And Click on Pay Grades add button
    And Enter in Name field "kjhas" and click on save button
    And Click on Currencies add button
    And Select AFN Afghanistan Afghani from currency dropdown
    And Enter Minimum Salary "150" and maximum salary "150"
    Then click on Add currency save button
    And Enter in Name field "lknds" and click on save button
    And Click on Currencies add button
    And Select AED Utd Arab Emir Dirham from currency dropdown
    And Enter Minimum Salary "300" and maximum salary "250"
    Then click on Add currency save button
    
  @pinfo @all @TC_26
  Scenario: Validate OrangeHrm SubMenu Employee status
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Employment status from Job
    And Click on Emp status add button
    And Enter in Employment status name field "asui" and click on save button
    And Click on saved field edit button
    And Change Employment status name field with "kion" and click on save button
    And Click on field check box
    And Click on Delete1 button
    Then Click on Yes Delete button
    
  @pinfo @all @TC_27
  Scenario: Validate OrangeHrm Job Categories from Job
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Job Categories from Job
    And Click on Job Categories add button
    And Enter in Job Categories name field "asui" and click on save button
    And Click on Jfield check box
    And Click on Delete2 buttonS
    Then Click on Yes Delete2 button
    
  @pinfo @all @TC_28
  Scenario: Validate OrangeHrm Work Shifts from Job
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Work Shifts from Job
    And Click on Work Shifts add button
    And Enter shift name as "wolf"
    And Set Working hours 7.00 AM to 3.00 PM
    And Enter Assigned Employees in Field
    And Click on Work Shifts save button
    And Click on work shifts checkbox
    And Click on work shifts delete
    And Click on work shifts Ydelete
    
  @pinfo @all @TC_29
  Scenario: Validate OrangeHrm General Information from Organization
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select General Information from Organization
    And Click on GI edit button
    And Save updated detailes in general information
    
  @pinfo @all @TC_30
  Scenario: Validate OrangeHrm Locations from Organization
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Locations from Organization
    And Click on Locations add button
    And Enter add locations detailes as name "shri" zipcode "415221" phone "9876543" 
    And Click on Locations save buttton
    And Click on Locations checkbox
    And Click on Locations delete button
    And Click on Locations Ydelete button
    
  @pinfo @all @TC_31
  Scenario: Validate OrangeHrm Structures from Organization
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Structures from Organization
    And Click on Structures edit button
    And Click on Structures plus add button
    And Enter name as "QA deweweqsasas" in name field
    And Click on Structures save button
    And Click on Structures delete button
    And Click on Structures Ydelete button
    
  @pinfo @all @TC_32
  Scenario: Validate OrangeHrm Submenu from Qualifications
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Skills from Qualifications
    And Click on Q add
    And Enter Skill name "java" and save
    And Select Education from Qualifications
    And Click on Q add
    And Enter Education name "Btech" and save
    And Select Licenses from Qualifications
    And Click on Q add
    And Enter Licenses name "kjhui" and save
    And Select Languages from Qualifications
    And Click on Q add
    And Enter Languages name "Btech" and save
    And Select Memberships from Qualifications
    And Click on Q add
    And Enter Memberships name "dgo" and save
    
  @pinfo @all @TC_33
  Scenario: Validate OrangeHrm Nationalities
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Click on Nationalities
    And Click on Nationalities add button
    And Enter in Nationalities name field as "ukranin"
    And Click on Nationalities save button
    Then Verify delete function in Nationalities
    
  @pinfo @all @TC_34
  Scenario: Validate OrangeHrm Submenu from Configuration
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Email Configuration from Configuration
    And Enter all details and click on save button
    And Click on Email subscriptions
    And Save any one Email subscriptions record
    And Click on Localization
    And Select Chinese taiwan language from dropdown and save
    And Click on Language packages and then click add button
    And Select afrikaans language from dropdown and then save
    
  @pinfo @all @TC_35
  Scenario: Validate OrangeHrm Modules from Configuration
    Given Open the browser2
    When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Enter registered username "Admin" and password "admin123"
    And Click on login button
    And Click on Admin button
    And Select Modules from Configuration
    And First disable then again enable time module
    Then Click on module configuration save button