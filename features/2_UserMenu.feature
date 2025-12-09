Feature: Usermenu dropdown all testcases

Background:
Given User secure launch the application


@Smoke @UserMenu
Scenario: TC05 Select UserMenu Dropdown
Given User is on "HomePage"
When User click on link "usermenu"
Then User verify the following items in list "usermenulist"
|My Profile|
|My Settings|
|Developer Console|
|Switch to Lightning Experience|
|Logout|


@UserMenu @UserProfile
Scenario: TC06A Select UserMenu MyProfile and Edit 
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "myprofile"
And User is on "UserProfilePage"
And User wait for page to load
Then User verify the text "userprofile" "People"
When User click on link "editProfileicon"
And User switch to iframe "aboutcontactframe"
And User click on button "abouttab"
And User clear the textbox "lastname"
And User read and enter into textbox "lastname"
And User click on button "saveall"
And User switch to default content
Then User verify the data contains "profilename" "lastname"


@UserMenu @UserProfile
Scenario: TC06B Select UserMenu MyProfile and Post
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "myprofile"
Then User is on "UserProfilePage"
And User wait for page to load
When User click on link "post"
And User switch to iframe "postframe"
And User read and enter into textbox "postcontent"
And User switch to default content
And User click on button "share"
And User wait for 3000 milliseconds
Then User verify the text contains "feeditemtopic" "Click to add topics:"
And User verify the data "postedfeed" "postcontent"

@UserMenu @UserProfile
Scenario: TC06C Select UserMenu MyProfile and Upload File
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "myprofile"
Then User is on "UserProfilePage"
And User wait for page to load
When User click on link "file"
And User click on button "uploadfile"
And User read and upload the file "choosefilepath"
And User click on button "share"
And User wait for 3000 milliseconds
Then User verify the text contains "feeditemtopic" "Click to add topics:"
And User verify the data "uploadedfile" "filebasename"

@UserMenu @UserProfile
Scenario: TC06D Select UserMenu MyProfile and Upload ProfilePhoto
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "myprofile"
Then User is on "UserProfilePage"
And User wait for page to load
When User hover on "profilephoto"
And User click on link "addphoto"
And User switch to iframe "photocontentframe"
And User read and upload the file "profilephotopath"
And User click on button "save"
And User hold and move "photocroparea" "imageXoffset" "imageYoffset"
And User click on button "saveimage"
And User switch to default content
And User wait for 3000 milliseconds
Then User verify the text "addphoto" "Update"


@UserMenu @UserSetting
Scenario: TC07A Select UserMenu MySettings and Download Login History
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "mysettings"
And User is on "UserSettingsPage"
Then User verify the text "pagename" "My Settings"
When User click on button "personal"
And User click on button "loginhistory"
And User click on link "downloadhistory"
Then User verify the text "pagetype" "Login History"

@UserMenu @UserSetting
Scenario: TC07B Select UserMenu MySettings and Update Display and Layout
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "mysettings"
Then User is on "UserSettingsPage"
When User click on button "displayandlayout"
And User click on button "customizemytabs"
And User click on dropdown "customappdropdown"
And User read and select from dropdown "customappdropdown" "customapp"
And User read and select from dropdown "availabletabdropdown" "tabtoadd"
And User click on button "add"
Then User verify the item in dropdown "selectedtabdropdown" "tabtoadd"
When User click on button "save"
And User is on "HomePage"
And User click on dropdown "appmenu"
And User click on link "salesforcechatter"
Then User verify the item in list "tabbarmenulist" "tabtoadd"
And User click on dropdown "appmenu"
And User click on link "Content"

@UserMenu @DeveloperConsole
Scenario: TC08 Select UserMenu Developer Console
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "developerconsole"
Then User verify the new window "Developer Console"
When User Close new window
And User is on "HomePage"
Then User verify the text "pagename" "Home"


@UserMenu @Logout
Scenario: TC09 Select UserMenu Logout
Given User is on "HomePage"
When User click on link "usermenu"
And User click on link "logout"
And User is on "LoginPage"
Then User verify the data is displayed "loginform"


