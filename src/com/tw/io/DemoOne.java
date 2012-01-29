package com.tw.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoOne {
	
	private static final Logger logger = LoggerFactory
	.getLogger(DemoOne.class);

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.info("Hello {}", "TestLogback");
		
		String user_home= System.getProperty("user.home");
		
		logger.info(user_home);
		
		File f = new File("dirA","test.txt");
		
		try {
			
			if(f.exists()){
				
				PrintWriter out = new PrintWriter(new FileWriter(f));								
				out.println("input test again again again.");
				out.close();
				
			}else{
				f.getParentFile().mkdir();
				f.createNewFile();
				PrintWriter out = new PrintWriter(new FileWriter(f));
				out.println("input test.");
				out.close();
			}
									
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
