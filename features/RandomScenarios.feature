Feature: scenarios related to UserProfile and Calender all testcases

Background:
Given User secure launch the application


@Other
Scenario: TC33 Verify Logged in User 
Given User is on "HomePage"
When User click on link "currentusername"
And User is on "UserProfilePage"
Then User verify the text "userprofile" "People"

@Other
Scenario: TC34 Select UserMenu MyProfile and Post
Given User is on "HomePage"
When User click on link "currentusername"
And User is on "UserProfilePage"
And User click on link "editProfileicon"
And User switch to iframe "aboutcontactframe"
And User click on button "abouttab"
And User clear the textbox "lastname"
And User enter into textbox "lastname" "ABCD"
And User click on button "saveall"
And User switch to default content
Then User verify the text contains "profilename" "ABCD"

@Other
Scenario: TC35 Customize Tab Removal
Given User is on "HomePage"
When User click on link "plusicon"
Then User is on "ShowAllTabsPage"
When User click on button "customizemytabs"
Then User is on "UserSettingsPage"
And User click on dropdown "customappdropdown"
And User read and select from dropdown "customappdropdown" "customapp"
And User read and select from dropdown "selectedtabdropdown" "tabtoremove"
And User click on button "remove"
Then User verify the item in dropdown "availabletabdropdown" "tabtoremove"
When User click on button "save"
And User is on "HomePage"
And User click on dropdown "appmenu"
And User click on link "salesforcechatter"
Then User verify the item is not in list "tabbarmenulist" "tabtoremove"
And User click on dropdown "appmenu"
And User click on link "Content"


@Other
Scenario: TC36 Block Calender Event
Given User is on "HomePage"
When User click on link "currentdate"
Then User verify the text contains "pagetype" "Calender"
Then User is on "CalenderViewPage"
When User click on button "customizemytabs"
Then User is on "UserSettingsPage"
And User click on dropdown "customappdropdown"
