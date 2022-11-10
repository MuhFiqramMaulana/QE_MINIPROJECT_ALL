@SelectCategory
Feature: Select Category
  As a user
  I want to select item buy category
  So I can found the item

  Scenario: find item with select category gaming1
    Given I have logged in
    When I click select category
    And I click gamming1
    Then I get product is empty message

  Scenario: find item with select category gaming2
    Given I am on dashboard page
    When I click select category
    And I click gamming2
    Then I get product is empty message

  Scenario: find item with select category gaming3
    Given I am on dashboard page
    When I click select category
    And I click gamming6
    Then I get product is empty message

  Scenario: Find item with select category dolonan1
    Given I am on dashboard page
    When I click select category
    And I click dolonan1
    Then I get product is empty message
