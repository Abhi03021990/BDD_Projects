Feature: Bing Search Page
  Scenario: Search for a valid content
    Given User launches bing search page
    And enters some valid text to search in the search box
    When User clicks on the search box
    Then Relevant search result should be displayed
 
