package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectiontoArray {


		 // Main driver code
	    public static void main(String[] args)
	    {
	     
	      ArrayList al = new ArrayList();
	      al.add("a");
	      al.add("ytr");
	      al.add("qwe");
	      al.add("ere");
	      al.add("rah");
	      al.add("dippi");
	      al.add("aavam");
	      
	      String[] namesArray = (String[]) al.toArray(new String[0]); 
	      
	      Arrays.sort(namesArray);
	      
	      
	     
	      
	      System.out.println(Arrays.toString(namesArray));
	      
	    
	      Scanner sc =new Scanner(System.in);
	      
	      System.out.println("enter the value of String");
	      String key=sc.nextLine();
	      
	      int result=Arrays.binarySearch(namesArray, key);
	      
	      System.out.println("That String is positon ar"+result);
	      
	      
	}

}
