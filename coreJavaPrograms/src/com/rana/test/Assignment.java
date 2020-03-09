package com.rana.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter word ..");
		String word = scan.next();
		FileInputStream fis = new FileInputStream("F:\\test\\test.txt");
		int i; String s = "";
		while((i=fis.read())!=-1)
			s=s+(char)i; 
		if(isContain(word, s))
		{
			FileOutputStream fos = new FileOutputStream("F:\\test\\test1.txt", true);
			fos.write(s.getBytes());
			System.out.println("file successful written");
		}
		else {
			System.out.println("sorry! your word doesn't match");
		}
	}
	
	static boolean isContain(String word, String s)
	{
		String[] str = s.split(" ");
		for(String s1 : str)
		{
			int j;
			if((j=s1.compareToIgnoreCase(word))==0)
				return true;
		}
		return false;
	}
}
