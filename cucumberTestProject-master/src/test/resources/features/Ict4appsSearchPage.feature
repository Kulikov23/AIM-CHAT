Feature: Search Page

Background:
  Given the user is on Search page


Scenario: test 001
  When the user click on Scope dropdown menu
  When the user select "Global" option
  When the user enter "food" in search textbox
  When the user click on SEARCH button
  Then CLEAR button is appears
  Then list with search results should contain " Blogs Entry "

  Scenario: test 002
    When the user click on Scope dropdown menu
    When the user select "Global" option
    When the user enter "food" in search textbox
    When the user click on SEARCH button
    Then CLEAR button is appears
    Then list with search results should contain " Products Entry "

  Scenario: test 003
    When the user click on Scope dropdown menu
    When the user select "Global" option
    When the user enter "food" in search textbox
    When the user click on SEARCH button
    Then CLEAR button is appears
    When the user click on CLEAR button
    Then list with results of search should dissapear

   Scenario: test 004
     When the user click on Scope dropdown menu
     When the user select "Global" option
     When the user enter "food" in search textbox
     When the user click on SEARCH button
     When the user click on title of "1"th " Blogs Entry "
     Then Entry should contain all required elements

  Scenario Outline: test 005
    When the user click on Scope dropdown menu
    When the user select "Global" option
    When the user enter "food" in search textbox
    When the user click on SEARCH button
    When the user click on "<PAGINATOR>" pagination button
    Then label that showing number of results should change to "<Expected state>"
  Examples:
  |PAGINATOR|Expected state               |
  |More     | Showing 21 - 40.            |
  |Previous | Showing 1 - 20.             |
  |← First  | Showing 1 - 20.             |

  Scenario: test 006
#    When the user click on Scope dropdown menu
    When the user select "Products" option
    When the user enter "1" in search textbox
    When the user click on SEARCH button
    Then list with search results should contain " Products Entry "
    Then CLEAR button is appears
