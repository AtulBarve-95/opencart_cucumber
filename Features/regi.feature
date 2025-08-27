
Feature: Account Registration

Scenario: : Account registration work
 
 Given the user go to the registration page
 When User eneter all the details
      |firstName | Atul    |
      |lastName  | Barve   |
      |telephone |512456   |
      |password  | test@123|
     
     
    
 And User select the privacy policy
 And the user click on the Continue button
 Then the user account should created succesfully.