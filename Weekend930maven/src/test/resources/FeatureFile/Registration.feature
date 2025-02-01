Feature: user registration

  @signup
  Scenario: validate the user registration
    Given i am on the registration page
    When user fill all the details
      | name   | company | email         | password | confirm_password |
      | rajesh | ducat   | raj@gmail.com | raj098   | raj098           |
    And click on the register button
    Then user get the success message

  @login
  Scenario Outline: check the successful login with valid and invalid credentials
    Given user is on the loginpage
    When fill the correct <username> and <password>
    And press the login button
    Then user should see the home page

    Examples: 
      | username           | password |
      | raj@gmail.com      | raj098   |
      | rah2564hotmail.com | raj787   |
