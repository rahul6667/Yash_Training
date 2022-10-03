package StreamApiLemda;



interface Contain{
	void given_String(String str);
	
	
}


public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="my name is rahul singh dangi";
		
		Contain C=(str)->{
		if(s1.contains(str))	{
			System.out.println("this string is found");
		}
		else
			System.out.println("this is not found");
		
		
	};

	C.given_String("rah");
}
}