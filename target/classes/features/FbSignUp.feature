Feature: Facebook sign up feature

  Scenario Outline: Verify that user is able to sign up new account
    Given User opened the facebook application
    When User clicks on the Create New Account button
    And User enters '<FirstName>' '<LastName>' '<MobileNum>' and '<Password>'
    And User Selects '<Day>' '<Month>' and '<Year>'
    And User clicks on the Sign Up utton
    Then User should be able to see the success message

    Examples: 
      | FirstName | LastName | MobileNum | Password  | Day | Month | Year |
      | Someone   | Good     |  12345678 | abc7890!@ |  24 | Jul   | 1980 |

  @DataTable
  Scenario: Verify that user is able to create the new account using cucumber datatable
    Given User opened the facebook application
    When User clicks on the Create New Account button
    And User creates the new account
      | Field     | Value      |
      | FirstName | Raj        |
      | LastName  | Sharma     |
      | MobileNum |   12345678 |
      | Password  | abc@abc123 |
      | Day				| 8 				 |
      | Month     | Aug        |
			| Year      | 1990       |
                  
    And User clicks on the Sign Up utton
    Then User should be able to see the success message
