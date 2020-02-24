package com.rana.innerclass;

import java.awt.DisplayMode;

public class StaticInnerExample {
	String name = "Diwakar";
	static String surname = "Rana";
	
	static class Inner {
		 void display() {
			System.out.println("your name is "+surname);
		}
	}

	public static void main(String[] args) {
		StaticInnerExample.Inner obj = new StaticInnerExample.Inner();
		obj.display();
	}
}
