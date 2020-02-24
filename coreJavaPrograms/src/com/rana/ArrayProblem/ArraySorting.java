//sorting a array in java........
package com.rana.ArrayProblem;
import java.util.Scanner;
import java.util.Arrays;
public class ArraySorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("enter value array which you want to sort");
		for (int i=0; i<5; i++)
		{
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for (int i=0; i<5; i++)
		{
			System.out.println(array[i]);
		}
	}

}
