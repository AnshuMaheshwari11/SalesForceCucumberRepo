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
Scenario: TC34 Current User Edit LastName
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
When User is on "HomePage"
Then User verify the text contains "usermenulabel" "ABCD"
When User is on "UserProfilePage"
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
And User wait for page to load
And User click on dropdown "appmenu"
And User click on link "salesforcechatter"
And User wait for page to load
Then User verify the item is not in list "tabbarmenulist" "tabtoremove"
And User click on dropdown "appmenu"
And User click on link "Content"


@Other
Scenario: TC36 Block Calender Event
Given User is on "HomePage"
When User click on link "currentdate"
And User is on "CalenderViewPage"
Then User verify the text contains "pagetype" "Calendar"
And User read and click the list item "hourlist" "eventstarttime"
And User is on "CalenderNewEventPage"
Then User verify the text contains "pagedescription" "New Event"
When User click on button "subjectsearchicon"
And User click the item in new window "subjectlist" "Other"
And User click on link "endtime"
And User read and click the list item "timepickerlist" "eventendtime"
And User uncheck the checkbox "reminder"
And User click on button "save"
And User is on "CalenderViewPage"
Then User verify the event is blocked "eventblocklist" "hourlist" "eventstarttime"


@Other
Scenario: TC37 Block Recurring Calender Event
Given User is on "HomePage"
When User click on link "currentdate"
And User is on "CalenderViewPage"
Then User verify the text contains "pagetype" "Calendar"
And User read and click the list item "hourlist" "recureventstarttime"
And User is on "CalenderNewEventPage"
Then User verify the text contains "pagedescription" "New Event"
When User click on button "subjectsearchicon"
And User click the item in new window "subjectlist" "Other"
And User click on link "endtime"
And User read and click the list item "timepickerlist" "recureventendtime"
And User check the checkbox "isreccurance"
And User click on button "recurweekly"
And User click on dropdown "recurenddate"
And User read and select from dropdown "monthdropdown" "recurmonth"
And User read and select from dropdown "yeardropdown" "recuryear"
And User read and click the list item "caldateslist" "recurday"
And User uncheck the checkbox "reminder"
And User click on button "save"
Then User is on "CalenderViewPage"
And User wait for page to load
When User click on button "monthviewicon"
Then User verify the text "caltoday" "Other"
And User verify the text "calnextweek" "Other"
