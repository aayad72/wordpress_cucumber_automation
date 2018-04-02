Feature: Smoke Test

  Scenario: AUT up and ruuning
    Given I logged into WordPress
    Then the title of the landing page should be "Dashboard ‹ Cybertek's Blog! — WordPress"
    And the expected url should be "http://34.223.219.142:1022/wordpress/wp-admin/"

  Scenario: test main functionnality creating a page
    Given I logged into WordPress
    When I click on Pages
    And Set title as "First Page"
    And Set Text as "Whatever we want"
    And Click publish
    Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application

  Scenario: test main functionnality creating a post
    Given I logged into WordPress
    When I click on Posts
    And Set title as "First Post"
    And Set Text as "Whatever we want"
    And I click publish
    Then the post should be displayed
    And the data post should match with created post data
    Then I logout from application
