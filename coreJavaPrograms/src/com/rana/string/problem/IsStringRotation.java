/**
 *  Given a string s1 and a string s2, write a java method to say whether s2 is a rotation of s1 ?
 *  Example : given s1 = abcd and s2 = cdab, return true, given s1 = abcd, and s2 = acbd , return false
 */



package com.rana.string.problem;

import java.util.Scanner;

public class IsStringRotation {

	public static void main(String[] args) {
		System.out.println("enter first string");
		Scanner scan = new Scanner(System.in);
		String firstString = scan.nextLine();
		System.out.println("enter second string");
		String secondString = scan.nextLine();
		//step one concate first string to itself and chaeck containce 
		firstString += firstString;
		boolean status = firstString.contains(secondString);
		if(status)
			System.out.println("yse, both are rotation of each other");
		else
			System.out.println("no,these are not a rotation");
	}
}
