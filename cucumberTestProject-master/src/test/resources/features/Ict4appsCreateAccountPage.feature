Feature: Create Account page



Background:
  Given the user is on Create Account page


Scenario: test1
  When the user click on SAVE button
  Then Error message should appear at the right of "First Name " textbox
  Then Error message should appear at the right of " Screen Name " textbox
  Then Error message should appear at the right of " Email Address " textbox
  Then Error message should appear at the right of " Text Verification " textbox

Scenario: test2
  When the user click on date picker
  When the user click on "next" arrow link
  Then date should change to "February 1970"
  When the user click on "previous" arrow link
  Then date should change to "January 1970"
  When the user click on "7" calendar day
  Then date in textbox should change to "01/07/1970"

Scenario: test3 Email Address (Required) textbox validation
  When the user enter