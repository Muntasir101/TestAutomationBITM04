package com.DemoOpencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;



public class LogoutTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		
		launchFirefox();
		RegisterTest.openTestHomePage();
		RegisterTest.openTestRegisterPage();
		RegisterTest.register_valid_TC_01();
		Thread.sleep(3000);
		logout_TC();
		Thread.sleep(3000);
		closeBrowser();
		
	}
	
	public static void logout_TC() {
		
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myAccount.click();
		
		WebElement Logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		Logout.click();
		
	}

}
