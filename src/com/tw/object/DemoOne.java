package com.tw.object;

public class DemoOne {
	

	public int i;
	public int j;
		
	public DemoOne(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOne one = new DemoOne(2, 3);
		System.out.println(one.i);
		System.out.println(one.j);
	}

}
