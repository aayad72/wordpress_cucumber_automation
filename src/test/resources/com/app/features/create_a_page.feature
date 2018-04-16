@post
Feature: Page

Scenario: Add Page
	Given I logged into WordPress
		When I click on Pages 
		Then I click to Add New
		And I enter title "Lalafo Page"
		And I type on text field
		Then I publish
		Then Then I logout from application
	
	
Scenario: Add Media Page
		Given I logged into WordPress
		When I click on Pages 
		Then I click to Add New
		And I enter title "Lalafo Page"
		And I click to Add Media
		Then I click to Media Library
		And I select image
		Then I publish
		Then Then I logout from application
		
@naryn
	Scenario: Remove Page
		Given I logged into WordPress
		When I click on Pages 
		And I click to All Pages
		Then I look for given page name "Lalafo Page"
		Then I logout from application