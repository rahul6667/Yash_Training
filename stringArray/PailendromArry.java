package strinArray;

import java.util.Arrays;

public class PailendromArry {

 
 static boolean isPalindrome(String str)
 {

     int i = 0, j = str.length() - 1;
     while (i < j) {

         if (str.charAt(i) != str.charAt(j))
             return false;

     
         i++;
         j--;
     }

     return true;
 }

 public static void main(String[] args)
 {
	 
	 String arr[]= new String[]{"geeks","RACEcar","vijia","rajar"};
	 
	String newarr[]=new String[arr.length];
	 
     String str = null ;
    for(int i=0;i<arr.length;i++) {
    	str=arr[i];
     str = str.toLowerCase();
     if (isPalindrome(str))
         newarr[i]=arr[i];
    
 }
    
    String[] removedNull = Arrays.stream(newarr)
            .filter(value ->
                    value != null && value.length() > 0
            )
            .toArray(size -> new String[size]);

    System.out.println(Arrays.toString(removedNull));
   
 }
}
