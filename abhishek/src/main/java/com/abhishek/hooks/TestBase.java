package com.abhishek.hooks;

import com.abhishek.frameworkUtils.CoreUtils;
import com.abhishek.frameworkUtils.DriverScript;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;

public class TestBase {
	
	@Before
	public void setup(Scenario scenario) {
		DriverScript.launchBrowser();
	}
	

}
