package com.rana.syn;

public class MyThred2 extends Thread {
	
	Table t;
	public MyThred2(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(6);
	}
}
