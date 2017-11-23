/**
 * 
 */
package com.UIframework.Class2;

import static org.testng.Assert.expectThrows;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Lowetu-pc
 * @date 2017年11月19日
 * @TODO
 */
public class Forlog4j2 {

	/**
	 * @param args
	 */
	static Logger log = LogManager.getLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=3;
		int c;
		try {
			c=b/a;
		}catch (Exception e){
			log.error("0不能做分母");
			
		}
		log.warn("警告"); 
		log.info("info111");
		log.debug("debug");
		
		
	}

}
