@widgets
Feature: Add Widgets

  Background: 
    Given I logged into WordPress

  Scenario: Create Calendar using Pages
    And I create a new page
    Then Set title as "Tech 17 Calendar"
    Then I click on Page Builder
    Then I add Calendar Widget
    Then Publish Calendar Page
    Then the Calendar should be displayed in Page
    Then I logout from application

  Scenario: Add Image Gall
    And I create a new page
    And Set page title as "Tech 17 Team"
    Then I click on Page Builder
    Then I add Gallery widgets
    Then Set title "Meet My Team"
    Then Add on Images
    Then Publish images in gallery
    And Gallery images should be displayed
    Then I logout from application


