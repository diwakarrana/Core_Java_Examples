package com.rana.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		
		Add<Integer> xx = new Add<Integer>(10,20);
		System.out.println(xx.x()+xx.y());
		
		Add<String> xx1 = new Add<String>("Diwakar ","Rana");
		System.out.println(xx1.x()+xx1.y());

	}

}
