package com.UIframework.TestCase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UIframework.Class1.browserUtils;

public class baiduTest {
	WebDriver driver;
	String url="https://www.baidu.com";
	//数据分离
	@DataProvider(name="searchData")
		public static Object[][] primeNumbers(){
			return new Object[][] {
				{"新梦想软件测试","新梦想软件测试_百度搜索"},
				{"12306","12306_百度搜索"},
				{"selenium","selenium_百度搜索"}
			};
	}
	
  @BeforeMethod
  //打开浏览器，输入请求地址
  public void openBroswer() throws InterruptedException {
	  driver = browserUtils.openUrl(driver, url);
	  browserUtils.wait(3);
  }
  @Test(dataProvider="searchData")//调用数据，进行测试
  //百度搜索
  public void find(String search,String result){
	  browserUtils.search(driver, search);
	  browserUtils.wait(3);
	  assertEquals(driver.getTitle(), result,"网页错误");
  }
  @AfterMethod
  //退出
  public void quit() {
	  browserUtils.quit(driver);
  }
}
