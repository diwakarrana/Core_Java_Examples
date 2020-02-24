package com.rana.innerclass;

public class MemberOuter{
	String name = "Diwakar Rana";
	
	class Inner{
		void display()
		{
			System.out.println("client name is "+name);
		}
	}
	
	public static void main(String[] args) {
		MemberOuter obj1 = new MemberOuter();
		Inner obj = obj1.new Inner();
		obj.display();
	}

}
