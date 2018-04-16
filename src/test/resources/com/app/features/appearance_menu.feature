@regression
Feature: Editing the menus

  Scenario: Adding new page to menu
    When I logged into WordPress
    And I click on Appearance/Menus
    Then I click on "Custom Links"
    Then the new menu item should be displayed in Menu Structure
    Then I logout from application

  @test
  Scenario: Adding new page to menu
    When I logged into WordPress
    And I click on Appearance/Menus
    Then I create "Posts" click on check box
    Then the new menu item should be displayed in Menu Structure
    Then I logout from application

  Scenario: Adding new page to menu
    When I logged into WordPress
    And I click on Appearance/Menus
    Then I am creating "Pages" click on Smoke Test check box
    Then the new menu item should be displayed in Menu Structure
    Then I logout from application
