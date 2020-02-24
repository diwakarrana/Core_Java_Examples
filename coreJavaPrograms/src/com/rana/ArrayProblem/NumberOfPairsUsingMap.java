package com.rana.ArrayProblem;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class NumberOfPairsUsingMap {

	public static void main(String[] args) {
		
		System.out.println("enter the size of array");
		Scanner scan = new Scanner(System.in);
		int[] array = new int[scan.nextInt()];
		System.out.println("enter"+array.length+"values back to back");
		for(int i=0; i<array.length; i++)
		{
			array[i] = scan.nextInt();
		}
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		

	}

}
