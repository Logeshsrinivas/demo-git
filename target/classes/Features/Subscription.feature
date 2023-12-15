Feature: To Subscribe the Khelmart application
 
  Scenario: User subscribe the Khelmart app with Email-id
    #Given User is on Khelmart application homepage
    When User scroll to bottom of the page
    And User click and give email in that field
    And User clicks the subscribe option
    Then User successfully subscribe the Application