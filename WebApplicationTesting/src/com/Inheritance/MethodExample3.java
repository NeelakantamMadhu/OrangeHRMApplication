package com.Inheritance;

public class MethodExample3 extends MethodExample2{
	
	
	public void division() 
	{
		int var1=20;
		int var2=10;
		int var3;
		
		var3=var1%var2;
		System.out.println("The value of the variable var3 after division is :- "+var3);
		
		
		
	}
	public static void main(String[] args) {
		
		MethodExample3 m3 =new MethodExample3();
		System.out.println("Method of methoExample3 java class");
		m3.division();
		
		System.out.println();
		
		
		System.out.println("Method of MethodExample2 java class");
		m3.multiplecation();
		
		System.out.println();
		
		System.out.println("Method of MethodExample1 java class");
		m3.addition();
		
		System.out.println("Method of MethodExample2 java class");
	}
	
	
	
	
	

}
