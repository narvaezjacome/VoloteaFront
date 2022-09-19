Feature: Return Date
  As quality control automation
  I want to enter the return date
  Validate return date selector

  Background: select return date
    Given The user in the search section
    And this user clicks on the destination city
    And this user clicks start date

  Scenario: Select return date
    When choose on the return date
    And the user changes the checkout date
    Then user can see later dates disabled
    And the user selects another departure date, the return date is deselected