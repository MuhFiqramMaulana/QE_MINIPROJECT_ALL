@Register
Feature: Register
  As a user
  I want to register
  So I can login
@Register
  Scenario: Register with valid data
  Given I am on register page
  When I am input name
  And I am input email
  And I input password
  And I click register button
  Then I go to login page

  Scenario Outline: Register with invalid data
    Given I am on register page
    When I am input name "<name>"
    And I am input email "<email>"
    And I am input password "<password>"
    And I click register button
    Then I get the result "<result>"
    Examples:
    | name  |  email  |  password | result|
    |fiqram ahhay|ahhay3@gmail.com|     srimulat    | error message |
    |mati |                     |jenaka |error message|
    |kodrat|                     |         |error message|
    |            |mematikan |kaulah|error message |
    |            |kuliah |         |error message|
    |            |                     |10|error message|

