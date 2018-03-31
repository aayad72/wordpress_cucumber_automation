Feature: Add Widgets

  @functional @regression @smoke @taskcreation
  Scenario: Create Calendar
    Given I logged into WordPress
    When I click on Posts
    And Set title as "First Post"
    And Set Text as "Whatever we want"
    And Click publish
    Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application

  @taskcreation
  Scenario: add video
    Given I logged into WordPress
    When I click on Posts
    And Add media from video
    And Click publish
    Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application
