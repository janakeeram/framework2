Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login page
    Then user is navigated to the homepage

  Scenario: check logout functionality
    # Given: user is logged in
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    # Given user is logged in
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
