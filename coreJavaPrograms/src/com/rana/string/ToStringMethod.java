package com.rana.string;

public class ToStringMethod extends Object {
	
	String name = null;
	float sal = 0.0f;
	int exp = 0;
	
	ToStringMethod(String name, float sal, int exp){
		this.name = name;
		this.sal = sal;
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return name+"  "+sal+"  "+exp;
	}
	
	

	public static void main(String[] args) {
		
		ToStringMethod obj = new ToStringMethod("rana",100000, 0);
		System.out.println(obj);
	}
}
