package com.SeleniumBasic;

import org.openqa.selenium.Dimension;

import com.Base.BaseClass;

public class BrowserSize extends BaseClass {

	public static void main(String[] args) {

		//launchChrome();
		launchFirefox();
		getBrowserSize();
		setBrowserSize();
		openTestURL();
		closeBrowser();
	}
	
	public static void openTestURL()
	{
		driver.get("https://google.com");
	}
	
	public static void setBrowserSize()
	{
		driver.manage().window().setSize(new Dimension(700,400));
	}
	
	public static void getBrowserSize()
	{
		Dimension bSize=driver.manage().window().getSize();
		int Width=bSize.getWidth();
		int Height=bSize.getHeight();
		System.out.println("Width: "+Width +" "+"Height: "+Height); 

	}
}
