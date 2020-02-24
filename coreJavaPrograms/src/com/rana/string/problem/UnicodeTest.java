/**
 * getting unicode value in java......
 */
package com.rana.string.problem;
public class UnicodeTest {

	public static void main(String[] args) {
		String str = new String("0"); 
		int code = str.codePointAt(0);
		System.out.println(code);
		int a = 'a';
		System.out.println(a);
		int b = 65;
		System.out.printf("%c",b);
//		char ch = 'd';
//		System.out.println();
//		System.out.printf("%d", ch);

	}

}
