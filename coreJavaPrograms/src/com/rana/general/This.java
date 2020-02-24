package com.rana.general;


//Java code for using 'this' keyword  
//to return the current class instance 
class This
{ 
  int a; 
  int b; 

  //Default constructor 
  This() 
  { 
      a = 10; 
      b = 20; 
  } 
    
  //Method that returns current class instance 
  This get() 
  { 
      return this; 
  } 
    
  //Displaying value of variables a and b 
  void display() 
  { 
      System.out.println("a = " + a + "  b = " + b); 
  } 

  public static void main(String[] args) 
  { 
      This object = new This(); 
      object.get().display(); 
  } 
} 
