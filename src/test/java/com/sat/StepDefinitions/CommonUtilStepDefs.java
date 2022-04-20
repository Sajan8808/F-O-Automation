package com.sat.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.sat.Pages.CommonPages;
import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonUtilStepDefs {
	public WebDriver driver = TestBase.driver;
	public CommonPages common = new CommonPages(driver);
	Testutil testUtil = new Testutil(driver);
	public static String output = "";

	@Then("user selects {string} as {string}")
	public void user_selects_with(String label, String option) {
		common.selectLabelWithOption(label, option);
		Wait.untilPageLoadComplete(TestBase.driver);
	}

	@When("user filters {string} as {string} with {string}")
	public void user_filters_with(String filter, String option, String filterOption) throws InterruptedException {
		user_selects_with(filter, option);
		common.selectFilterWithOption(filterOption);
	}
}
