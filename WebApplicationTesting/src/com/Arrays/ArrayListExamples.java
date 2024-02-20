package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		    Arraylist :- Collections of Java
		    It is a dynamic data struture
		    Syntax :-
		           List<dataType>arrayListName=new ArrayList<>();
		 
		 
		 */
		
		        List<Object>arrayList1=new ArrayList<>();
		
		          arrayList1.add(90);        // int byte short long
		          arrayList1.add('a');       // char
		          arrayList1.add("madhu");   // string
		          arrayList1.add(true);      // boolean
		          arrayList1.add(11.887);    // double		          
		          arrayList1.add(90.2321f);  // float
		          
		          System.out.println(arrayList1);
		          
		          System.out.println(arrayList1.get(0));
		          System.out.println(arrayList1.get(5));
		
		
    System.out.println("******************************");
		
		
		    for(int index=0;  index<arrayList1.size();  index++)  
		    {
		    	System.out.println(arrayList1.get(index));
		    }
	     	 // for loop user int byte short the three dataType are same but ---   long dataType are not same
		
		
		
		    for(long index=0;  index<arrayList1.size();  index++)  
		    {
		    	System.out.println(arrayList1.get((int) index));
		    }
			// for loop on the long dataType use in print statement will be added  the :-  (arrayList1.get((int) index));
		    // This method is 4 dataTypes are same  ---  int  byte  short  long 
		
		
		
		    
		                    System.out.println("------------------- or -----------------");
                            System.out.println();

		
		
		for(Object index:arrayList1)
		{
			System.out.println(index );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
