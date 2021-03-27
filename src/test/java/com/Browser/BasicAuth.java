package com.Browser;

import com.Base.BaseClass;

public class BasicAuth extends BaseClass{

	public static void main(String[] args) {
		launchFirefox();
		
		basicAuth();
		closeBrowser();

	}
	
	public static void basicAuth() {

		// Formula --> protocols://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println(driver.getTitle());
			
	}

}
