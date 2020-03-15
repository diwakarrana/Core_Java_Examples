package com.rana.syn.IPC;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		Runnable r = ()->{
			c.withDraw(15000);
		};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r2 = ()->{
			c.deposite(10000);
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
