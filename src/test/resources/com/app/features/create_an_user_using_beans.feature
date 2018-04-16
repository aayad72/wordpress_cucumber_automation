@beans @regression
Feature: Creating Users

  Scenario Outline: Create way more contacts
    Given I logged into WordPress
    When I add a new user:
      | username   | email   | password   |
      | <username> | <email> | <password> |
    Then I should see contact information for "<username> <email>"

    Examples: 
      | username | email            | password |
      | Satoshi  | Satoshi@test.com | abc123   |
      | John     | John@test.com    | abc123   |
      | Rajesh   | Rajesh@test.com  | abc123   |
      | Bonnie   | Bonnie@test.com  | abc123   |
