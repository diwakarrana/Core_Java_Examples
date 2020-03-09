package com.rana.test;

public class NonStaticBlock {
	int x =6;
	{
		System.out.println("non static block is created");
		System.out.println(x);
	}
	public static void main(String[] args) {
	
		NonStaticBlock nsb = new NonStaticBlock();
	}
}
