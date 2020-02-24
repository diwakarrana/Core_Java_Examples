package com.rana.multithreading;

public class ThreadImplementingRunable implements Runnable {

	public static void main(String[] args) {
		ThreadImplementingRunable thread = new ThreadImplementingRunable();
		Thread obj = new Thread(thread);
		obj.start();
	}

	@Override
	public void run() {
		System.out.println("thread is running");
		
	}

}
