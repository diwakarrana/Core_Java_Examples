package com.rana.syn;

public class Test {

	public static void main(String[] args) {
	
		Table t = new Table();
		MyThred1 mt1 = new MyThred1(t);
		MyThred2 mt2 = new MyThred2(t);
		
		mt1.start();
		mt2.start();

	}
	
}
