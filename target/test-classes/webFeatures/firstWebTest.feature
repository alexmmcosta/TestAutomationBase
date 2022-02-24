# new feature
# Tags: optional

Feature: Web Login

  Scenario: User should be able to login
    Given User is on log in page - Web
    When User enters valid credentials - Web
    And Clicks submit - Web
    Then User should login - Web