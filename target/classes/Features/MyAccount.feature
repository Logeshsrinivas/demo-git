Feature: user view to myaccount
@Account
Scenario: user checks myaccount 
When user click my account
And user click my orders
And user click address book and update the address 
Then user checks the updated address
