Feature: Editing the menu

  Scenario: add to menu to the page
    When I logged into WordPress
    And I click on Appearance/Menu
    Then add new menu to the page
    And the new theme should displayed
    Then I logout from application

  Scenario: Scenario: add to menu to post
    When I logged into WordPress
    And I click on Appearance/Menu
    Then add new menu to the page
    And the new theme should displayed
    Then I logout from application
    
    Scenario: add custom links to menu
     When I logged into WordPress
    And I click on Appearance/CustomLink
    Then add new menu to the page
    And the new theme should displayed
    Then I logout from application
    
