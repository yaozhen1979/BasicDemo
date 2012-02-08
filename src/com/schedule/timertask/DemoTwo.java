package com.schedule.timertask;

import java.util.Date;
import java.util.Timer;

public class DemoTwo {

	/**
	 * 要求Timer物件，每隔多少時間就執行一次TimerTask的run()方法， 例如一秒後開始執行TimerTask，而後每隔3秒執行一次。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.schedule(new DateTask(), 1000, 3000);
		System.out.println("現在時間：：" + new Date());

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			
		}

		timer.cancel();
	}

}
