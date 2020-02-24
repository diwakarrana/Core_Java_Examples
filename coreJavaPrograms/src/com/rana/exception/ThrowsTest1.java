package com.rana.exception;

import java.io.IOException;

class ThrowsTest1 {
	
	public static void main(String[] args) {
		
		try {
		ThrowsTest2 obj = new ThrowsTest2();
		obj.method();
		System.out.println("normal flow");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("hi there");   
		}
	}
}
class ThrowsTest2 {
	
	void method() throws IOException 
		{
			throw new IOException("device error");
		}
	}
