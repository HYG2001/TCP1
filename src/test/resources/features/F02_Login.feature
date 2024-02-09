Feature: user can login to their account

Background:
  Given user in home page
  When user clicks on login

  @smoke
  Scenario: user can login with valid data
    And user login with email
    And user login with password
    And user clicks on login button
    Then the user is redirected to home page



  Scenario:user could login with invalid data
    When user login with email
    And user login with password
    And user clicks on login button
    Then you can't login message appear
