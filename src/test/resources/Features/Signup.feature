Feature: Check Feature Sign Up


  Scenario: User Register with Normal Conditions
    Given I am on page sign up
    When I entered valid data
    And I click sign up
    Then I see element Log Out


   Scenario: User registers using an empty name
    Given I am goto page sign up
    When I left blank name
    And I click button sign up
    Then I see an error message