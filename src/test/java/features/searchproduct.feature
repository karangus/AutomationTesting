Feature: Search the product and palce the order
@offersPage
  Scenario Outline: Search Experinces of product seaech in both home page and offer page
    Given User is on Greenkart Landing page
    When User search with Shortname <Vegtables> and extract with actual name
    Then User search with same Shortname <Vegtables> in offer page to check if product exists
    And Validate the product name in the offer page and homepage

    
    Examples:
    |Vegtables|
    | Tom     |
    | Beet    |