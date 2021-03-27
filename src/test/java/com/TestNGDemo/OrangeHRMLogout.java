package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMLogout extends BaseTestNGClass{

	
	@Test(description="Logout Test")
	public static void TC_001_LogoutTest() throws InterruptedException
	{
		launchFirefox();
		openTestHomePage();
		ValidLogin();
		logout();
		closeBrowser();
		
	}
	
	public static void logout() throws InterruptedException
	  {
		  WebElement Welcome=driver.findElement(By.cssSelector("#welcome"));
		  Thread.sleep(2000);
		  WebElement LogOut=driver.findElement(By.cssSelector("#welcome-menu > ul > li:nth-child(2) > a"));
	  
		  Welcome.click();
		  LogOut.click();
	  }

	public static void openTestHomePage() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
	}
	
	public static void ValidLogin() throws InterruptedException
	{
		WebElement Username=driver.findElement(By.id("txtUsername"));
		WebElement Password=driver.findElement(By.id("txtPassword"));
		WebElement LoginBtn=driver.findElement(By.id("btnLogin"));

		Username.sendKeys("Admin");
		Password.sendKeys("admin123");
		LoginBtn.click();

		String ExpectedText="Dashboard";
		String ActualText=driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).getText();

		Assert.assertEquals(ExpectedText, ActualText);
	}
	

}

