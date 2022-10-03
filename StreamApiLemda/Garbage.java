package StreamApiLemda;

interface Gbg{
	void contain_string(String s1,String s2);
}


public class Garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s2=" is software developer in yash";
		String s1="rahul";
		
		Gbg obj=(str1, str2)->{
			
	
		      int index = 0;
		      System.out.println("Initial String = " + str1);
		      System.out.println("Index where new string will be inserted = " + index);
		      StringBuffer resString = new StringBuffer(str1);
		      resString.insert(index , str2);
		      System.out.println("Resultant String = "+resString.toString());
			  
		};
		
		
		obj.contain_string(s2, s1);
		 s1=null;
		System.gc();  
		 System.out.println(s1);
		
	}

}
