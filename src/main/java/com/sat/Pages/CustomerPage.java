package com.sat.Pages;

import java.util.List;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	public WebDriver driver;
	@FindBy(xpath = "//div[@title='Blocks']")
	WebElement blocks;
	@FindBy(xpath = "//div[@title='Neighborhoods']")
	WebElement neighborhoods;
	@FindBy(xpath = "//div[@title='Schemes']")
	WebElement schemes;
	@FindBy(xpath = "//div[@title='Contacts']")
	WebElement contact;
	@FindBy(xpath = "//div[@title='Data Protection']")
	WebElement dataprotection;
	@FindBy(xpath = "//div[@title='Tenancies']")
	WebElement tenancies;
	@FindBy(xpath = "//div[@title='Knowledge Articles']")
	WebElement knowledgeArticles;

	@FindBy(xpath = "//div[@title='Accounts']")
	WebElement account;
	@FindBy(xpath = "//span/i[contains(@class,'Button-menuIcon')]") // *[text()='Accounts Being Followed']")
	WebElement dropdown;
	@FindBy(xpath = "//*[text()='All Accounts']")
	WebElement allaccount;
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchtextbox;
	@FindBy(xpath = "//span[contains(@class,'Cancel')]")
	WebElement cancelSearch;

	@FindBy(xpath = "//button[@title='Start search']") // "//button[@id='quickFind_button_1']")
	WebElement searchicon;
	@FindBy(xpath = "//button[@id='searchLauncher-button']") // "//button[@id='quickFind_button_1']")
	WebElement globalSearch;
	@FindBy(xpath="//div[@aria-label='Select a queue filter']")
	WebElement queueFilterDropDown;
	
	public WebElement selectQueueFilterDropdown() {
		return queueFilterDropDown;
		
	}
	public boolean isElementPresent(By by) {
		List<WebElement> ele = driver.findElements(by);
		if (ele.isEmpty())
			return false;
		else
			return true;

	}

	public CustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void localSearch(DataTable datatable) {
		int i, j;
		List<List<String>> data = datatable.cells();

			for (i = 0; i < 1; i++) {
				for (j = 0; j < 3; j++) {
					
					searchtextbox.sendKeys(data.get(i).get(j).trim(), Keys.ENTER);
					Wait.untilPageLoadComplete(TestBase.driver);
							try {	
							if (data.get(i).get(j).trim().contains("*")) 
							
								Wait.waitUntilElementVisible(TestBase.driver, searchText(data.get(i).get(j).trim().replace("*", "")));
							else
								Wait.waitUntilElementVisible(TestBase.driver, searchText(data.get(i).get(j).trim()));
							}
							catch (Exception e) {
								System.out.println("Exception :" + e);
							}
					Wait.untilPageLoadComplete(TestBase.driver);
					verifysearchresult(data.get(i).get(j).trim());
					cancelSearch.click();
					Wait.untilPageLoadComplete(TestBase.driver);
				}}}
					
		public void verifyleftsidepane() throws InterruptedException {
		account.click();
		Thread.sleep(2000);
		
		Wait.untilPageLoadComplete(TestBase.driver);
		blocks.click();
		isElementPresent(By.xpath("//div[@title='Blocks']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);

		neighborhoods.click();
		isElementPresent(By.xpath("//div[@title='Neighborhoods']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);
		schemes.click();
		isElementPresent(By.xpath("//div[@title='Schemes']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);
		contact.click();
		isElementPresent(By.xpath("//div[@title='Contacts']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);
		dataprotection.click();
		isElementPresent(By.xpath("//div[@title='Data Protection']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);
		tenancies.click();
		isElementPresent(By.xpath("//div[@title='Tenancies']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);

		knowledgeArticles.click();
		isElementPresent(By.xpath("//div[@title='Knowledge Articles']"));
		Wait.untilPageLoadComplete(TestBase.driver);
		Thread.sleep(2000);
	}

	public void entity(String tab) {
		driver.findElement(By.xpath("//div[@title='" + tab + "']")).click();
	}

	public void clickonDropdownList() {
		dropdown.click();
	}

	public void clickonAllAccount(String option) {
		Wait.elementToBeClickable(TestBase.driver, driver.findElement(By.xpath("//*[text()='" + option + "']")), 20);
		driver.findElement(By.xpath("//*[text()='" + option + "']")).click();
	}

	public void Entertextinsearch(String SearchText) throws InterruptedException {
		
		String[] searchtexts = SearchText.split(";");
		for (int i = 0; i < searchtexts.length; i++) {
			searchtextbox.sendKeys(searchtexts[i].trim(), Keys.ENTER);
			Wait.untilPageLoadComplete(TestBase.driver);
			try {
			if (searchtexts[i].trim().contains("*"))
				Wait.waitUntilElementVisible(TestBase.driver, searchText(searchtexts[i].replace("*", "").trim()));
			else
				Wait.waitUntilElementVisible(TestBase.driver, searchText(searchtexts[i].trim()));
			}catch(Exception e)
			{
				System.out.println("Exception" +e+ "has occurred");
			}
			Wait.untilPageLoadComplete(TestBase.driver);
			verifysearchresult(searchtexts[i].trim());
			cancelSearch.click();
			Wait.untilPageLoadComplete(TestBase.driver);
		}
		

	}

	public void enterTextInGlobalSearch(String text) throws InterruptedException {
		String[] searchtexts = text.split(";");
		for (int i = 0; i < searchtexts.length; i++) {
			globalSearch.click();
			Wait.untilPageLoadComplete(TestBase.driver);
			searchtextbox.sendKeys(searchtexts[i].trim(), Keys.ENTER);
			Wait.waitUntilElementVisible(TestBase.driver, searchText(searchtexts[i].trim().replace("*", "")));
			Wait.untilPageLoadComplete(TestBase.driver);
			verifysearchresult(searchtexts[i].trim());
			Wait.untilPageLoadComplete(TestBase.driver);
		}

	}

	public void clickonsearchicon() {
		searchicon.click();
	}

	public WebElement searchText(String text) {

		return driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
	}

	
	public void verifysearchresult(String searchtext) {
		By ele;
		if(searchtext.contains("*"))
		 ele = By.xpath("//*[contains(text(),'" + searchtext.replace("*", "") + "')]");
		else
			ele = By.xpath("//*[contains(text(),'" + searchtext+ "')]");
		boolean present = isElementPresent(ele);

		if (present) {
//			Assert.assertTrue(true);
			System.out.println("Search result contains " + searchtext);
		} else {
			System.out.println("Search result not contains " + searchtext);
		}

	}
	public void selectQueueFilter(String filter) {
		WebElement fil = driver.findElement(By.xpath("//div[@aria-label='Select a queue filter']"));
		fil.click();
		driver.findElement(By.xpath("(//*[text()='"+filter+"'])[last()]")).click();
	}

}
