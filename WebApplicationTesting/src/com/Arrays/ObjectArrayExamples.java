package com.Arrays;

public class ObjectArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 Object Array - is capable of storing different dataType values
		 
		 Syntax :-
		           Object arrayName[] =new Object[size];
		           Object arrayName[][]=new Object[size][size];
		 
		  */
		 System.out.println("--------------  Single Dimension Object Array -----------------------");
		 System.out.println();
		 
		 
		 Object array1[]=new Object[6];
		 
		         array1[0]=10;         // int byte short long
		         array1[1]='b';        // char
		         array1[2]="sai";      // string
		         array1[3]=true;       // boolean
		         array1[4]=10.420;     // double
		         array1[5]=21.2121f;   // float
		
		
		System.out.println(array1[1]);
		System.out.println(array1[0]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		
		System.out.println("******************************");
		
		
		for(short index=0;  index<array1.length;  index++) 
		{
			System.out.println(array1[index]);
		}
		
		// for loop user int byte short the three dataType are same but ---   long dataType are not same
		
		
		
		for(long index=0;  index<array1.length;  index++) 
		{
			System.out.println(array1[(int) index]);
		}
		// for loop on the long dataType use in print statement will be added  the :- (array1[(int) index]);
		// This method is 4 dataTypes are same  ---  int  byte  short  long 
		
		System.out.println("******************************");
		
		
		for(byte index=0;  index<array1.length;  index++) 
		{
			System.out.println(array1[index]);
		}
		
		
		             System.out.println("------------------- or -----------------");
		             System.out.println();
		
		             
		       for(Object index:array1) 
		       {
		    	 System.out.println(index);  
		       }
		             
		             
		   
		
		 System.out.println("--------------  MultiDaimension Object Array -----------------------");
		 System.out.println();
		 
		            //  Object arrayName[][]=new Object[size][size];
		 
		        Object array2[][]=new Object[2][2];
		 
		              array2[0][0]=1;       // int byte short long
		              array2[0][1]='a';     // char
		              array2[1][0]=11.2;    // double
		              array2[1][1]=22.87f;  // float
		              
		              
		 System.out.println(array2[0][0]);
		 System.out.println(array2[0][1]);
		 System.out.println(array2[1][0]);
		 System.out.println(array2[1][1]);
		 
		 System.out.println("******************************");
		 
		 for(short indexrow=0;  indexrow<array2.length;  indexrow++) 
		 {
			for(byte rowOfCell=0;  rowOfCell<array2.length;  rowOfCell++)
			{
				System.out.print(array2[indexrow][rowOfCell] + "  ");
			}
			 System.out.println();
			 
		 }
		 
		 
		 
		
		             
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
