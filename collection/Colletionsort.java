package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colletionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al=new ArrayList();
		al.add(8);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(2);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		

	}

}
