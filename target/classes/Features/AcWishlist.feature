Feature: Wishlist functionality for Khelmart shopping
 
 Scenario: Add products to wishlist
   When search for an item 
    And add the product to my wishlist
    And should see the products in my wishlist
    And Share the wishlist
    And enter the email address 
      | enteremail              |
      | abiakshu0987@gmail.com   | 
     And enter a message
      | message |
      | we can buy the shoes here |
    And  click on the sharewishlist  button
    Then remove the  product from the wishlist
    