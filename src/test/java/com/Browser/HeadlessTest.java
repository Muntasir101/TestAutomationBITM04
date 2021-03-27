package com.Browser;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.Base.BaseClass;
import com.DemoOpencart.Login;
import com.DemoOpencart.LogoutTest;

public class HeadlessTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
		setHeadless();
		
		Login.openTestHomePage();
		Login.openLoginPage();
		Login.login_inValid_TC_01();
		Login.login_Valid_TC_02();
		LogoutTest.logout_TC();

		closeBrowser();
	}
	
	public static void setHeadless() {
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 4\\Tools\\geckodriver.exe");
		FirefoxOptions option=new FirefoxOptions();		
		option.setHeadless(true);		
		driver=new FirefoxDriver(option);	
	}

}
