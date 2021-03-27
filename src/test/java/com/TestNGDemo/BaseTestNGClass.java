package com.TestNGDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTestNGClass {
	
	public static WebDriver driver;
	
	
	public static void launchFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
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
	
	public static void Screenshot(WebDriver driver, String name) throws IOException {		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+ "//Screenshots//"+ name + ".png");
		FileUtils.copyFile(source, target);	
	}
}