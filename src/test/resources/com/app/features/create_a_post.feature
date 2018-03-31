Feature: ADD NEW Post

  @functional @regression @smoke @taskcreation
  Scenario: Creating a Post with text
    Given I logged into WordPress
    When I click on Posts
    And Set title as "First Post"
    And Set Text as "Whatever we want"
    And Click publish
    Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application

  @taskcreation
  Scenario: creating a post with Media
    Given I logged into WordPress
    When I click on Posts
    And Add media from media library to the post
    And Click publish
    Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application
