package com.rana.generics;

public class GenericMethods2 {

	public static void main(String[] args) {
		
		Integer[] integerArray = {12,13,16,67,45,74};
		Integer i = printSum(integerArray);
		
	}
	
	private static <P> void printSum(P[] arr)
	{
		Integer y;
		for(P x : arr)
		{
			y = y+x;
		}
	}
}
