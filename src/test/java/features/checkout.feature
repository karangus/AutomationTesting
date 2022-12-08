Feature: Adding Product to cart and  Checkout Page

@PlaceOrder
  Scenario Outline: Adding the product to the cart and verify same product in the checkout page
    Given User is on Greenkart Landing page
    When User search with Shortname <Vegtables> and extract with actual name
    And Added "3" items of the selected product to cart
    Then User proceeds to checkout and validate <Vegtables> items in checkout page
    And  Verify the user as ability to enter the promo code and place the order

    Examples: 
      | Vegtables |
      | Tom       |
