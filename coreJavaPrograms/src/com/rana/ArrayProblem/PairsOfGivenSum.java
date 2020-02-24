package com.rana.ArrayProblem;

import java.util.Scanner;
import java.util.Arrays;
public class PairsOfGivenSum {

	public static void main(String[] args) {
		
		int required = 0;
		int count =0;
		
		System.out.println("first, drop size of Array");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		for(int i=0; i<arr.length;i++)
			arr[i] = scan.nextInt();
	
		
		System.out.println("enter the sum that you want to be two number");
		int sum = scan.nextInt();
		//........................sorting array........................................
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//............................next business logic........................
		
		for(int i=0; i< arr.length; i++)
		{ 
			required = sum - arr[i];
			for(int j =i+1 ; j<arr.length; j++)
			{
				if( required == arr[j] )
					count++;
				else
					if(arr[j] > required)
						break;
			}
		}
		
		System.out.println(count);
	}

}
