/*
Enter the number of rows to print the pattern 
5
** Printing the pattern... **
1 10 11 20 21 
2 9  12 19 22 
3 8  13 18 23 
4 7  14 17 24 
5 6  15 16 25

*/

package com.rana.pattern;

import java.util.Scanner;

public class NumberPattern6 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows to print the pattern  ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.printf("%d",i);
			int x =0;
			
			for(int j=2; j< n; j++ )
			{
				if(j%2 == 0)
				{
					x =j*n-i+1;
					
				}
				else 
				{
					x = (j-1)*n+i;
				}
				System.out.println(x);
			}
			
			System.out.println();
			
		}
	}
}
