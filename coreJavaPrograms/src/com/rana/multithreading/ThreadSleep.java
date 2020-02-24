/**
 * Q: What sholud we do if we want execute different code for different threads
 */
package com.rana.multithreading;

public class ThreadSleep extends Thread {

	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		t1.start();
		t2.start();
	}
	
	public void run() {
		for(int i=0; i<5; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
