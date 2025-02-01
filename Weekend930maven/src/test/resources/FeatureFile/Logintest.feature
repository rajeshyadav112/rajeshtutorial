Feature: Simple tutorial feature

  Scenario Outline: check login with invalid and  valid data
    When enter <username> and password<password>
    And hit the login button with valid data
    Then user get homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | jonny    | jacky    |
