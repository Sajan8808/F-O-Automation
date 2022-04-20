package com.sat.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
   Wait wait = new Wait();
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/sat/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() throws InterruptedException{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
//			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/com.sat.Drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
//			ChromeOptions chromeOptions = new ChromeOptions();
//	        chromeOptions.addArguments("disable-infobars");
//	        chromeOptions.addArguments("start-maximized");
			driver = new ChromeDriver(); 
//			driver.get("chrome://settings/clearBrowserData");
//	        Thread.sleep(5000);
//	        driver.switchTo().activeElement();
//	        driver.findElement(By.id("clearBrowsingDataConfirm")).click();
//	        Thread.sleep(5000);
		
		}
		//e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		driver = e_driver;


	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	Thread.sleep(3000);
		
}
	
	public void UrlLaunch()
	{
		
	 driver.get(prop.getProperty("url"));
	 wait.untilPageLoadComplete(driver);
	}
	
	 public void clearCache() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C://WebDrivers/chromedriver.exe");
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("disable-infobars");
	        chromeOptions.addArguments("start-maximized");
	        driver = new ChromeDriver(chromeOptions);
	        driver.get("chrome://settings/passwords");
	        Thread.sleep(3000);
	        driver.switchTo().activeElement();
	        driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();
	        Thread.sleep(5000);
	    }

}
