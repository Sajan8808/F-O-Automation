package com.sat.testUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Testutil {
	private WebDriver driver;
	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 40;
	public static long EXPLICIT_WAIT = 5000;
	public static String currentTime = "";

	public Testutil(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToFrame(String frame) {
		driver.switchTo().frame(frame);
	}

	public void jsclick(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele);
	}

	public void selectOptionInDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {
		boolean isFound = false;
		for (WebElement option : dropDownOptions) {
			if (option.getText().equals(optionToBeSelected)) {
				option.click();
				isFound = true;
				break;
			}
		}
		if (!isFound)
			System.out.println("No matching option found.");
	}

	public void selectOptionUsingValue(WebDriver driver, String valueToBeSelected) {
		String customLoc = "//option[text()='" + valueToBeSelected + "']";
		driver.findElement(By.xpath(customLoc)).click();
	}
	
	public void selectByVisibleText(WebDriver driver, WebElement element,String valueByText) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			//js2.executeScript("windows.scrollBy(0,500), ");
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			Select s = new Select(element);
			s.selectByVisibleText(valueByText);
	}
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		} catch (Exception e) {
			Log.debug("until, Exception Error message : " + e);
		}
	}

	public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
}