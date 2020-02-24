
/**
 * Write a java program to remove the space in the given string?
	Input: Ravindra babu ravula
	Output: Ravindrababuravula
 */

package com.rana.string.problem;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
			System.out.println("enter string to remove space");
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			//splitting given string into words....
			String[] array = str.split(" ");
			
			for (int i=0; i<array.length; i++)
			{
				System.out.print(array[i]);
			}
			
	}// end of main method
}// end class
