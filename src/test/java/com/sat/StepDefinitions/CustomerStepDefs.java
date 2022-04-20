package com.sat.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sat.Pages.CustomerPage;
import com.sat.Pages.LoginPage;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDefs {

	public WebDriver driver = TestBase.driver;

	public LoginPage loginpage = new LoginPage(driver);
	public CustomerPage accountpage = new CustomerPage(driver);

	@When("user click on {string} under customer")
	public void user_click_on_under_customer(String tab) {
		accountpage.entity(tab);

	}

	@When("user click on {string} under Service")
	public void user_click_on_under_service(String tab) {
		accountpage.entity(tab);
		Wait.untilPageLoadComplete(driver);
	}

	@And("user verify left side pane under customer")
	public void user_verify_left_side_pane_under_customer() throws InterruptedException {
		accountpage.verifyleftsidepane();
	}

	@And("user click on Drop Down List")
	public void user_click_on_drop_Down_List() {

		accountpage.clickonDropdownList();
	}

	@And("user select {string} from drop down list")
	public void user_select_from_drop_down_list(String option) throws InterruptedException {
		accountpage.clickonAllAccount(option);
		Wait.untilPageLoadComplete(driver);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[text()='"+option+"']")).click();

	}

	@When("user select a queue filter {string}")
	public void user_select_a_queue_filter(String filter) throws InterruptedException {
		accountpage.selectQueueFilter(filter);
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);
	}

	@Then("user enter {string} in search text box and validate text")
	public void user_enter_text_in_search_text_box(String SearchText) throws InterruptedException {
		accountpage.Entertextinsearch(SearchText);

	}

	@Then("user enter {string} in global search text box and validate text")
	public void user_enter_text_in_global_search_text_box(String SearchText) throws InterruptedException {
		accountpage.enterTextInGlobalSearch(SearchText);

	}

	@And("user click on search icon")
	public void user_click_on_search_icon() {
		accountpage.clickonsearchicon();

	}

	@Then("search result is display{string}")
	public void search_result_is_display(String searchtext) {

		accountpage.verifysearchresult(searchtext);

	}

	@Then("user click on Blocks entity and verify local search")
	public void user_click_on_Blocks_entity_and_verify_local_search(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='Blocks']")).click();
		Thread.sleep(2000);
		accountpage.localSearch(dataTable);
	}

	@Then("user click on Neighborhoods entity and verify local search")
	public void user_click_on_Neighborhoods_entity_and_verify_local_search(DataTable dataTable)
			throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='Neighborhoods']")).click();
		Thread.sleep(2000);
		accountpage.localSearch(dataTable);
	}

	@Then("user click on Schemes entity and verify local search")
	public void user_click_on_Schemes_entity_and_verify_local_search(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='Schemes']")).click();
		Thread.sleep(2000);
		accountpage.localSearch(dataTable);

	}

	@Then("user click on Contacts entity and verify local search")
	public void user_click_on_Contacts_entity_and_verify_local_search(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='Contacts']")).click();
		Thread.sleep(2000);
		accountpage.clickonDropdownList();
		driver.findElement(By.xpath("//*[text()='All Contacts']")).click();
		Thread.sleep(2000);
		accountpage.localSearch(dataTable);
	}

	@Then("user click on Data Protection entity and verify local search")
	public void user_click_on_Data_Protection_entity_and_verify_local_search(DataTable dataTable)
			throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='Data Protection']")).click();
		Thread.sleep(2000);
		accountpage.localSearch(dataTable);
	}

	@Then("user click on Tenancies and verify local search")
	public void user_click_on_Tenancies_and_verify_local_search(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='Tenancies']")).click();
		Thread.sleep(2000);
		accountpage.localSearch(dataTable);
	}

	@Then("user click on Knowledge Articles and verify local search")
	public void user_click_on_Knowledge_Articles_and_verify_local_search(DataTable dataTable) {

	}

}
