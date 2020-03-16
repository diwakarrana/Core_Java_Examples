package com.rana.metric;

public class SpiralMetrics {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,2,3,4},{1,2,3,4}};
		spiralPrint(arr, 2, 4);
	}
	
	public static void spiralPrint(int[][] arr, int row, int col) {
		
	   int lowrow =-1, highrow = row, lowcol = -1, highcol = col;
	   int currentCol = 0;
	   int currentRow = 0;
	   while(lowrow+1 < highrow && lowcol+1 < highcol) {
		   
	   while(currentCol <highcol) {
		   System.out.print(" "+arr[currentRow][currentCol]);
		   currentCol++;
	   }
	   currentCol--;
	   currentRow++;
	   lowrow++;
	   while(currentRow< highrow) {
		   System.out.print(" "+arr[currentRow][currentCol]);
		   currentRow++;
	   }
	   currentRow--;
	   currentCol--;
	   highcol--;
	   while(currentCol>lowcol) {
		   System.out.print(" "+arr[currentRow][currentCol]);
		   currentCol--;
	   }
	   currentCol++;
	   currentRow--;
	   highrow--;
	   while(currentRow>lowrow) {
		   System.out.print(" "+arr[currentRow][currentCol]);
		   currentRow--;
	   }
	   currentRow++;
	   currentCol++;
	   lowcol++;
	   }//end of outer while loop
	}
}
