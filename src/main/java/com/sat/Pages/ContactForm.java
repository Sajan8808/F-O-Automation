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

public class ContactForm {

	public WebDriver driver;
	Testutil testutil = new Testutil(TestBase.driver);

	@FindBy(xpath = "//ul[@aria-label='Contact Form']/li ")
	WebElement alltab;
	@FindBy(xpath = "//div[@aria-label='Summary']/section")
	WebElement allsection;

	@FindBy(xpath = "//li[text()='Summary']")
	WebElement summary;
	@FindBy(xpath = "//li[text()='Correspondence']")
	WebElement correspondence;
	@FindBy(xpath = "//*[text()='New Emergency Contact']")
	WebElement newEmergencyContact;
	@FindBy(xpath = "//input[@aria-label='Name']")
	WebElement ContactName;

	@FindBy(xpath = "//*[text()='New Contact']")
	WebElement newContact;
	@FindBy(xpath = "//span[text()='Discard changes']")
	WebElement discardChanges;
	@FindBy(xpath = "//span[text()='Save and continue']")
	WebElement saveAndContinue;
	@FindBy(xpath = "//*[text()='Save & Close']")
	WebElement saveAndClose;
	@FindBy(xpath = "//*[text()='Save']")
	WebElement save;
	@FindBy(xpath = "//button[@aria-label='Refresh']")
	WebElement refresh;
	@FindBy(xpath = "//button[@title='Go back']")
	WebElement goBack;

	@FindBy(xpath = "//li[text()='Data Protection']")
	WebElement dataprotection;
	@FindBy(xpath = "//*[text()='DATA PROTECTION DETAILS']")
	WebElement newdataprotDetail;
	@FindBy(xpath = "//*[text()='New Data Protection']")
	WebElement addNewdataprot;

	@FindBy(xpath = "//li[text()='Tenancies']")
	WebElement tenancies;
	@FindBy(xpath = "//*[text()='Active Tenancies']")
	WebElement activeTenanciesDropDown;
	@FindBy(xpath = "//a[@title='Miss J Shepherd']")
	WebElement openTenanciesForm;

	@FindBy(xpath = "//li[text()='Rent Accounts']")
	WebElement rentaccount;
	@FindBy(xpath = "//a[@title='Flat- Flat 25 Odiham Drive, Newbury ,RG14 1GA']")
	WebElement openRentAccountForm;

	@FindBy(xpath = "//li[text()='Conflicts Tab']")
	WebElement conflictstab;
	@FindBy(xpath = "//li[text()='Related']")
	WebElement related;
	@FindBy(xpath = "//div[text()='Flat 25 Odiham Drive, Speen, Newbury, Berkshire, RG14 1GA']")
	WebElement accountHperlink;
	@FindBy(xpath = "")
	WebElement documentUpload;
	@FindBy(xpath = "//button[@title='Create a timeline record.']")
	WebElement addTimeLine;
	@FindBy(xpath = "//span[contains(@class,'MoreVertical')]")
	WebElement verticalItem;
	public WebElement details()
	{
		return driver.findElement(By.xpath("//h2[@title='DETAILS']"));	
	}
	private By responseTime = By.xpath("//select[@aria-label='Response Time']");
	
	
	private By taskcategory = By.xpath("//select[@aria-label='Task Category']");
	
	public WebElement taskCategory()
	{
		return driver.findElement(taskcategory);	
	}
	private By taskSubCategory = By.xpath("//select[@aria-label='Task Sub-Category']");

	public WebElement taskSubCategory()
	{
		return driver.findElement(taskSubCategory);	
	}
	private By description = By.xpath("//textarea[@aria-label='Description']");
	
