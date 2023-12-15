Feature:  List the Product by using Selecting product Option

Scenario: List the products by using  Category option
#Given User  in a khelmart  Homepage
When user select swimming cap  option  using other Sport Category
And User Sort prodcut by product name
And user selects list view of product
Then  User able to list the count of product