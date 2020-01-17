package com.abhishek.stepDefinitions;

import org.junit.Assert;

import com.abhishek.actions.BingSearchAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingSearchPageStepDefenitions extends BingSearchAction{
	@Given("User launches bing search page")
	public void user_launches_bing_search_page() {
	    launchBing();
	}

	@Given("enters some valid text to search in the search box")
	public void enters_some_valid_text_to_search_in_the_search_box() {
	   enterValidSearchText();
	}

	@When("User clicks on the search box")
	public void user_clicks_on_the_search_box() {
	    clickOnSearchResult();
	}

	@Then("Relevant search result should be displayed")
	public void relevant_search_result_should_be_displayed() {
	    //Assert.assertTrue(validateResult());
	}

}
