Feature: ADD NEW  Page

  @functional @regression @smoke @taskcreation
  Scenario: Adding new page
    Given I logged into WordPress
    When I click on Pages
    And Set title as "First Page"
    And Set Text as "Whatever we want"
    And Click publish
    Then Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application
    
    
     @taskcreation
  Scenario: creating a Page with Media
    Given I logged into WordPress
    When I click on Posts
    And Set title as "First Post"
    And Set Text as "Whatever we want"
    And Click publish
    Then Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application