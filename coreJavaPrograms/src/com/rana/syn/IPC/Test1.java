package com.rana.syn.IPC;

public class Test1 {

	public static void main(String[] args) {
		
		Thread1 t = new Thread1();
		
		
		Runnable r2 = ()->{
			t.lastWork();
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		Runnable r3 = ()->{
			t.lastWork();
		};
		Thread t3 = new Thread(r3);
		t3.start();
		
		Runnable r4 = ()->{
			t.lastWork();
		};
		Thread t4 = new Thread(r4);
		t4.start();
		
		Runnable r = ()->{
			t.firstWork();
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}
