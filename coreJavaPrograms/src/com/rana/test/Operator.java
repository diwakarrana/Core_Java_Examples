package com.rana.test;

public class Operator {

	public static void main(String[] args) {
	 int z = add(12, 18);
	 System.out.println(z);
	}

	static int add(int x, int y) 
	{
		while(y!=0)
		{
			int carry = x&y;
			x = x^y;
			y = carry<<1;
			
		}
		return x;
	}
}
