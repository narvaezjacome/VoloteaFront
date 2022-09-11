Feature: OriginCountry
  As QA Automation
  I want to enter in selector Origin
  To validate selector Origin

  Background: Select Selector Origin
    Given The user in the search section

    Scenario:Select Selector Origin
      When This user selects the option countries of origin
      Then The user can see the number of cities grouped by country Spain
