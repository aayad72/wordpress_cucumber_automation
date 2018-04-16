@new
Feature: Create A Category

  Background: 
    Given I logged into WordPress
    When I click on Categories
    And Categories page is displayed


  Scenario: New Category
    When I create a new category
      | name        | start                                            |
      | slug        | single                                           |
      | description | starting test , first scenario , single category |
    Then I should see new category "start"

  Scenario Outline: New Categories
    Then I create multiple new categories
      | name        | <name>        |
      | slug        | <slug>        |
      | description | <description> |
    And I should see new category "<name>"
    And With slug "<slug>"
    And With description "<description>"

    Examples: 
      | name            | slug            | description                             |
      | newCategory     | firstNew        | first new category in scenario outline  |
      | nextNew         | anotherCategory | second new category in scenario outline |
      | lastNewCategory | Category3       | third new category in scenario outline  |
