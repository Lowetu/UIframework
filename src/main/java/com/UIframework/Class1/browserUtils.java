package com.UIframework.Class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserUtils {
	/**
	 * TODO 1、打开网址
	 * @param driver
	 * @param url
	 */
	public static  WebDriver openUrl(WebDriver driver,String url) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	/**
	 *TODO 2、搜索
	 */
	public static void search(WebDriver driver,String search) {
		driver.findElement(By.cssSelector("#kw")).sendKeys(search);
		driver.findElement(By.cssSelector("#su")).click();
	}
	/**
	 *TODO 3、等待
	 */
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * TODO 4、退出网页
	 */
	public static void quit(WebDriver driver) {
		wait(3);
		driver.quit();
	}
}
