Feature: F00_USER in home page
  @smoke
  Scenario: guest user could register with valid data successfully
    Given user in home page
    And user clicks on register
    Then the user is redirected to register page
    When user select gender type
    And user enters first name "automation"
    And user enters last name "tester"
    And user enters date of birth
    And user enters email field "test@example.com"
    And user fills Password fields "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed