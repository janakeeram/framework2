Feature: Feature to test functionality of google

  @capgemini
  Scenario Outline: Check google search on chrome browser
    Given user opens google page
    When user searches for search
    Then user closes the browser

  @accenture
  Scenario Outline: Check google search on mozilla browser
    Given user opens google page
    When user searches for search
    Then user closes the browser
