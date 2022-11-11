#Author: Automation Tester
#Module: Calculator
#Date: 9 Nov 2022
Feature: Calculator functionality

  Scenario: Test Case to verify Addition functionality using given calculator
    Given Application url for testing
    When User should enter two enter and perform Addition operation
    Then Result should get display and verify output value for Addition.

  Scenario: Test Case to verify subtraction functionality using given calculator
    Given Application url for testing
    When User should enter two enter and perform subtraction operation
    Then Result should get display and verify output value for subtraction.

  Scenario: Test Case to verify multiplication functionality using given calculator
    Given Application url for testing
    When User should enter two enter and perform multiplication operation
    Then Result should get display and verify output value for multiplication.
