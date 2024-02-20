package com.Inheritance;

public class MethodExample2 extends MethodExample1 {
	
	
	//  Inheritance user Extends keyword - which will extend the respective class 
	
	private void subtraction() 
	{
		int var1=20;
		int var2=10;
		int var3;
		var3= var1-var2;
		System.out.println("The value of the variable var3 after Subtraction is :- "+var3);
		
		
	}
	
	public static void main(String[] args) {
		
		MethodExample2 m2=new MethodExample2();
		System.out.println("Method of MethodExample2 java class");
		m2.subtraction();
				
		System.out.println();
		
		
		/*
		 MethodExample1 m1 =new MethodExample1();
		 System.out.println("Method of MethodExample1 java class");
		 m1.addition();
		 */
		 
		 
		
		// when a class is Extended - we need not create an Object for that Respective class to
		// call the user Defined Methods
		// *Using the current class Object itself we can call all Extended class user Defined Methods
		
		                      // OR
		
		// Acquiring all the properties of One class into anther class using extends keyword
		
		System.out.println("Method of MethodExample1 java class");
		m2.addition();
		
		System.out.println();
		
		System.out.println("Method of MethodExample2 java class");
		m2.multiplecation();
		
		 
	}
	
	public void multiplecation() {
		
		int var1=20;
		int var2=10;
		int var3;
		var3=var1*var2;
		System.out.println("The value of the variable var3 after multiplication is :- "+var3);
		
		
	}
	
	

}