	public void enterDescription() {
		driver.findElement(description).click();
		driver.findElement(description).sendKeys("text");
		List<WebElement> findResponsetime = driver.findElements(responseTime);
		if(!findResponsetime.isEmpty())
		{
			driver.findElement(responseTime).click();
			testutil.selectByVisibleText(driver, driver.findElement(responseTime), "Routine (5 Working Days)");
		}
			
	}
	/* Locked unlocked fields */
	public void lockedUnlocked(DataTable datatable) {

		List<List<String>> actual = datatable.cells();
		System.out.println("Size :"+datatable.asList().size());
		try {
				for (int j = 1; j <= datatable.asList().size(); j++) {
					List<WebElement> field = driver.findElements(By.xpath("//label[text()='"+actual.get(0).get(j)+"']/ancestor::div[contains(@id,'FieldSectionItemContainer')]"));
					if(!field.isEmpty())
					{
						// Checking for locked fields
						List<WebElement> locked = driver.findElements(By.xpath("//label[text()='"+actual.get(0).get(j)+"']/ancestor::div[contains(@id,'FieldSectionItemContainer')]/div/div[contains(@id,'locked')]"));
						if(!locked.isEmpty())
							System.out.println("Locked field :"+actual.get(0).get(j));
						else
							System.out.println("Unlocked field :"+actual.get(0).get(j));
					}
				}
			
		} catch (Exception e) {
			System.out.println("Exception :" + e + " has occurered");
		}
	}

	/*AutoRouting*/
	
	public void addTimeLineRecord()
	{
		Wait.elementToBeClickable(TestBase.driver, addTimeLine, 30);
		//testutil.jsclick(addTimeLine, TestBase.driver);
		addTimeLine.click();
		Wait.untilPageLoadComplete(TestBase.driver);
	}
	public WebElement timeLineRecord(String record)
	{
		WebElement timeLine = driver.findElement(By.xpath("//div[text()='"+record+"']"));
		return timeLine;
	}
	public ContactForm(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void selectTaskByContact(String contact)
	{
		WebElement record = driver.findElement(By.xpath("(//*[contains(text(),'"+contact+"')])[1]/parent::a"));
		testutil.jsclick(record, TestBase.driver);
	}
	
	public String enteredTime(String contact)
	{
		WebElement record = driver.findElement(By.xpath("(//*[contains(text(),'"+contact+"')])[1]//ancestor::div[@col-id='title']/following-sibling::div[@col-id='enteredon']//label"));
		return record.getText();
	}
	public void clickOnSave() throws InterruptedException {
		testutil.jsclick(save, TestBase.driver);
		Thread.sleep(2000);
		Wait.untilPageLoadComplete(TestBase.driver);
	}

	public void clickOnSaveAndClose() throws InterruptedException {
		Wait.untilPageLoadComplete(TestBase.driver);
		testutil.jsclick(saveAndClose, TestBase.driver);
		Thread.sleep(2000);
		Wait.untilPageLoadComplete(TestBase.driver);
	}

	public void clickOnRefresh() throws InterruptedException {
		testutil.jsclick(refresh, TestBase.driver);
		Wait.untilPageLoadComplete(TestBase.driver);
	}
	public void clickOnBack() throws InterruptedException {
		testutil.jsclick(goBack, TestBase.driver);
		Thread.sleep(2000);
		Wait.untilPageLoadComplete(TestBase.driver);
	}

	public void clickOnAccountHyperlink() throws InterruptedException, AWTException {
		Actions at = new Actions(TestBase.driver);
		// at.sendKeys(Keys.PAGE_DOWN).build().perform();
		// at.moveToElement(accountHperlink).click().build().perform();
		at.moveToElement(accountHperlink, 550, 320).click().build().perform();
		// at.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();;
		Thread.sleep(3000);

		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
//		Thread.sleep(2000);
		// JavascriptExecutor js =((JavascriptExecutor)TestBase.driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", accountHperlink);
		// Thread.sleep(2000);
		// js.executeScript("document.querySelector('.tab-section.').scrollDown=800;");
		// js.executeScript("document.querySelector('div[title='23 Odiham Drive, Speen,
		// Newbury, Berkshire, RG14 1GA']').scrollTop=1000;");
		// js.executeScript("document.querySelector('div[text()='Flat 25 Odiham Drive,
		// Speen, Newbury, Berkshire, RG14 1GA']').scrollTop=1000;");
//		Thread.sleep(2000);
		/*
		 * long height = (long)(js.executeScript("return document.body.scrollHeight"));
		 * 
		 * while(true) { long currentheight =
		 * (long)(js.executeScript("window.scrollTo(0,document.body.scrollHeight)"));
		 * Thread.sleep(2000); if(height == currentheight) { break; } height
		 * =currentheight; }
		 */
		// Thread.sleep(2000);
//	    js.executeScript("window.scrollTo(0,1000)");
//	    Thread.sleep(2000);
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	      Thread.sleep(2000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(2000);
//		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(2000);
		// testutil.jsclick(accountHperlink, TestBase.driver);
		// accountHperlink.click();
//		Thread.sleep(5000);
//		Wait.untilPageLoadComplete(TestBase.driver);
	}

	public void openForm(String text) throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='" + text + "']")).click();
		Thread.sleep(2000);
		Wait.untilPageLoadComplete(TestBase.driver);

	}

