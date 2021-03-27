package com.Browser;

import org.openqa.selenium.firefox.FirefoxOptions;

import com.Base.BaseClass;

public class InsecureSite extends BaseClass {

	public static void main(String[] args) {
		launchFirefox();
		openCacert();
		closeBrowser();
	}
	
	public static void openCacert()
	{
		
		FirefoxOptions obj=new FirefoxOptions();
		obj.setAcceptInsecureCerts(true);
		
		driver.get("https://cacert.org/");

		
	}

}
