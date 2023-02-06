Feature: Employee Information Functionality
  @Positive
  Scenario: HRM-15, HRM-16, HRM-17, HRM-18 Ensure employee can adds Nickname, Nationality, Marital Status, Gender
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    And User clicks My info button
    When User inputs nickname
    When user clicks Nationality dropdown
    And user select nationality
    When user clicks Marital Status dropdown
    And user selects Marital status
    When user select gender
    And user clicks save button
    Then User is notified successfully updated

  @Negative
  Scenario: HRM-19, HRM-20, HRM-21 Ensure employee failed edit Employee ID, SSN and SIN, Date of birth
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks My info button
    Then user cannot edit Employee ID
    Then user cannot edit SSN
    Then user cannot edit SIN

  @Negative
  Scenario: HRM-22 Ensure employee failed to edit Driver License and Expiry Date
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks My info button
    Then user cannot edit Driver Licence
    Then user cannot edit Expiry Date

  @Positive
  Scenario: HRM-23 Ensure employee can add attachment
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks My info button
    And user clicks Add attachment button
    And user insert suitable documents
    And user clicks save attachment button
    Then user is notified success message

  @Negative
  Scenario: HRM-24 Ensure employee failed add attachment
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks My info button
    And user clicks Add attachment button
    And user insert unsuitable documents
    Then user is notified attachment size exceeded

  @Negative
  Scenario: HRM-25 Ensure employee failed save without uploading any documents
    Given User is at Login page
    When User inputs registered username as employee
    And User inputs correct password as employee
    And User clicks login button
    When User clicks My info button
    And user clicks Add attachment button
    And user clicks save attachment button
    Then User is notified required mark