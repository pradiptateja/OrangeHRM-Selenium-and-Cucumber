Feature: Login Functionality
  @Positive
  Scenario: HRM-1 Ensure user successfully login with registered account
    Given User is at Login page
    When User inputs registered username
    And User inputs correct password
    And User clicks login button
    Then User is directed to dashboard page
    And User can see HRM main menu
    And User can see profile menu

  @Negative
  Scenario: HRM-2 Ensure user failed login with invalid account
    Given User is at Login page
    When User inputs unregistered username
    And User inputs incorrect password
    And User clicks login button
    Then User is notified invalid credentials

  @Negative
  Scenario: HRM-3, HRM-4 Ensure user failed login without inputting username and or password
    Given User is at Login page
    When User clicks login button
    Then User is notified required mark
    When User inputs registered username
    And User clicks login button
    Then User is notified required mark

  @Negative
  Scenario: HRM-5 Ensure user failed login without inputting username
    Given User is at Login page
    When User inputs correct password
    And User clicks login button
    Then User is notified required mark