	public void filterOfTimeline() throws InterruptedException {
		// clicking on filter icon
		driver.findElement(By.xpath("//button[@title='No filter applied. Select to open or close filter pane.']"))
				.click();
		Thread.sleep(2000);
		// Selecting Activites checkbox
		driver.findElement(By.xpath("//label[text()='Record type']")).click();
		driver.findElement(By.xpath("//span[text()='Activities (5)']")).click();
		Thread.sleep(2000);
		// Selecting Phone Call checkbox
		driver.findElement(By.xpath("//label[text()='Activity type']")).click();
		driver.findElement(By.xpath("//span[text()='Phone Call (1)']")).click();
		Thread.sleep(2000);
		// closing on filter icon
		driver.findElement(By.xpath("//button[@title='Close filters']")).click();
		Thread.sleep(2000);
		driver.getPageSource().contains("Phone Call from");
	}

// Data Protection Tab	

	public void verifyheading(String text) {
		System.out.println(newdataprotDetail.getText());
		Assert.assertEquals(newdataprotDetail.getText(), text, "Element is not Displayed");
	}

	public void clickOnNewDataProtection() throws InterruptedException {
		Wait.untilPageLoadComplete(TestBase.driver);
		addNewdataprot.click();
		Thread.sleep(2000);
		Wait.untilPageLoadComplete(TestBase.driver);
		// discardChanges.click();
		Thread.sleep(2000);
		Wait.untilPageLoadComplete(TestBase.driver);
		try {
			for (int i = 0; i < 5; i++) {
				// Clicking on text of three ---
				driver.findElement(By.xpath("//span[text()='---']")).click();
				Wait.untilPageLoadComplete(TestBase.driver);
				// Clicking on drop down icon
				driver.findElement(By.xpath("(//span[1][@class='wj-glyph-down'])[2]")).click();
				Wait.untilPageLoadComplete(TestBase.driver);
				// Selecting drop down value
				driver.findElement(By.xpath("//div[text()='Pass']")).click();
				Wait.untilPageLoadComplete(TestBase.driver);
				// Clicking on save icon
			}
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			Wait.untilPageLoadComplete(TestBase.driver);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void verifySectiOnOfTab(DataTable datatable) {
		List<List<String>> actual = datatable.cells();
		List<WebElement> element = driver
				.findElements(By.xpath("//div[@aria-label='" + actual.get(0).get(0) + "']/section//h2"));
		try {
			for (int i = 0; i < 1; i++) {
				for (int j = 1; j < element.size()-1; j++) {
					System.out.println(element.get(j - 1).getText());
					Assert.assertEquals(actual.get(i).get(j), element.get(j - 1).getText(), "Element is not Displayed");
				}
			}
		} catch (Exception e) {
			System.out.println("EXception :" + e + " has occurered");
		}
	}

	public void Clickoncontactname(String name) throws InterruptedException {
//		Testutil.sendKeys(TestBase.driver, driver.findElement(By.xpath("//input[@type='text']")), 20, name+",Keys.ENTER");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name, Keys.ENTER);
		Wait.untilPageLoadComplete(TestBase.driver);
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='" + name + "']"))));
		testutil.jsclick(driver.findElement(By.xpath("//a[@title='" + name + "']")), TestBase.driver);
		Wait.untilPageLoadComplete(TestBase.driver);

	}

	public void clickOnTab(String tab) {
		driver.findElement(By.xpath("//li[text()='" + tab + "']")).click();
		Wait.untilPageLoadComplete(TestBase.driver);
	}

	public void clickOnNewEmergencyContact() throws InterruptedException {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		newEmergencyContact.click();
		Thread.sleep(5000);
		Wait.untilPageLoadComplete(TestBase.driver);
		// discardChanges.click();
		ContactName.sendKeys("TestData");
		Wait.untilPageLoadComplete(TestBase.driver);
	}

	/*
	 * public boolean scrollDown(WebElement ele) { boolean flag = false;
	 * while(!flag) { if(!ele.isEnabled()) {
	 * driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	 * } else flag = true; } return flag;
	 * 
	 * }
	 */

	public void clickOnNewContact() throws InterruptedException {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Wait.untilPageLoadComplete(TestBase.driver);
		newContact.click();
		Wait.untilPageLoadComplete(TestBase.driver);
		WebElement contact = driver.findElement(By.xpath("//input[@aria-label='Contact Type, Lookup']"));
		// List<WebElement> list =
		// driver.findElements(By.xpath("//ul[@aria-label='Lookup results']//li"));
		contact.click();
		Wait.untilPageLoadComplete(TestBase.driver);
		contact.sendKeys("Test");
		Actions action = new Actions(TestBase.driver);
		action.keyDown(Keys.SHIFT);
		contact.sendKeys(Keys.ARROW_DOWN);
		action.keyUp(Keys.SHIFT);
		action.click();
		action.build().perform();

		Wait.untilPageLoadComplete(TestBase.driver);
		// for(int i=0;i<list.size();i++)
		// testutil.jsclick(list.get(i),TestBase.driver);

		// testutil.switchToFrame("ClientApiFrame_id-3973");
//		 JavascriptExecutor js = ((JavascriptExecutor)driver);
//		 js.executeScript("arguments[0].click();",contact);
		// contact.sendKeys("Test",Keys.ARROW_DOWN,Keys.ENTER);

//		contact.sendKeys(Keys.ARROW_DOWN);
//		Wait.untilPageLoadComplete(TestBase.driver);
//		contact.sendKeys(Keys.ENTER);
//		Wait.untilPageLoadComplete(TestBase.driver);
////		Thread.sleep(2000);
//		Wait.untilPageLoadComplete(TestBase.driver);
		WebElement LastName = driver.findElement(By.xpath("//input[@aria-label='Last Name']"));
		LastName.sendKeys("TestData");
		Thread.sleep(2000);

	}

	public void verifyalltab(DataTable datatable) {
		List<List<String>> actual = datatable.cells();
		List<WebElement> element = driver.findElements(By.xpath("//ul[@aria-label='Contact Form']/li"));
		try {
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < element.size(); j++) {
					System.out.println(element.get(j).getText());
					Assert.assertEquals(actual.get(i).get(j), element.get(j).getText(), "Element is not Displayed");
				}

			}
		} catch (Exception e) {
			System.out.println("EXception :" + e + " has occurered");
		}

	}
	public String getRouteFromTheCreatedTask() {
		WebElement ele = driver.findElement(By.xpath("//*[text()='Owner']/parent::div/div[1]/a"));
		return ele.getText();
	}
	public void selectVerticalSymbolOfQueues(String item) {
		verticalItem.click();
		Wait.untilPageLoadComplete(TestBase.driver);
		WebElement itm = driver.findElement(By.xpath("//*[text()='"+item+"']"));
		itm.click();
	}

	public String getQueueItemText(String items) {
		WebElement text = driver.findElement(By.xpath("(//*[text()='"+items+"'])[last()]"));
		return text.getText();
	}

}
