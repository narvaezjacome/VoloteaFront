Feature: DepartureDate
  As quality control automation
  I want to enter the departure date
  Validate departure date selector

  Background: select departure date
    Given The user in the search section
    And this user clicks on the destination city

  Scenario:Select departure date
    When choose in the departure date option
    And the user selects a date enabled
    Then the lower dates are disabled