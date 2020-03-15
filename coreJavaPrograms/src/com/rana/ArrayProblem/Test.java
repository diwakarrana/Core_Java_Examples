package com.rana.ArrayProblem;

public class Test {

	public static void main(String[] args) {
		
		int[] array = new int[]{12,26,45,67,87};
		String s = array.toString();
		System.out.println(s);
		
		Test t = new Test();
		String str = t.toString(array);
		System.out.println(str);
	}
	
	public String toString(int[] array) {
		String s = "[";
		for(Integer i : array)
		{
			s = s+" "+i;
		}
		s +=" ]";
		return s;
	}
}
