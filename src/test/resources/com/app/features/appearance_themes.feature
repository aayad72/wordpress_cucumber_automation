Feature: Changing Appearamce

  Scenario: change theme
    When I logged into WordPress
    And I click on Appearance/themes
    Then activate new theme
    And the new theme should displayed
    Then I logout from application

  Scenario: Install new theme
    When I logged into WordPress
    And I click on Appearance/themes
    Then add new theme
    And the new theme should displayed
    Then I logout from application
    
    Scenario: Put back the default theme

    When I logged into WordPress
    And I click on Appearance/themes
    Then I put back the default theme
    And the default theme should displayed
    Then I logout from application