Feature: Luma application demo
@Smoke
  Scenario: Add a product to the cart
    Given User should navigate to the application page
    And User clicks on the Signin link button
    And User enters the emailid as "nancyleema.k0911@gmail.com"
    And User enters the passwordid "Tharun@0911"
    And User should click on the signin button
    And User click on the women
    And User should select the tops option
    And User should select jacket option from the tops option
    And User should select  any of the jacket
    And User should select the size of the jacket
    And User hould select the color of the jacket
    When User click on Add To Cart
    Then The cart badge shoould be updated
