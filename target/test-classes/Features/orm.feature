Feature: ORM Login Feature

  Scenario: verfiy login functionality with valid creditinals
    Given user is on ORM Login page
    When user enters username and passowrd
    And user click on login button
    Then user navigate to dashboard page
