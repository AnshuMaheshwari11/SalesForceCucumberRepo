Feature: Accounts all testcases

Background:
Given User secure launch the application


@Smoke @Accounts
Scenario: TC10 Create New Account 
Given User is on "HomePage"
When User click on link "accounts"
And User is on "AccountsHomePage"
Then User verify the text "pagetype" "Accounts"
When User click on button "new"
And User is on "AccountsEditPage"
Then User verify the text "pagedescription" "New Account"
When User read and enter into textbox "accountname"
And User read and select from dropdown "accounttypedropdown" "accounttype"
And User read and select from dropdown "custprioritydropdown" "custpriority"
And User click on button "save"
And User is on "AccountsDetailsPage"
Then User verify the data contains "updatedaccountname" "accountname"
And User verify the data "updatedaccounttype" "accounttype"
And User verify the data "updatedcustpriority" "custpriority"


@Accounts
Scenario: TC11 Create New Accounts View 
Given User is on "HomePage"
When User click on link "accounts"
And User is on "AccountsHomePage"
And User click on button "createnewview"
And User is on "AccountsCreateOrEditViewPage"
Then User verify the text "pagedescription" "Create New View"
When User read and enter into textbox "accountsviewname"
And User clear the textbox "accountsviewuniqname"
And User read and enter into textbox "accountsviewuniqname"
And User click on button "save"
And User is on "AccountsViewPage"
Then User verify first selected item in dropdown "accountviewdropdown" "accountsviewname"


@Accounts
Scenario: TC12 Edit Accounts View 
Given User is on "HomePage"
When User click on link "accounts"
And User is on "AccountsHomePage"
And User click on button "edit"
And User is on "AccountsCreateOrEditViewPage"
Then User verify the text "pagedescription" "Edit View"
When User read and enter into textbox "accountsviewname" "editaccountviewname"
And User read and select from dropdown "filterfielddropdown" "filterfield"
And User read and select from dropdown "filteroperatordropdown" "filteroperator"
And User read and enter into textbox "filtervalue"
And User read and select from dropdown "availablefielddropdown" "availablefield"
And User click on button "add"
And User click on button "save"
And User is on "AccountsViewPage"
Then User verify first selected item in dropdown "accountviewdropdown" "editaccountviewname"
And User verify the item in list "viewcolumnlist" "availablefield"


@Accounts
Scenario: TC13 Merge Accounts
Given User is on "HomePage"
When User click on link "accounts"
And User is on "AccountsHomePage"
And User click on link "mergeaccounts"
And User is on "AccountsMergeAccountsPage"
Then User verify the text "pagetype" "Merge My Accounts"
When User read and enter into textbox "searchtexttomerge"
And User click on button "findaccounts"
And User check the checkbox "accountsid1"
And User check the checkbox "accountsid2"
And User uncheck the checkbox "accountsid3"
And User click on button "next"
And User store the data "mergeaccountname"
And User click on button "save"
And User accept popup alert
And User is on "AccountsHomePage"
Then User verify the data "firstrecentaccountname" "mergeaccountname"

@Accounts
Scenario: TC14 Create Account Last Activity Report
Given User is on "HomePage"
When User click on link "accounts"
And User is on "AccountsHomePage"
And User click on link "lastactivityreport"
And User is on "AccountsUnSavedReportPage"
Then User verify the text "pagedescription" "Unsaved Report"
When User click on dropdown "datefield"
And User click on link "createddate"
And User click on link "fromdateicon"
And User click on link "fromdatetoday"
And User click on link "todateicon"
And User click on link "todatetoday"
And User click on button "save"
And User read and enter into textbox "reportname"
And User clear the textbox "reportuniqname"
And User read and enter into textbox "reportuniqname"
And User wait for 3000 milliseconds
And User click on button "saveandrun"
And User is on "AccountsSavedReportPage"
And User wait for page to load
And User hover on "popupclose"
And User click on button "popupclose"
Then User verify the data "pagetype" "reportname"





