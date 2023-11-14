Feature: Check feature Checkout Product
 

  Scenario: The user completes the necessary steps to successfully check out
    Given browser is open
    And I am on login page
    When I am enter username and password valid
    And I click button login
    And I adds product to bag
    And I Process to Checkout Success
    Then I see waiting payment
   
