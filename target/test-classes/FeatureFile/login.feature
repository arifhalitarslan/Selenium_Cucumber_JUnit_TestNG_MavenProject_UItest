Feature: Library app login page feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are : Librarian, Student , Admin

  Scenario: Login as Librarian
    When user enters Librarian username
    And user enters Librarian password
    Then user should see the dashboard

Scenario: Login as Student
  When user enters Student username
  And user enters Student password
  Then user should see the dashboard

 Scenario: login as admin
   When user enters Admin username
   And user enters Admin password
   Then user should see the dashboard
