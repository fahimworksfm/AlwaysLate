Feature: SwagLab Login
Scenario Outline: Valid successful login
Given User on SwagLab homepage
When User enters username as "<user>"
And User enters password as "<pass>"
And User clicks on Login Button
Then User verifies the landing page

Examples:
|user         |pass        |
|standard_user|secret_sauce|