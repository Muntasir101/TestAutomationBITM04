package com.DemoOpencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class Login extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchFirefox();
		openTestHomePage();
		openLoginPage();
		login_inValid_TC_01();
		login_Valid_TC_02();
		LogoutTest.logout_TC();
		closeBrowser();

	}
	
	public static void openTestHomePage() throws InterruptedException
	{
		driver.get("https://demo.opencart.com/");
		Thread.sleep(3000);
	}
	
	public static void openLoginPage() throws InterruptedException
	{
		WebElement Account= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));		
		Account.click();
		
		WebElement openlogin= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		openlogin.click();
		Thread.sleep(2000);
	}
	
	public static void login_inValid_TC_01() throws InterruptedException
	{
		WebElement Username=driver.findElement(By.name("email"));
		WebElement Password=driver.findElement(By.name("password"));	
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		//Login Action
		Username.clear();
		Username.sendKeys("mail22wew@mail.com");
		Thread.sleep(2000);
		Password.clear();
		Password.sendKeys("123456");
		Thread.sleep(3000);
		LoginBtn.click();
		Thread.sleep(3000);
		
		String ExpectedTitle="Account Login";	
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test pass for invalid login.");
		}
		
		else {
			System.out.println("Test failed TC_01");
		}
				
	}
	
	public static void login_Valid_TC_02() throws InterruptedException
	{
		WebElement Username=driver.findElement(By.name("email"));
		WebElement Password=driver.findElement(By.name("password"));	
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		//Login Action
		Username.clear();
		Username.sendKeys("mail22@mail.com");
		Thread.sleep(2000);
		Password.clear();
		Password.sendKeys("123456");
		Thread.sleep(3000);
		LoginBtn.click();
		Thread.sleep(3000);
		
		String ExpectedTitle="My Account";	
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test pass valid login");
		}
		
		else {
			System.out.println("Test failed TC_02");
		}
				
	}


}
