Feature: Add Employee Functionality
  @Positive
  Scenario: HRM-6 Ensure user successfully add employees with active login feature
    Given User is at Login page
    And User inputs registered username
    And User inputs correct password
    And User clicks login button
    When user clicks PIM menu
    And user clicks add user button
    And user inputs employee First Name
    And user inputs employee Middle Name
    And user inputs employee Last Name
    And user inputs employee ID
    And user insert photo profile
    And user switch on the login details
    And user inputs employee username
    And user inputs password
    And user inputs password confirmation
    And user clicks save button
    Then user is notified success message
    And user is directed to employee profile page

  @Positive
  Scenario: HRM-7 Ensure user successfully add employees without login feature
    Given User is at Login page
    And User inputs registered username
    And User inputs correct password
    And User clicks login button
    When user clicks PIM menu
    And user clicks add user button
    And user inputs employee two First Name
    And user inputs employee two Middle Name
    And user inputs employee two Last Name
    And user inputs employee two ID
    And user clicks save button
    Then user is notified success message
    And user is directed to employee two profile page

  @Positive
  Scenario: HRM-8 Given User is at Login page
    And User inputs registered username
    And User inputs correct password
    And User clicks login button
    When user clicks PIM menu
    And user clicks add user button
    And user inputs employee three First Name
    And user inputs employee three Middle Name
    And user inputs employee three Last Name
    And user inputs employee three ID
    And user switch on the login details
    And user inputs employee three username
    And user clicks disabled checklist
    And user inputs password three
    And user inputs password three confirmation
    And user clicks save button
    Then user is notified success message
    And user is directed to employee three profile page