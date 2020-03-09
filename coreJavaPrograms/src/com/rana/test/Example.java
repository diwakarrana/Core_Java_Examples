package com.rana.test;

public class Example {
	static int a= m1();
	//............................................
	static {
		System.out.println("SB Parent");
	}
	
	static int m1() {
		System.out.println("SV Parent");
		return 10;
	}
	
	int x = m2();
	{
		System.out.println("NSB Parent");
	}
	Example(){
		System.out.println("Parent constructor");
	}
	int m2() {
		System.out.println("NSV is created Parent");
		return 20;
	}
	
	void abc() {
		System.out.println("ABC parent");
	}
	void bbc() {
		System.out.println("BBC Parent");
	}
}
