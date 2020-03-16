package com.rana.metric;

public class DiagonalMetric {

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {{1,2},{1,2},{1,2},{1,2}};
		diagonalPrint(arr, 4, 2);
	}//main
	
	public static void diagonalPrint(int[][] arr, int row, int col) {
		int k = 0;
		for(int i=0; i< row; i++) {
			int temp = i;
			while(temp!=-1 && k!=col) {
				System.out.print(arr[temp][k]);
				temp--;
				k++;
			}
			System.out.println();
			k =0;
		}
		int l =row-1;
		for(int j =1; j<col; j++) {
			int temp = j;
			while(temp!=col && l!=-1) {
				System.out.print(arr[l][temp]);
				temp++;
				l--;
			}
			System.out.println();
			l=row-1;
		}
	}
}//class