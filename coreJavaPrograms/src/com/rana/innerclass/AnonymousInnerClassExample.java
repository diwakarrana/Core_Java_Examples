package com.rana.innerclass;

public class AnonymousInnerClassExample{
	
	public static void main(String[] args) {
		AnonymousExa obj = new AnonymousExa() {
			@Override
			public void display() {
				System.out.println("method is displaying well");
			}
		};//anonymous class
		obj.display();
	}
}
