package com.rana.pattern;

import java.util.Scanner;

public class SandGlass {

	public static void main(String[] args) {
		
		System.out.println("enter the height of pyramid ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<= n; i++)
		{
			for(int k=5+i; k>=1; k--)
			{
				System.out.printf(" ");
				
			}
			
			for(int j=n+1-i; j >= 1; j--)
			{
				System.out.printf("* ");
			}
			System.out.println("");	
		}
		
		for(int i=1; i<= n; i++)
		{
			for(int k = n+5-i; k>=1; k--)
			{
				System.out.printf(" "); 
			}
			
			for(int j=1; j<= i; j++)
			{
				System.out.printf(" *");
			}
			System.out.println("");	
		}
}
}
