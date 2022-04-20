package com.sat.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;
import io.cucumber.datatable.DataTable;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class CommonPages {

	public WebDriver driver;
	Testutil testutil = new Testutil(TestBase.driver);

	@FindBy(xpath = "//*[text()='Apply']")
	WebElement apply;
	
	@FindBy(xpath = "//div[@aria-label='Filter by value']/span[contains(@class,'Dropdown-caret')]")
	WebElement filterByValue;
	
	public CommonPages(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void selectFilterWithOption(String filterOption) throws InterruptedException {
		Wait.elementToBeClickable(driver, filterByValue, 30);
		Thread.sleep(2000);
		testutil.jsclick(filterByValue,driver);
		//filterByValue.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'dropdownOptionText')][text()='"+filterOption+"']")).click();
		apply.click();
	}
	
	public void selectLabelWithOption(String label, String option) {
		Wait.elementToBeClickable(driver, driver.findElement(By.xpath("//label[text()='"+label+"']")), 40);
		testutil.jsclick(driver.findElement(By.xpath("//label[text()='"+label+"']")),driver);
//		driver.findElement(By.xpath("//label[text()='"+label+"']")).click();
		Wait.untilPageLoadComplete(driver);
		testutil.jsclick(driver.findElement(By.xpath("//*[text()='"+option+"']")),driver);
	}
}