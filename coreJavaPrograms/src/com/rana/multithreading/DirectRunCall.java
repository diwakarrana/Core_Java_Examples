package com.rana.multithreading;

public class DirectRunCall extends Thread {

	public static void main(String[] args) {
		DirectRunCall drc = new DirectRunCall();
		drc.run();

	}
	public void run() {
		System.out.println("thread is running");
	}
}
/**
 * it will runs but new stack will not given to it ....it is called on same stack of 
 * main method ...if call two run method then both of them are pushed into stack and 
 * no context switching will take place
 */
