Feature: To test Google search functionality

  Scenario: validate google search functionality
    Given browser is open
    And user is on google search page
    When user enter a text in search box
    And hits enter
    Then user is navigated to search results
