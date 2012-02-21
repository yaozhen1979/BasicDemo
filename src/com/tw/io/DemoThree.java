package com.tw.io;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.Reader;
import java.io.StringReader;

/**
 * 將資料存入陣列與從陣列取出
 * @author HOME
 *
 */
public class DemoThree {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(baos);
		out.writeUTF("hello world !!!");
		out.writeDouble(Math.E);
		byte[] data = baos.toByteArray();
		out.close();
		System.out.println(data);
		
		Reader in = new StringReader("now is the time.");
		int c;
		while ((c = in.read()) != -1 ) {
			System.out.print((char)c);
		}
		
	}
}
