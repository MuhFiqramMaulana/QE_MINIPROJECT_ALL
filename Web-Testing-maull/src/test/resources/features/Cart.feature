@Cart
Feature: Cart page
  As a user
  I want to go my cart
  So I can manage my cart

  Scenario: add item to cart
    Given I have login And Iam in dashboard page
    And I am on dashboard page
    Then I click beli button
    And number of items increases

  Scenario: add quantity item to cart
    Given I have logged in
    And I add item to cart
    And I click cart button
    When I click icon plus
    Then number of items increases

  Scenario: pay my items in cart
    Given I have logged in
    And I add item to cart
    And I click cart button
    Then I click bayar button
    And I go to transaction page