package StreamApiLemda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface EOPA{
	
	void comman(int num);
	
}

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> lst1= new ArrayList<Integer>();
		
		
		EOPA obj=(num)->{
			String result = null;
			
			if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else {
	            System.out.println(num + " is odd");
	        }
			int num1=num;
			 int n = num1;
		        int rev = 0;
		 
		        while (n > 0)
		        {
		            int r = n % 10;
		            rev = rev * 10 + r;
		            n = n / 10;
		        }
		        if(num1 == rev) {
		        	System.out.println("it is palindrom");
		        }
		        else
		        System.out.println("it is Not a palindrom");
		};
		
		
		obj.comman(1234321);
		

		
	}

}
