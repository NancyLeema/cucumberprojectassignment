Feature: Luma application demo

@Regression
  Scenario: Signin should be success
    Given User should navigate to the application
    And User clicks on the Signin button
    And User enters the email as "nancyleema.k0911@gmail.com"
    And User enters the password "Tharun@0911"
    When User clicks on the Sign In button
    Then the Sign In should be success
