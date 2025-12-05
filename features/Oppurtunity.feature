Feature: Opportunity all testcases

Background:
Given User secure launch the application


@Smoke @Opty
Scenario: TC15 Select Oppprtunity Dropdown
Given User is on "HomePage"
When User click on link "opportunities"
And User is on "OptyHomePage"
Then User verify following items in dropdown "optyviewdropdown"
|All Opportunities|
|Closing Next Month|
|Closing This Month|
|My Opportunities|
|New Last Week|
|New This Week|
|Opportunity Pipeline|
|Private|
|Recently Viewed Opportunities|
|Won|

@Opty
Scenario: TC16 Create New Opportunity 
Given User is on "HomePage"
When User click on link "opportunities"
And User is on "OptyHomePage"
And User click on link "new"
And User is on "OptyEditPage"
Then User verify the text "pagedescription" "New Opportunity"
When User read and enter into textbox "optyname"
And User read and enter into textbox "optyaccname"
And User read and enter into textbox "leadsource"
And User click on button "closedate"
And User click on button "calToday"
And User read and select from dropdown "stagedropdown" "stage"
And User clear the textbox "probability"
And User read and enter into textbox "probability"
And User read and enter into textbox "campaignsrc"
And User click on button "save"
And User is on "OptyDetailsPage"
Then User verify the data "updatedoptyname" "optyname"
Then User verify the data "updatedoptyaccname" "optyaccname"

@Opty
Scenario: TC17 Create Opportunity Pipeline Report
Given User is on "HomePage"
When User click on link "opportunities"
And User is on "OptyHomePage"
And User click on link "optypipeline"
And User is on "OptyPipelineReportPage"
Then User verify the text "pagetype" "Opportunity Pipeline"


@Opty
Scenario: TC18 Create Stuck Opportunity Report
Given User is on "HomePage"
When User click on link "opportunities"
And User is on "OptyHomePage"
And User click on link "stuckopportunities"
And User is on "OptyStuckReportPage"
Then User verify the text "pagetype" "Stuck Opportunities"

@Opty
Scenario: TC19 Create Oppurtunity Quarterly Summary Report
Given User is on "HomePage"
When User click on link "opportunities"
And User is on "OptyHomePage"
And User read and select from dropdown "intervaldropdown" "interval"
And User read and select from dropdown by value "includedropdown" "include"
And User click on link "run"
And User is on "OptyQuarterlySummaryPage"
Then User verify the text "pagetype" "Opportunity Report"
And User verify first selected item in dropdown "rangedropdown" "interval"
And User verify first selected item in dropdown by value "statusdropdown" "include"



