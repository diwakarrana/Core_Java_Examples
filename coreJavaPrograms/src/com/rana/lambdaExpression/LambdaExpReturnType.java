package com.rana.lambdaExpression;

public class LambdaExpReturnType {
	
	interface Interf {
		int cube(int a);// by default public and abstract 
	}
	
	public static void main(String[] args) {
		
		Interf g = a -> a*a*a;
		Interf h = a -> {return a*a*a;};
		Interf i = (a) -> a*a*a;
		Interf j = (a) -> {return a*a*a;};
		//Interf k = a -> return a*a*a;// cannot write return statement without curly braces
		
		System.out.println(g.cube(2));
		System.out.println(h.cube(3));
		System.out.println(i.cube(4));
		System.out.println(j.cube(5));
	}
}
