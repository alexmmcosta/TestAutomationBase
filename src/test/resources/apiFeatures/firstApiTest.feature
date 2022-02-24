# new feature
# Tags: optional

Feature: Api Login

  Scenario: User should be able to login
    Given User is on log in page - Api
    When User enters valid credentials - Api
    And Clicks submit - Api
    Then User should login - Api