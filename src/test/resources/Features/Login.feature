Feature: Check Feature Login


  Scenario: User Login with a valid credential
    Given I am on page login
    When I entered valid credential
    And I click login
    Then I verfy element Log Out