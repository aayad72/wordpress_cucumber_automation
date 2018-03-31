Feature: Changing Appearamce

  Scenario: change themes  todisplayed theme
    When I logged into WordPress
    And I click on Appearance/themes
    Then activate new theme
    And the new theme should displayed
    Then I logout from application

Scenario: add new theme
