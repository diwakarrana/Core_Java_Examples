package com.rana.lambdaExpression;


@FunctionalInterface
interface interf {
	void square(int a);
}


public class FirstLambdaExpression {
	public static void main(String []args)
	{
		interf i = (a)->System.out.println("square is " +a*a);
		i.square(10);
	}
}
