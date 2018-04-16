
Feature: ADD NEW Post

  Scenario: Creating a Post with text
    Given I logged into WordPress
    And I click on Post/Add New
    Then I enter post title on title field
    And type post on text area
    And I click publish
    Then I logout from application

  Scenario: Creating a post with Media
    Given I logged into WordPress
    And I click on Post/Add New
    Then I enter post title on title field
    And I click Add Media button
    And I click publish
    Then I logout from application
  
  Scenario: remove the post
    Given I logged into WordPress
    When I click on Posts
    And I click to All Posts
    Then I look for given post name "Lalafo"
    Then I logout from application
