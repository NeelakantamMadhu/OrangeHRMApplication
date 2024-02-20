package com.UserDifinedMethods;

public class MethodExample7 {
	
	
	int var3=35;  //Gobel Variable / instance Variable
	
	public void addition()  // withOut parameter
	{
		
		//Local Variables
		 int var1=20;    
		double var2=100;
		int var4;
		 var4=var1+var3;
		System.out.println("The value of the variable var4 after addition is :-  "+var4);
	}
	
	public static void main(String[] args) {
		
		MethodExample7 m7=new MethodExample7();
		m7.addition();
		m7.addition(23, 27);
		m7.addition(10, 20, 30);
		
		// Whenever the Method names are similar but with different method signature /parameters - its is called
		// Method OverLoading - OPP's
		
		
		m7.addition(35, 40, 20.143);
	}
	
	public void addition(int var1,int var2)  // method with parameter 
	{                                        // method with signature 
		var3=var1+var2;
		System.out.println("The value of the variable var3 after addition is :-  "+var3);
		
	}
	
	void addition(int var1,int var2,int var3)
	{
		double var4;
		var4=var1+var2+var3;
		System.out.println("The value of the variable var4 after addition is :-  "+var4);
		
	}
	public void addition(int var1, int var2 , double var3) // method with parameter
	                                                     // method with signature
	{
	    double var4;
	    var4= (var1+var2+var3);
	    System.out.println("The value of the variable var4 after addition is :-  "+var4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
