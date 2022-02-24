# new feature
# Tags: optional

Feature: iOS Login

  Scenario: User should be able to login
    Given User is on log in page - iOS
    When User enters valid credentials - iOS
    And Clicks submit - iOS
    Then User should login - iOS