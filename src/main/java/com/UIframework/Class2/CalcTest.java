package com.UIframework.Class2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class CalcTest {
  @Test
  public void f1() {
	  System.setProperty("org.uncommons.reportng.escape-output", "false");
	  Reporter.log("<span style=\"color:#16A05D\"><H1>f1测试开始</H1></span>");
	  Assert.assertFalse(true,"f1");
  }
  
  @Test
  public void f2() {
	  Reporter.log("f2测试开始...");
	  Assert.assertFalse(false,"f2");
  }
  
}
