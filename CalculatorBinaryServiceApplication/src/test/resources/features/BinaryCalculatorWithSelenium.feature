Feature: Calculator UI

Scenario:    
    Given I am in calculator page
    And I view the screen 
    And I should see fields for number1 and number2 and operator and calculateResult and Reset
    And I pass "4" and "2" 																		
    When I press "a" 																						
    And I click on calculateresult 															
    Then the result shoule be printed as "6" 									
    When I click on the Reset button
    Then I should see the numbers and Result fields are cleared
  
  

 Scenario Outline: 
    Given "<a>" and "<b>" as input parameters
    When I calculate with "<operator>"
    Then the result is "<c>"

    Examples: Single digits
    
      | a | b | operator | c  |
      | 2 | 3 | +        | 5  |
      | 3 | 2 | -        | 1  |
      | 2 | 3 | *        | 6  |
      | 4 | 2 | /        |  2 |
      
    Examples: Double digits
    
      | a  | b  | operator | c   |
      | 20 | 30 | +        | 50  |
      | 30 | 20 | -        | 10  |
      | 20 | 30 | *        | 600 |
      |  40| 20 | /        |  2  |
      
 
