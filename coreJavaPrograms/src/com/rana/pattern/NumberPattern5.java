/*enter the height of pyramid 
5

1
26
3710
481113
59121415*/

package com.rana.pattern;

import java.util.Scanner;

public class NumberPattern5 {

	public static void main(String[] args) {
		
		System.out.println("enter the height of pyramid ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int x =i;
			System.out.printf("%d", x);
			for(int k=1; k < i; k++)
			{
				x = x+ n-k;
				System.out.printf("%d", x);
			}
			System.out.println();
		}
	}
}
