package com.rana.syn;

public class Test1 {

	public static void main(String[] args) {
		Table t = new Table();
		Thread t1 = new Thread() {
			public void run() {
				t.printTable(12);
			}
		};
		t1.start();
		
		Thread t2 = new Thread(){
			public void run() {
				t.printTable(13);
			}
		};
		t2.start();
		//........implementing multithreading by runable interface
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				t.printTable(17);
			}
		};
		Thread t3 = new Thread(r);
		t3.start();
	//....................using lambda expression.....................	
		
		Runnable r1 = () -> {
			t.printTable(19);
		};
		Thread t4 = new Thread();
		t4.start();
	}
}
