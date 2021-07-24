Feature: This feature will help to do the calculator functionality

  Background: 
    Given The calculator application is open

  Scenario: Add two Numbers
    When I add two numbers "2" and "5"
    Then I should get the result as "7"

  Scenario: Multiply two Numbers
    When I multiply two numbers "3" and "11"
    Then I should get the result as "33"

  Scenario: Add three Numbers
    When I add three numbers "8" and "9" and "10"
    Then I should get the result as "27"
