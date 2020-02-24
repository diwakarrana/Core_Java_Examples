/**
 * Q.
 * String str = null; is allowed but 
 * String str = new String(null);is not aloowed tell me reason 
 *
 */
package com.rana.string;

public class StringObjectNullAndEmpty{

	public static void main(String[] args) {
		String str = "";
		String str1 = new String();
		String str2 = new String("");
		// str, str1, str2 are empty string object creation
		String str3 = null;
		//str3 is null string referenced creation ...
		
		String str4 = new String(null);// ambiguous error..here compiler is in ambiguity which constructor 
									//it has to use.
		String str5 = new String(str3) ;
	}

}
