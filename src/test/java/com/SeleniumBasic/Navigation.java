package com.SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.DemoOpencart.Login;
import com.DemoOpencart.RegisterTest;

public class Navigation extends BaseClass {

	public static String Firstname="Mr.John";
	public static String Lastname="Smith";

	public static void main(String[] args) throws InterruptedException {
		
		launchFirefox();
		Login.openTestHomePage();
		RegisterTest.openTestRegisterPage();
		register();
	//	navigationBackForwardTest();
	//	navigationRefresh();
	//	closeBrowser();

	}

	public static void register() {

		// first name
		try {
			WebElement FirstName = driver.findElement(By.name("firstname"));
			FirstName.clear();
			FirstName.sendKeys(Firstname);
		}
		catch(WebDriverException e)
		{
			System.out.println("An exception. First Name not present");
		}
		
		//last name
		try {
			WebElement LastName = driver.findElement(By.name("lastname"));
			LastName.clear();
			LastName.sendKeys(Lastname);
		}
		catch(WebDriverException e)
		{
			System.out.println("An exception.Last Name not present");
		}
		
	
		WebElement Email = driver.findElement(By.name("Lion"));
		WebElement Telephone = driver.findElement(By.name("telephone"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement ConfrimPassword = driver.findElement(By.name("confirm"));
		WebElement CheckBox = driver.findElement(By.name("agree"));

		Email.clear();
		Email.sendKeys("selenium507@gmail.com");

		Telephone.clear();
		Telephone.sendKeys("0123456789");

		Password.clear();
		Password.sendKeys("abc123");

		ConfrimPassword.clear();
		ConfrimPassword.sendKeys("abc123");

		CheckBox.click();

	}

	public static void navigationBackForwardTest()
	{
		driver.navigate().back();
		driver.navigate().forward();


		//First Name validation
		WebElement FirstNameFiled = driver.findElement(By.name("firstname"));
		//String ExpecetdFname="Mr.John";
		String ActualFname=FirstNameFiled.getAttribute("value");

		if(ActualFname.contains(Firstname))
		{
			System.out.println("navigate back and forward Test passed for first name");
		}
		else {
			System.out.println("navigate back and forward Test failed for first name.");
		}

		//Last Name validation
		WebElement LastNameFiled = driver.findElement(By.name("lastname"));
		//String ExpecetdLname="Smith";
		String ActualLname=LastNameFiled.getAttribute("value");

		if(ActualLname.contains(Lastname))
		{
			System.out.println("navigate back and forward Test passed for last name");
		}
		else {
			System.out.println("navigate back and forward Test failed for last name.");
		}
	}

	public static void navigationRefresh()
	{
		driver.navigate().refresh();

		// First name
		WebElement FirstNameField = driver.findElement(By.name("firstname"));
		//String ExpecetdFname="Mr.John";
		String ActualFname=FirstNameField.getAttribute("value");

		if(!ActualFname.equals(Firstname))
		{
			System.out.println("page Refresh Test passed for first name");
		}
		else {
			System.out.println("page Refresh Test failed for first name.");
		}

		//last Name
		WebElement LastNameField = driver.findElement(By.name("lastname"));
		//String ExpecetdLname="Smith";
		String ActualLname=LastNameField.getAttribute("value");

		if(!ActualLname.contains(Lastname))
		{
			System.out.println("Page refresh Test passed for last name");
		}
		else {
			System.out.println("Page refresh Test failed for last name.");
		}
	}

}
