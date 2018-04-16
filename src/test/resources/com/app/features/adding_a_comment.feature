@ikbol
Feature: Adding comment

  Scenario: Check Comments
    Given I logged into WordPress
    When I click on Comments
    And i click on "All"
    Then Verifying how many comments posted
    Then I logout from application

  Scenario: Check Comments
    Given I logged into WordPress
    When I click on Comments
    And I click on Tech17 reply and send text and reply
    And I click on View Post and posting new comment
    Then In same page posting new comment
    Then I logout from application
