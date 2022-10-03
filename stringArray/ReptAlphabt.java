package strinArray;

import java.util.Scanner;

public class ReptAlphabt {  
    public static void main(String[] args) {  
    	Scanner sc= new Scanner(System.in);
       String string1 = sc.nextLine();  
       
     
       
       int count;  
       char charArr[] = string1.toCharArray();  
         
       System.out.println("Duplicate characters in a given string: ");  
      
       for(int i = 0; i <charArr.length; i++) {  
           count = 1;  
           for(int j = i+1; j <charArr.length; j++) {  
               if(charArr[i] == charArr[j] && charArr[i] != ' ') {  
                   count++;  
                   
                   charArr[j] = '0';  
               }  
           }  
           
           
           if(count > 1 && charArr[i] != '0')  
               System.out.println(charArr[i]);  
       }  
   }  
}