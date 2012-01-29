package com.tw.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoTwo {
	
	private static final Logger logger = LoggerFactory
		.getLogger(DemoTwo.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		String filename = "dirA" + File.separator +  "test.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));			
			String line;	
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				sb.append(line + "\n");
			}				
			in.close();
			
			logger.info("\n" + sb.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
		//File f = new File("dirA","test.txt");
		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter(filename));
			out.print(sb.toString());
			out.println("test again.");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
