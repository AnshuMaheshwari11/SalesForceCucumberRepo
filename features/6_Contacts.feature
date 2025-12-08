Feature: Contacts all testcases

Background:
Given User secure launch the application

@Smoke @Contacts
Scenario: TC25 Create New Contact With Existing Account Name 
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
When User click on button "new"
And User is on "ContactsEditPage"
Then User verify the text "pagedescription" "New Contact"
When User read and enter into textbox "contactlastname"
When User read and enter into textbox "contactaccname"
And User click on button "save"
And User is on "ContactsDetailsPage"
Then User verify the data "updatedcontactname" "contactlastname"
And User verify the data "updatedcontactaccname" "contactaccname"


@Contacts
Scenario: TC26 Create New Contact View 
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
And User click on button "createnewview"
And User is on "ContactsCreateViewPage"
Then User verify the text "pagedescription" "Create New View"
When User read and enter into textbox "contactsviewname"
And User clear the textbox "contactsviewuniqname"
And User read and enter into textbox "contactsviewuniqname"
And User click on button "save"
And User is on "ContactsViewPage"
Then User verify first selected item in dropdown "contactsviewdropdown" "contactsviewname"


@Contacts
Scenario: TC27 Check Recently Created Contact 
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
And User read and select from dropdown "recentdisplaydropdown" "recentdisplaymode"
Then User verify the list is not empty "recentcontactslist"


@Contacts
Scenario: TC28 Verify Contacts My Contacts View 
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
And User click on dropdown "contactsviewdropdown"
And User read and select from dropdown "contactsviewdropdown" "contactsview"
And User is on "ContactsViewPage"
Then User verify first selected item in dropdown "contactsviewdropdown" "contactsview"
Then User read and select from dropdown "contactsviewdropdown" "contactsallview"


@Contacts
Scenario: TC29 View Contact details in Contact Page
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
And User read and click the list item "recentcontactslist" "contactnametoview"
And User is on "ContactsDetailsPage"
Then User verify the data "pagedescription" "contactnametoview"
And User verify the data "updatedcontactname" "contactnametoview"

@Contacts
Scenario: TC30 Create New Contact View Error 
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
And User click on button "createnewview"
And User is on "ContactsCreateViewPage"
Then User verify the text "pagedescription" "Create New View"
When User read and enter into textbox "contactsviewuniqname"
And User click on button "save"
Then User verify the text "errormsg" "Error: You must enter a value"

@Contacts
Scenario: TC31 Cancel New Contact View 
Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
And User click on button "createnewview"
And User is on "ContactsCreateViewPage"
Then User verify the text "pagedescription" "Create New View"
When User enter into textbox "contactsviewname" "ABCD"
And User clear the textbox "contactsviewuniqname"
And User enter into textbox "contactsviewuniqname" "EFGH"
And User click on button "cancel"
And User is on "ContactsHomePage"
Then User verify the text "pagetype" "Contacts"
Then User verify the item is not in dropdown "contactsviewdropdown" "ABCD"

 
@Contacts
Scenario: TC32 Create New Contact With New Account Name 

Given User is on "HomePage"
When User click on link "contacts"
And User is on "ContactsHomePage"
When User click on button "new"
And User is on "ContactsEditPage"
Then User verify the text "pagedescription" "New Contact"
When User enter into textbox "contactlastname" "Indian"
When User enter into textbox "contactaccname" "Global"
And User click on button "save"
And User is on "ContactsDetailsPage"
Then User verify the text "updatedcontactname" "Indian"
And User verify the text "updatedcontactaccname" "Global"



