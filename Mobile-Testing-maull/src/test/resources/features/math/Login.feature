@Login
Feature: LoginPage
  As a user
  I want to login
  So I can buy item

  Scenario Outline: Login page
    Given I click login icon
    When I input email "<email>" and password "<password>"
    And I click login button
    Then I will get result "<result>"
    Examples:
    |email|password|result|
    |fiqram@gmail.com|ganteng|go to home page|
    |fiqram@gmail.com|         |error password |
    |                     |ahhay|error email    |
    |burung@gmail.com     |10|error message  |
    |fiqram@gmail.com|mmmksmak  |error message  |
    |fiqram@gmail.com     |mamam  |error message  |
    |                     |         |error email    |

