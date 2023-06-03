Feature: Searching apple

  User Story: As a user, if i enter "apple" int the google chat box , i should see the result

  Scenario: Apple page
    When we should be in google home page
    And  we should write "apple" and click the enter
    Then We should results
