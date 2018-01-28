Feature: Unary Calculator
    
  Scenario Outline: 
    Given "<x>" input parameter
    When I calculate with the "<operator>"
    Then the result is "<z>"

    Examples: 
      | x | operator | z     |
      | 5 | r        | 2.236 |
      | 9 | i        | 0.111 |