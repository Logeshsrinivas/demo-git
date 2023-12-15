Feature: Logging to the khelmart page 


  @validcredentials
  Scenario: User login to the khelmart  page using valid credentials
    #Given  user is in khelmart webapplications login page
    When  User clicks the my account option in homepage
    When   User enters the valid email-id
    And    User enters the valid password
    And User clicks the sign in option
    And  User should able to login in khelmart application sucessfully
    #Then  User clicks the sign out should able to logout sucessfully

  #@invalidcredentials
  #Scenario: Login using invalid credentials
      #When  the user clicks an my account option
      #And  enters valiD email Address
      #|email                | 
      #| ghdjhdfj |
      #And   User gives the invalid password
      #|password             |
      #|kavya@321            |
      #And User clicks the sign in button
      #Then User not able to login and an error message should be show
   #
    
    
  