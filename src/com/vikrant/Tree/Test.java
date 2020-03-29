package com.vikrant.Tree;

import java.util.Scanner;

public class Test implements Runnable {

	private int x;
	private int y;
	public static void main(String[] args) {

		Test test = new Test();
		(new Thread(test)).start();
		(new Thread(test)).start();

	}
	
	public static void method(){
		System.out.println("null");
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(;;)
		{
			x++;
			y++;
			System.out.println(x);
			System.out.println(y);

		}
	}
}
