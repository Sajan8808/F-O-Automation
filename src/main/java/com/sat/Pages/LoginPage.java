package com.sat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.sat.testUtil.Wait;

public class LoginPage {

	private WebDriver driver;
	Wait wait = new Wait();
	//private By emailid = By.xpath("//input[@type='email']");
	@FindBy(xpath="//input[@type='email']")
	WebElement emailid;
	public By publishedApps = By.xpath("//div/h2[text()='Published Apps']");
	private By Next = By.id("idSIButton9");
	private By password = By.id("i0118");
	private By singin = By.id("idSIButton9");
	private By yes = By.id("idSIButton9"); 
	//private By app = By.xpath("//div[@title='Customer Service Hub']");
		
	public LoginPage(WebDriver rdriver)
	{
		this.driver=rdriver;
	}
	
	public String GetLoginPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement GetApp(String title) throws InterruptedException {

	WebElement ele= driver.findElement(By.xpath("//div[@title='"+title+"']"));
	return ele;
//	 driver.findElement(By.xpath("//div[@title='"+title+"']")).click();
	 //return new AccountPage(driver);
				
	}
	
		
	public void enteruserid(String userid) throws InterruptedException
	{
		//driver.findElement(emailid).sendKeys(userid);
		emailid.sendKeys(userid);
		
		Thread.sleep(2000);
		
	}
	
	public void clickonNext()
	{
		driver.findElement(Next).click();
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickonsignin()
	{
		driver.findElement(singin).click();
	}

	public void clickonYes()
	{
		driver.findElement(yes).click();
	}
	
	
}
