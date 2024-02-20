package com.UserDifinedMethods;

public class MethodExample6 {

	
	//Gobal Variable / instance Variable
	int var1=50;
	
	public void addition() 
	{
		
		// Local Variable
		int var2=10;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable var3 after addition is :-  "+var3);
    }
	
	void subtraction() {
		
		int var4=80;
		int var5=10;
		int var6=90;
		var1=var6+var5-var4;
		System.out.println("The value of the variable var3 after addition is :-  "+var1);
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodExample6 m6=new MethodExample6();
		m6.addition();
		
		m6.subtraction();
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
