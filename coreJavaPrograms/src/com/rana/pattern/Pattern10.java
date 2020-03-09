package com.rana.pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int count = 1;
		int[][] arr = new int[5][5];
		 for(int i=0; i<5; i++)
		 {
			 if(i%2==0)
			 {
				 for(int j=0; j<5; j++)
				 {
					 arr[j][i] = count++;
				 }
			 }
			 else {
				 for(int j=4; j>=0; j--)
				 {
					 arr[j][i] = count++;
				 }
			 }
		 }
		 for(int i=0; i<5; i++)
		 { for(int j=0; j<5; j++)
				 System.out.print(arr[i][j]+" ");
		 	System.out.println();
		 }
	}//end of main
}//end of class


