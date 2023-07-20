

Feature: Login

  Scenario: Succesfully AccountLogin with valid credentials
    Given User Launch Chrome browser
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User Click on Log out link
    And Close browser




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
    | admin@yourstore.com | admin123 | 
    
    
    
    
    
