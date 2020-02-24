   //Error: Main method not found in class com.rana.general.This3, please define the main method as:
   //public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application


package com.rana.general;
   class This3{  
    int rollno;  
    String name;  
    float fee;  
    This3(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    
    public static void main(String args[]){  
        This3 s1= new This3(111,"ankit",5000f);  
        This3 s2=new This3(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    } } 
 //..................................................................   
