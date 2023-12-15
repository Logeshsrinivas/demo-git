Feature: User needs to calculate Shipping Cost

Scenario: User select product and calculate shipping cost

When User clicks the selected product
And User selects the size of Product
And User clicks Shipping cost
And User Enters region
And User Enter Zip code
And User Clicks Calculate
Then User able to see Shipping Cost
