Feature: Employee Attendance Functionality
  @Positive
  Scenario: HRM-11, HRM-12 Ensure employee Punch in and Punch Out
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks Punch button
    And user input personal notes
    And user clicks In button
    Then user is notified success message
    Then user is directed to punch out page
    When user input personal notes
    And user clicks Out button
    Then user is notified success message

  @Positive
  Scenario: HRM-13 Ensure employee Punch in without inserting notes
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks Punch button
    And user clicks In button
    Then user is notified success message

  @Positive
  Scenario: HRM-14 Ensure employee Punch out without inserting notes
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks Punch button
    And user clicks Out button
    Then user is notified success message

