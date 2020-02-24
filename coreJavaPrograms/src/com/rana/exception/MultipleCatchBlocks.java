package com.rana.exception;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		try {
			int arr[]   = new int[5];
			arr[5] = 30/0;
		}
		catch (ArithmeticException ae) {
			System.out.println("task is completed");
		}
		catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("task 2 is completed");
		}
		catch (Exception e) {
			System.out.println("task 3 is completed");
		}
	}

}
