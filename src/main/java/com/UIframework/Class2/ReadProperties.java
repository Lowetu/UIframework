package com.UIframework.Class2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
//		/**
//		 * method1
//		 * 第一种方法读取，local.properties文件需要放置在project的根目录下
//		 */
//		Properties p = new Properties();
//		p.load(new FileInputStream("local.properties"));
//		System.out.println(p.toString());
//		String name = p.getProperty("name");
//		System.out.println(name);
		
		/**
		 * method2
		 * 第二种方法读取，local.properties文件需要放置在与读取类（ReadProperties.class）的包同级的包下
		 */
		InputStream in = ReadProperties.class.getClassLoader().getResourceAsStream("local.properties");
		Properties p = new Properties();
		p.load(in);
		String age = p.getProperty("age").trim();//去掉左右空格
		System.out.println(age);
		
	}
	

}
