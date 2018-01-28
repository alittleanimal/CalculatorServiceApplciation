Feature: Binary Calculator

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
