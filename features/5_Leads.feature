Feature: Leads all testcases

Background:
Given User secure launch the application


@Smoke @Leads
Scenario: TC20 Verify leads Tab
Given User is on "HomePage"
When User click on link "leads"
And User is on "LeadsHomePage"
Then User verify the text "pagetype" "Leads"


@Leads
Scenario: TC21 Verify leads View DropDown
Given User is on "HomePage"
When User click on link "leads"
And User is on "LeadsHomePage"
Then User verify following items in dropdown "leadsviewdropdown"
|All Open Leads|
|My Unread Leads|
|Recently Viewed Leads|
|Today's Leads|
|View - Custom 1|
|View - Custom 2|


@Leads
Scenario: TC22 Verify leads Default View 
Given User is on "HomePage"
When User click on link "leads"
And User is on "LeadsHomePage"
And User click on dropdown "leadsviewdropdown"
And User read and select from dropdown "leadsviewdropdown" "leadsnewdefaultview"
And User is on "HomePage"
And User click on dropdown "usermenu"
And User click on link "logout"
When User is on "LoginPage"
And User read and enter into textbox "username"
And User read and enter into textbox "password"
And User click on button "login"
When User is on "HomePage"
And User click on link "leads"
And User is on "LeadsHomePage"
Then User verify first selected item in dropdown "leadsviewdropdown" "leadsnewdefaultview"


@Leads
Scenario: TC23 Verify leads Default View Go 
Given User is on "HomePage"
When User click on link "leads"
And User is on "LeadsHomePage"
And User click on dropdown "leadsviewdropdown"
And User read and select from dropdown "leadsviewdropdown" "leadsnewdefaultview"
And User click on button "go"
And User is on "LeadsViewPage"
Then User verify first selected item in dropdown "leadsviewdropdown" "leadsnewdefaultview"
Then User read and select from dropdown "leadsviewdropdown" "leadsallopenview"


@Leads
Scenario: TC24 Create New Lead 
Given User is on "HomePage"
When User click on link "leads"
And User is on "LeadsHomePage"
When User click on button "new"
And User is on "LeadsEditPage"
Then User verify the text "pagedescription" "New Lead"
When User read and enter into textbox "leadlastname"
When User read and enter into textbox "leadcompanyname"
And User click on button "save"
And User is on "LeadsDetailsPage"
Then User verify the data "updatedleadname" "leadlastname"
And User verify the data "updatedleadcompanyname" "leadcompanyname"




