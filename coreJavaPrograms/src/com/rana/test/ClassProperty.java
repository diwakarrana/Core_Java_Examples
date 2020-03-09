package com.rana.test;

public class ClassProperty {

	public static void main(String[] args) throws Exception {
		
		System.out.println(Object.class);
		Object obj = new Object();
		System.out.println(obj.getClass());
		
		Class c = Class.forName("java.lang.Object");
		Object ob = c.newInstance();
		System.out.println(ob);
		
	}
}
