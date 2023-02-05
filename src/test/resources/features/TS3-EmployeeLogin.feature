Feature: Employee Login Functionality
  @Positive
  Scenario: HRM-9 Ensure employee login using active account
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    Then User is directed to dashboard page
    And User can see HRM main menu
    And User can see profile menu

  @Negative
  Scenario: HRM-10 Ensure employee failed login using disabled account
    Given User is at Login page
    When User inputs disable username as employee
    And User inputs disable password as employee
    And User clicks login button
    Then User is notified Account Disabled