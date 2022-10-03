package strinArray;

import java.util.Scanner;

public class AddTwoStr {

   public static void main(String[] args) {
	   
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("inter first strint");
      String str1 = sc.nextLine();
      
      System.out.println("inter second strint");
      String str2 = sc.nextLine();
      
      System.out.println("inter Index");
      int index = sc.nextInt();
    
      System.out.println("The result is: ");
     
      String newstr = new String();
      for (int i = 0; i < str1.length(); i++) {
    	  newstr += str1.charAt(i);
         if (i == index) {
        	 newstr += str2;
         }
      }
      System.out.println(newstr);
   }

   }
