@wip
Feature: Smart bear software link verification

  Scenario: As a user, I need to get all links on the page

    When Open browser
    And Go to website
    And Enter username: Tester
    And Enter password: test
    And Click to Login button
    And Print out count of all the links on landing page
    Then Print out each link text on this page

