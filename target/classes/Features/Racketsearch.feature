Feature: Select one BadmintonRacket in khelmart application

Scenario: User select one Racket in RacketSport category

#Given User is on Homepage of Khelmart
When User go and perform the RacketSport category
And User select the BadmintonRacket in Badminton list
And User click the sortby option and choose Price
And User pick the First Racket in the List
Then User successfully select one racket in khelmart application