# new feature
# Tags: optional

Feature: Android Login

  Scenario: User should be able to login
    Given User is on log in page - Android
    When User enters valid credentials - Android
    And Clicks submit - Android
    Then User should login - Android