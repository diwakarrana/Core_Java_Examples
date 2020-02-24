package com.rana.string.problem;

public class StringJoinWays {

	public static void main(String[] args) {
		String str2 = "Diwakar";
		String str1 = "rana";
		System.out.println(str2 +" "+ str1);
		System.out.println();
		
		str2.concat(str1);// it will not give result because we have catch the string
		//in other reference ...because String is immutable thats why following is 
		//right
		String str3 = (str2+" ").concat(str1);
		System.out.println(str3);
		System.out.println();
		
		//it will work because String Builder is mutable ..changs are updated to the 
		//same string.......
		StringBuilder sbr1 = new StringBuilder("Diwakar ");
		StringBuilder sbr2 = new StringBuilder("Rana");
		sbr1.append(sbr2);
		System.out.println(sbr1);
		
		StringBuffer sfr1 = new StringBuffer("Diwakar");
		StringBuffer sfr2 = new StringBuffer("Rana");
		//(sfr1+" ").append(sfr2);//here i cannot append space like previous one
		//because it will become string and append() is not not method of String class 
		
		sfr1.append(sfr2);
		System.out.println(sfr1);
	}
}
