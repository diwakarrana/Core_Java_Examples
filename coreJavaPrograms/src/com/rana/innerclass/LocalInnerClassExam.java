package com.rana.innerclass;

public class LocalInnerClassExam {

	public static void main(String[] args) {
		String name = "Diwakar Rana";
		class Inner{
			void display() {
				System.out.println("system is displaying well "
						+ "your name is "+name);
			}
		}
		Inner obj = new Inner();
		obj.display();
	}//main method
}
