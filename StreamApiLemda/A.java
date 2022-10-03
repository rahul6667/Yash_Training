package StreamApiLemda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface IS1{    

     
    String m1(String msg);  
  
      
  
}    
  
public class A{      
  
    public static void main(String[] args) {    
  
    	IS1 dm = (str)->{
			return "rahul"+str;
        	
        };
  
       System.out.println(dm.m1("Work is done"));      
  
            
  
    }    
  }