package com.rana.ArrayProblem;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int count =0; 
		int maxConsecutiveSequence = 0;
		int[] arr = {49, 1, 3, 200, 2, 4, 70, 5, 23, 6, 8, 90, 7 };
		
		Arrays.sort(arr);
		
		for(int i=0; i< arr.length-1; i++)
		{
			if(arr[i]+1 == arr[i+1])
				count++;
			else
			if(maxConsecutiveSequence <count){
				maxConsecutiveSequence = count;
				count = 0;
			}
		}
			
		System.out.println(maxConsecutiveSequence+1);
		

	}

}
