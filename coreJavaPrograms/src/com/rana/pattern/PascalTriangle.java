package com.rana.pattern;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		System.out.println("please enter number of line to"
				+ " want to get print in pascal");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j =0; j<=i; j++)
			{
				if(j==0||i==j)
					arr[i][j] = 1;
				else {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
			}
		for(int i=0;i<n;i++)
			{
			for(int j=2*n-i; j>=1; j--)
				System.out.print(" ");
			
			for(int j =0; j<=i; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			}
	}
}
