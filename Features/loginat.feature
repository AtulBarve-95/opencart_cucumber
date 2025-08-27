Feature: Verify the login functionality.

Scenario: successfully login with the valid scenarios.
 Given User navigate to the login page.
 When user enter the email valid email and password
 And click on the login button
 Then Login should be done successfully.
 
 