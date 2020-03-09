package com.rana.test;

public class Sample extends Example {
	static int b = m3();
	static {
		System.out.println("child SB");
	}
	
	static int m3() {
		System.out.println("SV Child");
		return 30;
	}
	
	Sample(){
		System.out.println("child constructor");
	}
	
	int y = m4(); 
	
	{
		System.out.println("NSB child");
	}
	int m4() {
		System.out.println("Child NSV");
		return 40;
	}
	
	void abc() {
		System.out.println("Sample abc");
	}

	public static void main(String[] args) {
		System.out.println("main child");
		
		Sample s = new Sample();
		s.abc();
		s.bbc();
	}
}
