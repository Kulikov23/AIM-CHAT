Feature: Channels

  Background:
    Given the user is on the login page
    Given Write "Login" and "Password"
    When Click "Sign In" button

  Scenario: create channels
    When Create channel

  Scenario: delete channels
    When Delete channel

  Scenario: Spam
    When Spam "CLOWN ATTACK :clown:" message in the "o.lebed" room
