package com.sat.StepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.sat.Pages.ContactForm;
import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoRoutingStepDefs {
	public WebDriver driver = TestBase.driver;
	public ContactForm contact = new ContactForm(driver);
	Testutil testUtil = new Testutil(driver);
	public static String output = "";

	@Then("user click on Create Time line and select {string}")
	public void user_click_on_Create_Time_line_and_select(String record) throws InterruptedException {
		contact.addTimeLineRecord();
		testUtil.jsclick(contact.timeLineRecord(record), driver);
	}

	@And("select Task category {string} and Sub Category {string}")
	public void select_Task_category_and_Sub_Category(String taskcategory, String subCategory) {
		testUtil.jsclick(contact.taskCategory(), driver);
		testUtil.selectByVisibleText(driver, contact.taskCategory(), taskcategory);
		Wait.untilPageLoadComplete(driver);
		Wait.elementToBeClickable(driver, contact.taskSubCategory(), 30);
		testUtil.jsclick(contact.taskSubCategory(), driver);
		testUtil.selectByVisibleText(driver, contact.taskSubCategory(), subCategory);
	}

	@And("select task with contact {string}")
	public void select_task_with_contact(String cont) {
		Wait.untilPageLoadComplete(driver);
		String time = contact.enteredTime(cont);
		if(user_verifies_the_date_and_time_stored(time))
			contact.selectTaskByContact(cont);
	}

	public String User_gets_the_current_date_and_time() {
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));
		return formatter.format(date);
	}
	
	@Then("User stores the current date and time {string}")
	public String current_date_and_time_to_TimeZone(String timeZone) {
    DateFormat indianFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    indianFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
    Date timestamp = new Date(System.currentTimeMillis());
    output = indianFormat.format(timestamp);
    System.out.println("Stored time :"+output);
    return output;
	}
	
	@And("user verifies the date and time stored {string}")
	public boolean user_verifies_the_date_and_time_stored(String time) {
		String actualTime = output;
		System.out.println("Actual time :"+actualTime+" and expected time is "+time);
		boolean result = actualTime.contentEquals(time)|| actualTime.compareTo(time)>0;
		return result;
	}
	
	@Then("verify the task is routed to {string}")
	public void verify_the_task_is_routed_to(String Route) {
		SoftAssert softassert = new SoftAssert();
		String actualRoute = contact.getRouteFromTheCreatedTask();
		Wait.untilPageLoadComplete(TestBase.driver);
		softassert.assertEquals(actualRoute, Route,"The task is routed to "+actualRoute+" instead of "+Route);
		softassert.assertAll();
	}

	@And("click on Vertical symbol of Queues and select {string}")
	public void click_on_Vertical_symbol_of_Queues_and_select(String item) {
		contact.selectVerticalSymbolOfQueues(item);
		Wait.untilPageLoadComplete(TestBase.driver);
	}
	
	@Then("Verify details in the Queue")
	public void verify_details_in_the_Queue(DataTable table)
	{
		
		List<List<String>> actual = table.cells();
		try {
	    	for(int i=0;i<1;i++)
	    	{
	    		for(int j=0;j<6;j++)
	    		{	
	    		List<WebElement> expectedValue = driver.findElements(By.xpath("(//*[text()='"+actual.get(i).get(j)+"'])[last()]"));
	    			Assert.assertTrue(!expectedValue.isEmpty(),"Element "+expectedValue+" is not present");
	    		System.out.println("Print values :" +actual.get(i).get(j));
//	    		expectedValue.click();
//	    		System.out.println("expec values" +expectedValue.getAttribute("text").trim());
	    		
//	    		Assert.assertTrue(expectedValue.getText().trim().contentEquals(actual.get(i).get(j)), "Element "+actual.get(i).get(j)+" is not present");
	    		}
	    		
	    	}}
	    	catch(Exception e)
	    	{
	    		System.out.println("Exception :"+e+" has occurered");
	    	}
	}
	
	@And("click on queue and validate details in the queue")
	public void click_on_and_validate_details_in_the_queue(DataTable table) {
		List<List<String>> actual = table.cells();
		try {
			driver.findElement(By.xpath("//*[text()='"+actual.get(0).get(0)+"']")).click();
			driver.findElement(By.xpath("//*[@id='confirmButtonText']")).click();
	    	for(int i=0;i<1;i++)
	    	{
	    		for(int j=1;j<6;j++)
	    		{	
	    		List<WebElement> expectedValue = driver.findElements(By.xpath("//*[text()='"+actual.get(i).get(j)+"']"));
	    			Assert.assertTrue(!expectedValue.isEmpty(),"Element "+expectedValue+" is not present");
	    		System.out.println("Queue details :" +actual.get(i).get(j));
	    		}
	    		
	    	}}
	    	catch(Exception e)
	    	{
	    		System.out.println("Exception :"+e+" has occurered");
	    	}
	}
}
