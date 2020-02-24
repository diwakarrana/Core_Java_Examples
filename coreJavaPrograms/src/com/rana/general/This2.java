package com.rana.general;


//Java code for using this to invoke current  
//class method 
class This2 { 

 void display() 
 { 
     // calling fuction show() 
    this.show(); 
  
    System.out.println("Inside display function"); 
 } 
   
 void show() { 
     System.out.println("Inside show funcion"); 
 } 
   

 public static void main(String args[]) { 
     This2 t1 = new This2(); 
     t1.display(); 
 } 
} 

