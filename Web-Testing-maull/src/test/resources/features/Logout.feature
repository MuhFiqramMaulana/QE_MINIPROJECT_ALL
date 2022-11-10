Feature: Log Out
  As a user
  I want to log out
  So I can log out of my account
@Logout
  Scenario: log out
    Given I have login And Iam in dashboard page
    When I click icon account
    And I click logout button
    Then I go to login page