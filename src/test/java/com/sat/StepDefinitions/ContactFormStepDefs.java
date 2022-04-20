package com.sat.StepDefinitions;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.sat.Pages.ContactForm;
import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactFormStepDefs
{
	
	 public WebDriver driver = TestBase.driver;
	 public ContactForm contact = new ContactForm(driver);
	 Testutil testUtil = new Testutil(TestBase.driver);
	
	@When("user search {string} and cick on contact name link")
	public void cick_on_any_contact_name_link(String name) throws InterruptedException {
	    contact.Clickoncontactname(name);
	}

	@Then("verify all tabs are appearing on the Contact Form")
	public void verify_all_tabs_are_appearing_on_the_Contact_Form(DataTable datatable) {
	    contact.verifyalltab(datatable);
	}

	@When("click on {string} tab")
	public void click_on_tab(String tab) {
	    contact.clickOnTab(tab);
	}

	@Then("verify Locked and unlocked fields under section")
	public void verify_Locked_unlocked_fields_under_section(DataTable datatable) {
		contact.lockedUnlocked(datatable);
		
	}

	@Then("verify Unlocked fields under GENERAL INFORMATION section")
	public void verify_Unlocked_fields_under_GENERAL_INFORMATION_section() {
	}
	
	@Then("verify filter options on the timeline")
	public void verify_filter_options_on_the_timeline() throws InterruptedException {
		contact.filterOfTimeline();
	}
	
	@Then("click on New Emergency Contact")
	public void click_on_New_Emergency_Contact() throws InterruptedException {
		contact.clickOnNewEmergencyContact();
		
	}

	@Then("click on New Contact")
	public void click_on_New_Contact() throws InterruptedException {
		contact.clickOnNewContact();
	}

	@And("verify all section {string} under Data Protection tab")
	public void verify_all_section_DATA_PROTECTION_DETAILS_under_Data_Protection_tab(String pageheading) {
		contact.verifyheading(pageheading);
	}

	@And("click on New Data Protection link")
	public void click_on_New_Data_Protection_link() throws InterruptedException {
		contact.clickOnNewDataProtection();
	}

	@Then("verify all section under tab")
	public void verify_all_section_under_General_tab(DataTable dataTable) {
	    contact.verifySectiOnOfTab(dataTable);
	}

	@Then("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		contact.clickOnSave();
	}

	@Then("user click on save and close button")
	public void user_click_on_save_and_close_button() throws InterruptedException {
		contact.clickOnSaveAndClose();
	}
	
	@Then("user click on refresh button")
	public void user_click_on_refresh_button() throws InterruptedException {
		contact.clickOnRefresh();
	}
	
	@Then("user click on Back button")
	public void user_click_on_back_button() throws InterruptedException {
		contact.clickOnBack();
	}

	@Then("user open {string} Form")
	public void user_open_Form(String text) throws InterruptedException {
		contact.openForm(text);
	}
	
	@Then("user enter description")
	public void user_enter_description() {
		contact.enterDescription();
	}

	//textarea[@aria-label='Description']
	@Then("user upload document")
	public void user_upload_document() throws InterruptedException, AWTException {
		WebElement element = driver.findElement(By.xpath("//li[text()='Related']"));
		element.click();
		Robot robot = new Robot(); 

        robot.keyPress(KeyEvent.VK_DOWN);
       Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);  
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
		//Actions action = new Actions(TestBase.driver);
		//WebElement element=	  driver.findElement(By.xpath("//li[@title='Documents']"));
		//action.moveToElement().click().perform();
	
	   
	}
	
	@Then("verify all tabs are appearing on the {string} Form")
	public void verify_all_tabs_are_appearing_on_the_Form(String form,DataTable datatable) {
		List<List<String>> actual = datatable.cells();
    	List<WebElement> element=driver.findElements(By.xpath("//ul[@aria-label='"+form+"']/li"));
    	try {
    	for(int i=0;i<1;i++)
    	{
    		for(int j=0;j<element.size();j++)
    		{		
    		System.out.println(element.get(j).getText());
    		Assert.assertEquals(actual.get(i).get(j),element.get(j).getText(),"Element is not Displayed");
    		}
    		
    	}}
    	catch(Exception e)
    	{
    		System.out.println("EXception :"+e+" has occurered");
    	} 
	}
	

	@Then("user Scroll down to Account field and click on the address hyperlink")
	public void user_click_on_the_address_hyperlink_and_open_Household_Group_Form() throws InterruptedException, AWTException {
		contact.clickOnAccountHyperlink();
	}
	

	

	









}

	



