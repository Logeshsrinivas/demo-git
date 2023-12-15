Feature: List the given products by selecting Product Category

Scenario: List the Product by Category

#Given User will land in the homepage
When User login to the account
And  User select sports shoes from product category
And  User filter the product by Price
Then User print the list of products

