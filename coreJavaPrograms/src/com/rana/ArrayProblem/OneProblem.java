package com.rana.ArrayProblem;

import java.util.Arrays;

public class OneProblem {

	public static void main(String[] args) {
		
		int[] array_nums = {50, 77, 12, 54, -11};
		System.out.println("Original Array: "+Arrays.toString(array_nums));
		
		for(int x : array_nums)
		System.out.println("Original Array element: "+ x);
		
		for(int i=0; i<array_nums.length; i++)
			System.out.println(array_nums[i]);
		
		System.out.println("Result: "+test(array_nums));
	    }	
	    public static boolean test(int[] numbers) {
	    for (int number : numbers) {
	      if (number == 0 || number == -1) {
	        return false;
	      }
	    }
	    return true;
	}
}
