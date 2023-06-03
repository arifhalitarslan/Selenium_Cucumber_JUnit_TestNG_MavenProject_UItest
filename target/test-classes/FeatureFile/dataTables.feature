Feature:  Example of cucumber data table implementation


  Scenario: List of fruits I like

    Then user should see fruits I like

      | Apple      |
      | Banana     |
      | Strawberry |
      | mango      |

    #ctrl alt L

  Scenario Outline: Wikipedia search functionality title verification
    Given User is on Wikipedia home page
    When User types "<SearchValue>" in the wiki search box
    And User clicks wiki search button
    Then User Sees "<ExpectedTitle>" is in the wiki title
    Then User sees "<ExpectedMainHeader>" is in the main header

    Examples: Search values we are going to be using in this scenerio is as below

      | SearchValue       | ExpectedTitle                | ExpectedMainHeader |
      | Steve Jobs        | Steve Jobs Vikipedi          | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo - Vikipedi | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley - Vikipedi        | Bob Marley         |