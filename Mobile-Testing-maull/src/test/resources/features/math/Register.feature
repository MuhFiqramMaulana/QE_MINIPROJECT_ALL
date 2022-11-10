@Register
Feature: Register
  As a User
  I want to register
  So I can login

  Scenario Outline: Register
    Given I am on home page
    And I click login icon
    And I click register
    And clear field name, email, and password
    When I input name "<name>" email "<email>" and password "<password>"
    And I click register button
    Then I get result "<result>"
    Examples:
    |name|email|password|result|
    |fiqramtampan|tampan@gmail.com|ahhay|go to home page|
    |sukakamu|tidaksuka@gmail.com|         |error message password |
    |sukasuka|                     |malas|error message email |
    |           |tidur|lelah|error message name |
    |mamam|                     |         |error message password  |
    |           |fiqram@gmail.com|         |error Message name  |
    |           |                     |cukul|error message name  |
    |           |                     |         |error message |