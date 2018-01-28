Feature: Calculator UI

Scenario:    
    Given I am in calculator page
    And I view the screen 
    And I should see fields for inputnumber and operator and calculateResult and Reset
    And I pass "5" 																		
    When I press "r" 																						
    And I click on calculateresult 															
    Then the result would be displayed as "2.236" 									
    When I click on the Reset button
    Then I should see the number and Result fields are cleared

 
   Scenario Outline: 
    Given "<x>" input parameter
    When I calculate with the "<operator>"
    Then the result is "<z>"

    Examples: 
      | x | operator | z     |
      | 5 | r        | 2.236 |
      | 9 | i        | 0.111 |
