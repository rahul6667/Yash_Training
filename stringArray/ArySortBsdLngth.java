package strinArray;

import java.util.Arrays;

public class ArySortBsdLngth{  

public static String[] ThirdLargest(String[] a, int total){  
String temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i].length() > a[j].length())   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a;  
}  
public static void main(String args[]){  
String a[]={"ra","r","hulp","abc","abcdefg","abcdef"};  
 
a=ThirdLargest(a,6);
System.out.println(Arrays.toString(a));  
;  
}}