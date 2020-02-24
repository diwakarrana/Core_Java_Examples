package com.rana.multithreading;

public class ThreadTwiceStart extends Thread {

	public static void main(String[] args) {
		ThreadTwiceStart tts = new ThreadTwiceStart();
		tts.start();
		tts.start();
		//if we start a thread twice it will generate IllegalThreadStateException

	}
	public void run() {
		System.out.println("thread is running");
	}
}
