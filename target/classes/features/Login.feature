@LoginFeature
Feature: Login Feature
  Description: This feature will be used to login to Simplilearn Applications

  @PositiveLogin @Sanity
  Scenario Outline: Verify that when user enter correct user name and password they should be able to login successfully
    Given User has opened the Simplilearn application
    When User click on the Login button
    When User enters correct username '<Username>'
    And User enters correct password '<Password>'
    And click on Login button
    Then User should be landed on the homepage
    And User should be able to see the welcome message

    Examples: 
      | Username         | Password |
      | positive@xyz.com | aBc12345 |

  @NegativeLogin @Sanity
  Scenario Outline: Verify that when user enter correct user name and password they should be able to login successfully
    Given User has opened the Simplilearn application
    When User click on the Login button
    When User enters correct username '<Username>'
    And User enters correct password '<Password>'
    And click on Login button
    Then User should be landed on the homepage
    And User should be able to see the welcome message

    Examples: 
      | Username         | Password |
      | negative@pqr.com | Wbc12345 |
