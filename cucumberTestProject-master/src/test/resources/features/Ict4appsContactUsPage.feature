Feature: Contact Us page

  Background:
    Given User is on Contact Us page

   Scenario: test22
     When the user click on SEND button
     Then error message appears above " Name * " textbox
     Then error message appears above " Email * " textbox
     Then error message appears above " Subject * " textbox
     Then error message appears above " Comments " entry area
     When Enter "qwerty" in " Name * " textbox
     When the user click on SEND button
     Then error message above " Name * " should disappear
     When Enter "test@test.com" in " Email * " textbox
     When the user click on SEND button
     Then error message above " Email * " should disappear
     When Enter "qwerty" in " Subject * " textbox
     When the user click on SEND button
     Then error message above " Subject * " should disappear
     When Enter "qwerty" in " Comments " entry area
     When  the user click on SEND button
     Then error message above " Comments " entry area should disappear
#Text Verification (Required)

#    Scenario Outline: test23
#      When Enter "<value>" in " Name * " textbox
#      When the user click on SEND button
#      Then
#      Examples: