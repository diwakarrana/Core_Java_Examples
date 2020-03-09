package com.rana.generics;

public class GenericMethods {

	public static void main(String[] args) {
		
		Integer[] integerArray = {12,13,16,67,45,74};
		Character[] characterArray = {'a','b','c','d','s'};
		printArray(integerArray);
		printArray(characterArray);
	}
	
	private static <P> void printArray(P[] arr)
	{
		for(P x : arr)
		{
			System.out.print(x+".. ");
		}
		System.out.println();
	}
}
