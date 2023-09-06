Feature: OrangeHRM Website Functionality
  Description: TestCase_07 to TestCase_12
  
  
  @pinfo @all @TC_07
	Scenario: Check the upload of a JPG format image
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Click on Image Icon
	And Click on add button and choose a image file
	Then click on save button , image should to be changed
	
	
	@pinfo @all @TC_08
	Scenario: Check the upload of a PNG format image
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Click on Image Icon
	And Click on add button and choose a PNG file
	Then click on save button , image should to be changed
	
	@pinfo @all @TC_09
	Scenario: Check the upload of a GIF format image
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Click on Image Icon
	And Click on add button and choose a GIF file
	Then click on save button , image should to be changed
	
	@pinfo @all @TC_10
	Scenario: Check the upload of a Invalid format image
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Click on Image Icon
	And Click on add button and choose a docx file
	Then Error massage must be displayed to the user

  @pinfo @all @TC_11
	Scenario: Check the upload of a valid format by over the size 
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Click on Image Icon
	And Click on add button and choose a above 1 mb file
	Then Size Exceeded massage must be displayed to the user
	
	@pinfo @all @TC_12
	Scenario: Check the upload of a png file format by over the size 
	Given Open the browser3
	When Navigate to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And Enter registered username "Admin" and password "admin123"
	And Click on login button
	And Click on my Info button
	And Click on Image Icon
	And Click on add button and  choose png over size a file
	Then Size Exceeded massage must be displayed to the user