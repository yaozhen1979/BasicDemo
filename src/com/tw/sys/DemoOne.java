package com.tw.sys;

import java.util.Enumeration;
import java.util.Properties;

public class DemoOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties sysprops = System.getProperties();

		for (Enumeration e = sysprops.propertyNames(); e.hasMoreElements();) {
			String propertyName = (String)e.nextElement();
			System.out.println(propertyName + "="
					+ System.getProperty(propertyName));
		}

		// sysprops.list(System.out);
	}

}
