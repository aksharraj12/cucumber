Feature: To test login functionality

  Scenario: verfiy login functionality with valid data
    Given user is on login in page
    When enter usr and pswd
    And click login
    Then display page
