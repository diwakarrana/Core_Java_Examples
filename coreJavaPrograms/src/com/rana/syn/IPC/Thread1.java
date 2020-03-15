package com.rana.syn.IPC;

public class Thread1 extends Thread {

	void lastWork() {
		synchronized(this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getId()+" last work");
		}
	}
	
	void firstWork() {
		synchronized(this) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getId()+" first work");
			notifyAll();
		}//end of synchronized block.....
}
}