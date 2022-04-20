package com.sat.AppHooks;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sat.testbase.TestBase;

//import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private TestBase driverFactory;
	private WebDriver driver;
	Properties prop;
	
	@Before(order=0)
	public void launchbrowser() throws InterruptedException
	{
		//String browsername= prop.getProperty("browser");
		driverFactory=new TestBase();
	   driverFactory.initialization();
		
	}

	@After(order=0)
	public void QuitBrowser() 
	{
       //TestBase.driver.quit();
	}
	
	@After(order=1)
	public void teardown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String screenshotname=scenario.getName().replaceAll(" ","_");
			byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotname);
			}
	}

}
