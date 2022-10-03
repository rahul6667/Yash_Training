package StreamApiLemda;

@FunctionalInterface
interface Check{
	boolean check(int n);
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check s	= (num) -> {
	        int n = num;
	        int rev = 0;
	 
	        while (n > 0)
	        {
	            int r = n % 10;
	            rev = rev * 10 + r;
	            n = n / 10;
	        }
	        if(num == rev) {
	        	return true;
	        }
			return false;
			
		}	;
		
		
		
	boolean b=s.check(12321);
	if(b==true) {
		System.out.println("this no. is palindrom");
	}
	else
		System.out.println("this no. is Not palindrom");
	
	
	
		
	}

}
