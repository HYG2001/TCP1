Feature:currency selection
  @smoke
  Scenario:user selects currency
    Given user on home page
    When user clicks on the currency selector
    Then user can choose the currency