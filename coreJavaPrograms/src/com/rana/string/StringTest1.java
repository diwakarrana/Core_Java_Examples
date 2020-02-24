/**
 * https://www.w3resource.com/java-exercises/string/index.php#editorr
 * a number of good exercise is given on this link
 */
package com.rana.string;
public class StringTest1 {

	public static void main(String[] args) {
		String a = "java";
		String b = "java";
		if(a==b)
		{
			System.out.println("a and b are equals");
		}
		else {
			System.out.println("a and b are not equal");
		}
		String p = new String("java");
		String q = new String("java");
		if(p==q)
		{
			System.out.println("p and q are equals");
		}
		else {
			System.out.println("p and q are not equal");
		}
		if(p==a)
		{
			System.out.println("p and a are equals");
		}
		else {
			System.out.println("p and a are not equal");
		}
		
	}
}
