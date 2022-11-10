Feature: Register
  As a user
  I want to Register
  So I can login

  Scenario: register with valid data
    Given I set url register
    And valid body data
    When I request to register with valid data
    Then I get status code 400

  Scenario Outline: Register with invalid body data
    Given I set url register
    And I set "<full name>", "<email>", and "<password>"
    When I request to register with invalid body
    Then I get status code 400
    Examples:
      |email                  |password   |full name    |
      |maulana@gmail.com|alal10  |             |
      |maulana10@gmail.com|           |fiqram maulana |


