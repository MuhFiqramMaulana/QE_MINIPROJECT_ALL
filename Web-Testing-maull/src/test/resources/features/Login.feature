@Login
Feature: Login
  As a user
  I want to login
  So I can access the app
@Login
  Scenario: Login with valid account
  Given I am on login page
  When I am input my email
  And I input my password
  And I click login button
  Then I go to home page

  Scenario Outline: Login page
    Given I am on login page
    When I am input my email "<email2>"
    And I am input my password "<password2>"
    And I click login button
    Then I can not login
    Examples:
    | email2 | password2|
    |fiqram@gmail.com|    ganteng     |
    |                     |pp10|
    |muslihat|belaka|
    |paman    |tante|
    |jahat  |   |
    |                     |           |
