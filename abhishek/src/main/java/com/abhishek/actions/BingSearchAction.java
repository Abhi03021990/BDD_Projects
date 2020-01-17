package com.abhishek.actions;

import com.abhishek.frameworkUtils.CoreUtils;
import com.abhishek.ui.BingSearchPage;

public class BingSearchAction extends CoreUtils{
	
	public void launchBing() {
		launchApplication("https://www.bing.com");
	}
	
	public void enterValidSearchText() {
		typeText(BingSearchPage.SEARCH_BOX, "Cucumber");
	}
	public void clickOnSearchResult() {
		clickElement(BingSearchPage.SEARCH_BUTTON);
	}
	public boolean validateResult() {
		return true;
	}

}
