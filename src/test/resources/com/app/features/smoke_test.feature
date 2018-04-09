
Feature: Smoke Test

Background: 
    Given I logged into WordPress

  @smoke_test
  Scenario: AUT up and running
   
    Then the title of the landing page should be "Dashboard  Cybertek's Blog!  WordPress"
    And the expected url should be "http://34.223.219.142:1022/wordpress/wp-admin/"
   

 @smoke_test
  Scenario: test main functionnality creating a page
   
    When I create a page
    And I publish the page
    Then the page should be displayed
    Then I logout from application

 @smoke_test
  Scenario: test main functionnality creating a post
  
    When I create a post
    And I publish the page
    Then the post should be displayed
    Then I logout from application
