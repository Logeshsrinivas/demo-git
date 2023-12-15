Feature: Register a new customer in Khelmart Application

Scenario: Register a new Customer

Given User should land in Khelmart Homepage
When 	User clicks account and in that clicks new customer
And 	User should enter username,lastname,email,password,confirm-password
And 	User clicks create Account
Then  User able to see account registered successfully message