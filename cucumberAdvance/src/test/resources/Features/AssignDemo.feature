#Parameterization and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: check login is succesfull with valid credintials
    Given user is on login  page
    When user enters <username> and <password>
    And clicks on login page
    Then user is navigated to the home  #use country

    Examples: 
      | username   | password | country |
      | janakeeram |    12345 | India   |
      | mark       |    12345 | Russia  |
      