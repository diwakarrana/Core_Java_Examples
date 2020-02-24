/**
 * implementation of threads by extending predefine class thread
 */
package com.rana.multithreading;

public class FirstThread extends Thread {
	
	public void run() {
		System.out.println("thread is running");
	}

	
	public static void main(String[] args) {
		FirstThread thread1 = new FirstThread();
		thread1.start();
	}
}
