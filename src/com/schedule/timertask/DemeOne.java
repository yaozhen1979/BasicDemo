package com.schedule.timertask;

import java.util.Date;
import java.util.Timer;

public class DemeOne {

	/**
	 * Timer物件的schedule()方法接受TimerTask實例， 並可以給它一個毫秒數，表示schedule()方法執行後， 幾毫秒之後執行
	 * TimerTask中的run()方法， Timer物件在啟動排程後，如果要停止，則要執行cancel()方法。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.schedule(new DateTask(), 5000);
		System.out.println("現在時間：" + new Date());

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
		}

		timer.cancel();
	}

}
