package StreamApiLemda;

import java.util.Scanner;

// ABCDEFEDCBA

//ABCDE EDCBA
//ABCD DCBA
//ABC CBA
//AB BA
//A A
interface Devide {
	void dvd(String s);
}

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str="ABCDEFEDCBA";
		
		
		Devide obj=(String str)->{
			String strleft="";
			String strright="";
			int size=str.length()/2;
			//System.out.println(size);
			int count=0;
			for(int i=0;i<size;i++) {
				count++;
				for(int j=0;j<size-i;j++) {
					strleft=strleft+str.charAt(j);
					strright=strright+str.charAt(size+count+j);
				//System.out.print(str.charAt(j)+"  "+str.charAt(size+1+j));
			}
				System.out.println(strleft+"  "+strright);
				 strleft="";
				  strright="";
			}
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		obj.dvd(s1);
		
		
	}

}
