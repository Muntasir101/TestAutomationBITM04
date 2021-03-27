package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestNG {
	
  @Test(priority=3)
  public void testMethod1() {
	  System.out.println("Hello TestNG");
	  Assert.assertEquals("Hello", "Hello 2");
  }
  
  @Test(priority=2)
  public void testMethod2() {
	  System.out.println("Hello TestNG 2");
	  
  }
   
  @Test(priority=1)
  public void testMethod3() {
	  System.out.println("Hello TestNG 3");
	  
  }
}
