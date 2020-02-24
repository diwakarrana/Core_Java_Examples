package com.rana.general;


//Java code for using 'this'  
//keyword as method parameter 
class This1
{ 
 int a; 
 int b; 
   
 // Default constructor 
 This1() 
 { 
     a = 10; 
     b = 20; 
 } 
   
 // Method that receives 'this' keyword as parameter 
 void display(This1 obj) 
 { 
     System.out.println("a = " + a + "  b = " + b); 
 } 

 // Method that returns current class instance 
 void get() 
 { 
     display(this); 
 } 

 public static void main(String[] args) 
 { 
     This1 object = new This1(); 
     object.get(); 
 } 
} 

