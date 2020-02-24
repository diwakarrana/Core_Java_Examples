package com.rana.ArrayProblem;

import java.util.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		int[] array = {12,12,10,12,24,24,12,24,10};
		Arrays.sort(array);
		int length = removeDuplicate(array);
		System.out.println("number of distinict element"+length);
	}
	
	private static int removeDuplicate(int[] formalArray) {
		int check = formalArray[0], count =1;
		for(int x: formalArray)
		{
			if(check != x)
			{
				count++ ;
				check = x;
			}
		}
		return count;
	}
}
