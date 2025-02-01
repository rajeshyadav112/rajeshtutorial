Feature: login and logout feature demo

  Background: 
    Given User is at loginpage
    When Enter the valid login credentials
    And Click on login button
    Then Login should successful

  @Login
  Scenario: To valiadte the login with valid data
    And verify the login successful

  @Logout
  Scenario: to verify the logout
    Given user is present on the Homepage
    When click on the profile
    And click on the logout button
    Then logout should successful
