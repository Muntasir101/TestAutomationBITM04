package com.TestNGDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMLogin extends BaseTestNGClass{

	
	@Test(description="Login test with valid Data")
	public static void TC_001_ValidLoginTest() throws InterruptedException
	{
		launchFirefox();
		openTestHomePage();
		ValidLogin();
		closeBrowser();
		
	}
	
	@Test(description="Login test with Invalid Data")
	private void TC_002_InValidLoginTest() throws InterruptedException
	{
		launchFirefox();
		openTestHomePage();
		InValidLogin();
		closeBrowser();
		
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
		try {
			Screenshot(driver,"ValidLoginPass");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void InValidLogin() throws InterruptedException
	{
		WebElement Username=driver.findElement(By.id("txtUsername"));
		WebElement Password=driver.findElement(By.id("txtPassword"));
		WebElement LoginBtn=driver.findElement(By.id("btnLogin"));

		Username.sendKeys("Admin");
		Password.sendKeys("admin123223");
		LoginBtn.click();

		String ExpectedText="Forgot your password?";
		String ActualText=driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).getText();

		Assert.assertEquals(ExpectedText, ActualText);
		try {
			Screenshot(driver,"InValidLoginPass");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}

