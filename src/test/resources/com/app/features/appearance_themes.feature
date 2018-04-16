@new
Feature: Changing Appearamce

Background:
	Given I logged into WordPress 
  And I click on Appearance/themes
  And I am on themes page

  Scenario: change theme
    When activate new theme
    And the new theme should displayed
    Then I logout from application

  Scenario: Install new theme
    When add new theme
    And the new theme should displayed
    Then I logout from application

    Scenario: Put back the default theme
    When I put back the default theme
    And the default theme should displayed
    Then I logout from application