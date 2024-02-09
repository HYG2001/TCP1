Feature: wishlist
Background:
  Given user on home page



  Scenario: add item to wishlist
    When user clicks on add to wishlist
    When item is added to wishlist message appeare
    Then the result should be 1



  Scenario: user clicks on wishlist
    When user clicks on wishlist
    And the user is redirected to wishlist page