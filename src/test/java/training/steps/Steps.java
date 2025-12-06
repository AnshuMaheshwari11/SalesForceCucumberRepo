package training.steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import training.base.BaseTest;

public class Steps extends BaseTest{

	@Given("User launch the application")
	public void user_launch_the_application() {
		launchApplication();
	}
	
	@Given("User secure launch the application")
	public void user_secure_launch_the_application() {
	    secureLaunch();
	}

	@Given("User is on {string}")
	public void user_is_on(String pagename) {
	    createPageInstance(pagename);
	}
	
	@When("User wait for page to load")
	public void user_wait_for_page_to_load() {
		page.waitForPageToLoad();
	}
	
	@When("User wait for {long} milliseconds")
	public void user_wait_for_milliseconds(long timeinmillis) {
	    page.waitFor(timeinmillis);
	}
	
	@When("User clear the textbox {string}")
	public void user_clear_the_textbox(String elementname) {
	   page.clickOn(elementname);	
	   page.clearTextbox(elementname);
	}
	
	@When("User enter into textbox {string} {string}")
	public void user_enter_into_textbox(String elementname, String text) {
	   page.enterIntoTextBox(elementname, text);
	}
	
	@When("User read and enter into textbox {string}")
	public void user_read_and_enter_into_textbox(String elementname) {
	   page.readAndEnterIntoTextBox(elementname);
	}
	
	@When("User read and enter into textbox {string} {string}")
	public void user_read_and_enter_into_textbox(String elementname, String newkey) {
	   page.readAndEnterIntoTextBox(elementname, newkey);
	}
	
	@When("User read and select from dropdown {string} {string}")
	public void user_read_and_select_from_dropdown(String elementname, String key) {
		page.readAndSelectFromDropdown(elementname, key);
	}
	
	@When("User read and select from dropdown by value {string} {string}")
	public void user_read_and_select_from_dropdown_by_value(String elementname, String key) {
		page.readAndSelectFromDropdownByValue(elementname, key);
	}
	
	@When("User read and click the list item {string} {string}")
	public void user_read_and_click_the_list_item(String elementname, String key) {
		page.readAndClickTheListItem(elementname, key);
	}
	
	@When("User read and upload the file {string}")
	public void user_read_and_upload_the_file(String elementname) {
	   page.readAndUploadFile(elementname);
	}
	
	@When("User store the data {string}")
	public void user_store_the_data(String elementname) {
		page.storeData(elementname);
	}
	
	@When("User click on button {string}")
	public void user_click_on_button(String elementname) {
	    page.clickOn(elementname);
	}

	@When("User click on link {string}")
	public void user_click_on_link(String elementname) {
		page.clickOn(elementname);
	}
	
	@When("User click on dropdown {string}")
	public void user_click_on_dropdown(String elementname) {
		page.clickOn(elementname);
	}
	
	@When("User check the checkbox {string}")
	public void user_check_the_checkbox(String elementname) {
		if(!page.isSelected(elementname))
			page.clickOn(elementname);
	}
	
	@When("User uncheck the checkbox {string}")
	public void user_uncheck_the_checkbox(String elementname) {
		if(page.isSelected(elementname))
			page.clickOn(elementname);
	}
	
	@When("User switch to iframe {string}")
	public void user_switch_to_iframe(String elementname) {
		page.switchToFrame(elementname);
	}

	@When("User switch to default content")
	public void user_switch_to_default_content() {
	    page.switchToDefaultContent();
	}
	
	@When("User hover on {string}")
	public void user_hover_on(String elementname) {
	   page.HoverOn(elementname);
	}
	
	@When("User hold and move {string} {string} {string}")
	public void user_hold_and_move(String elementname, String xoffset, String yoffset) {
		page.holdAndMove(elementname, xoffset, yoffset);
	}
	
	@Then("User Close new window")
	public void user_close_new_window() {
		page.closeNewWindow();
	}
	
	@When("User accept popup alert")
	public void user_accept_popup_alert() {
		page.acceptPopUpAlert();
	}
	
	//Verification Section
	
	@Then("User verify the text {string} {string}")
	public void user_verify_the_text(String elementname, String expectedvalue) {
		page.verifyText(elementname, expectedvalue);
	}

	@Then("User verify the text contains {string} {string}")
	public void user_verify_the_text_contains(String elementname, String expectedvalue) {
		page.verifyTextContains(elementname, expectedvalue);
	}
	
	@Then("User verify the data {string} {string}")
	public void user_verify_the_data(String elementname, String expectedkey) {
	   page.verifyData(elementname, expectedkey);
	}

	@Then("User verify the data contains {string} {string}")
	public void user_verify_the_data_contains(String elementname, String expectedkey) {
		page.verifyDataContains(elementname, expectedkey);
	}
	
	@Then("User verify the item in list {string} {string}")
	public void user_verify_the_item_in_list(String elementname, String expectedkey) {
		page.verifyListItem(elementname, expectedkey);
	}
	
	@Then("User verify the following items in list {string}")
	public void user_verify_the_following_items_in_list(String elementname, DataTable dataTable) {
		List<String> expectedvalues = dataTable.asList(String.class);
		page.verifyAllListItems(elementname, expectedvalues);
	}

	@Then("User verify the item is not in list {string} {string}")
	public void user_verify_the_item_is_not_in_list(String elementname, String expectedkey) {
		page.verifyItemNotInList(elementname, expectedkey);
	}
	
	@Then("User verify the item in dropdown {string} {string}")
	public void user_verify_the_item_in_dropdown(String elementname, String expectedkey) {
	    page.verifyDropdownItem(elementname, expectedkey);
	}
	
	@Then("User verify first selected item in dropdown {string} {string}")
	public void user_verify_first_selected_item_in_dropdown(String elementname, String expectedkey) {
	    page.verifyFirstSelectedDropdownItem(elementname, expectedkey);
	}
	
	@Then("User verify first selected item in dropdown by value {string} {string}")
	public void user_verify_first_selected_item_in_dropdown_by_value(String elementname, String expectedkey) {
	    page.verifyFirstSelectedDropdownItemByValue(elementname, expectedkey);
	}
	
	@Then("User verify following items in dropdown {string}")
	public void user_verify_following_items_in_dropdown(String elementname, DataTable dataTable) {
		List<String> expectedvalues = dataTable.asList(String.class);
		page.verifyAllDropdownItems(elementname, expectedvalues);
	}
	
	@Then("User verify the item is not in dropdown {string} {string}")
	public void user_verify_the_item_is_not_in_dropdown(String elementname, String expectedvalue) {	
		page.verifyItemNotInDropDown(elementname, expectedvalue);
	}

	@Then("User verify the data is displayed {string}")
	public void user_verify_the_data_is_displayed(String elementname) {
	    page.verifyIsDisplayed(elementname);
	}
	
	@Then("User verify the data is selected {string}")
	public void user_verify_the_data_is_selected(String elementname) {
	    page.verifyIsSelected(elementname);
	}
	
	@Then ("User verify the list is not empty {string}")
	public void user_verify_the_list_is_not_empty(String elementname) {
	    page.verifyListIsNotEmpty(elementname);
	}
	
	@Then("User verify the new window {string}")
	public void user_verify_the_new_window(String expectedvalue) {
		page.verifyNewWindow(expectedvalue);
	}
	
	@After
	public void teardown() {
		closeApplication();
	}

}
