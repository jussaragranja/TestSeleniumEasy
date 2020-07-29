package br.com.project.selenium.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * @author jussaragranja
 * Class Base for Execution
 */

public abstract class BaseTest {
	
	public WebDriver driver;
	
	/*
	 * Get name of the next test run
	 */
	@Rule
	public TestName nameTest = new TestName();
	
	
	/*
	 * Close driver
	 */
	@After
	public void after(){
		if(driver != null){
			driver.quit();
		}
		driver = null;
	}
	
	
	/*
	 * Instance of a new driver
	 */
	@Before
	public void before() throws MalformedURLException{
		driver = DriverTest.getDriver();
	}
}
