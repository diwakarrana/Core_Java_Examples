package com.rana.syn.IPC;

public class Customer {
	
	int amt = 10000;
	
	synchronized void withDraw(int amt){
		System.out.println("withdraw is started");
		if(this.amt < amt)
			System.out.println("amount is not sufficient....");
		System.out.println("waiting for deposite....");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.amt = this.amt - amt;
		System.out.println("withdraw completed");
	}
	
	
	synchronized void deposite(int amt){
		System.out.println("deposite started");
		this.amt += amt;
		System.out.println("deposite completed");
		notify();
	}
}
