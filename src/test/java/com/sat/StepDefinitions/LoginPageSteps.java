package com.sat.StepDefinitions;

import com.sat.Pages.LoginPage;
import com.sat.testUtil.Testutil;
import com.sat.testbase.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps extends TestBase{
	//WebDriver driver;
	TestBase testbase = new TestBase();
	
	private LoginPage loginpage = new LoginPage(TestBase.driver);
	Testutil testUtil = new Testutil(TestBase.driver);
	
	@Given("User navigates to CRM login page")
	public void user_navigates_to_CRM_login_page() {
		testbase.UrlLaunch();
	
  }
	//@And ("Verify title of login page")
	

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String userid) throws InterruptedException {
		loginpage.enteruserid(userid);
		Thread.sleep(3000);
	   
	}

	@And("Click on Next button")
	public void click_on_Next_button() {
		loginpage.clickonNext();

	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String pwd) {
		loginpage.enterpassword(pwd);
	    
	}

	@And("click on signin")
	public void clicks_on_signin() {
		loginpage.clickonsignin();
	    
	}
	
	@And("Click on yes")
	public void click_on_yes() {
		loginpage.clickonYes();
	    
	}
	@Then("user is navigated to {string} page")
	public void user_is_navigated_to_page(String exceptedtitle) {
		String title = loginpage.GetLoginPageTitle();
		System.out.println("Title is " +title);
		//Assert.assertTrue(title.contains(exceptedtitle));
  	}
	
	@Then("user selects App {string}")
	public void user_selects_App(String appname) throws InterruptedException {
		testUtil.switchToFrame("AppLandingPage");
		loginpage.GetApp(appname).click();
		driver.switchTo().defaultContent();
		//Thread.sleep(2000);
	}
	


	
	}
	    
	



