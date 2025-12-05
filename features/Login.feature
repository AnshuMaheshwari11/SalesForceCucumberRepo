Feature: Login into the Salesforce Application all test cases

Background:
Given User launch the application

@Login
Scenario: TC01 Login Without Password Error Message
Given User is on "LoginPage"
When User read and enter into textbox "username"
And User click on button "login"
Then User verify the text "errormsg" "Error: Please enter your password."


@Smoke @Login
Scenario: TC02 Login To SalesForce
Given User is on "LoginPage"
When User read and enter into textbox "username"
And User read and enter into textbox "password"
And User click on button "login"
And User is on "VerifyIdentityPage"
And User click on button "code"
And User wait for 20000
And User click on button "verify"
And User is on "HomePage"
Then User verify the text "pagename" "Home"


@Login
Scenario: TC03 Check RememberMe
Given User is on "LoginPage"
When User read and enter into textbox "username"
And User read and enter into textbox "password"
And User check the checkbox "rememberme"
And User click on button "login"
And User is on "VerifyIdentityPage"
And User click on button "code"
And User wait for 20 "seconds"
And User click on button "verify"
And User is on "HomePage"
Then User verify the text "pagename" "Home"
When User click on dropdown "usermenu"
And User click on link "logout"
And User is on "LoginPage"
Then User verify the data "usernameid" "username"
And User verify the data is selected "rememberme"


@Login
Scenario: TC04A Forgot Password
Given User is on "LoginPage"
When User click on link "forgotpwd"
And User is on "ResetPasswordPage"
Then User verify the text "header" "Reset Your Password"
When User read and enter into textbox "username"
And User click on button "continue"
Then User verify the text "header" "Check Your Email"


@Login
Scenario: TC04B Login With Invalid Credentials
Given User is on "LoginPage"
When User enter into textbox "username" "invalidusername"
And User enter into textbox "password" "invalidpassword"
And User click on button "login"
Then User verify the text "errormsg" "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator."





