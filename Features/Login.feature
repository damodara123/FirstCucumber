
@e2e
Feature: Login
@login
  Scenario: Succesfully AccountLogin with valid credentials
    Given User Launch Chrome browser
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User Click on Log out link
    And Close browser

@smoketest
Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User Click on Log out link
    And Close browser
    
    Examples:
    | email | password |
    | admin@yourstore.com | admin |
    
    
    
    
    
    