Feature: Login Feature

This feature is for implementing login functionality.






Scenario: Valid Login for admin
Given Admin is on login page
And Admin enter login credentials
      |Username|Password|
      |Admin|admin123|
Then Should display home page


Scenario: Invalid login
Given Admin is on login page
When Admin enters valid username and invalid password
Then should display error message

Scenario: Invalid login
Given Admin is on login page
When Admin enters invalid username and valid password
Then should display error message

Scenario: Invalid login
Given Admin is on login page
When Admin enters invalid username and invalid password
Then should display error message


Scenario: Invalid login
Given Admin is on login page
When Admin enters valid username and don't enter password
Then should display empty password error message


Scenario: Invalid login
Given Admin is on login page
When Admin don't enters valid username and  enter password
Then should display empty username error message

Scenario: Forget Password functionality
Given Admin is on login page
When Admin clicks on forgot your password
Then should display reset password page


Scenario: Forget Password Functionality
Given Admin clicks on Forget your password
When Admin enters valid username
Then should display password change success message


Scenario: Forget Password Functionality
Given Admin clicks on Forget your password
When Admin enters invalid username
Then should display invalid username error message

Scenario: Forget Password Functionality
Given Admin clicks on Forget your password
When Admin clicks on cancel
Then should display login page












