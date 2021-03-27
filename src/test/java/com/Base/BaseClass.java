package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	/*
	 * Firefox launch
	 * Chrome launch
	 * Browser Close
	 */
	
	public static WebDriver driver;
	
	public static void launchFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	public static void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		
		else {
			System.out.println("No browser found.Nothing to close.");
		}
	}

}
