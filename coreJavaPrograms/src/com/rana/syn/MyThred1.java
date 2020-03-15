package com.rana.syn;

public class MyThred1 extends Thread {
	
	Table t;
	public MyThred1(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(6);
	}
}
