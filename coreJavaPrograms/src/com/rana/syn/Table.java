package com.rana.syn;

public class Table {
	  void printTable(int x) {
		  System.out.println("thred enterd inside method");
		 synchronized(this) {
			 System.out.println("thread inside synchronized block");
		for(int i=1; i<=10; i++)
		{
			System.out.println(x+"*"+i+"="+" "+x*i);
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 }//end of synchronized block.....
		 
	}
}
