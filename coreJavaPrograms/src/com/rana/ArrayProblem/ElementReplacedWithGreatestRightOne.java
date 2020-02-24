package com.rana.ArrayProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ElementReplacedWithGreatestRightOne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		
		//creating array of input size
		int[] array = new int[scan.nextInt()];
		for(int i=0; i<array.length; i++)
		{
			array[i] = scan.nextInt();
		}
		System.out.println("before operation array was like this...");
		System.out.println(Arrays.toString(array));
		
		
		for(int i=0; i<array.length; i++)
		{
			if(i != array.length-1)
			array[i] = maxFromRight(i+1, array, array[i+1] );
			else
				array[i] = -1;
		}
		
		
		System.out.println("After operation array is like this...");
		System.out.println(Arrays.toString(array));
		
	}
	
	private static int maxFromRight(int start, int[] a, int max)
	{
		
		for(int i=start; i<a.length; i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}

}
