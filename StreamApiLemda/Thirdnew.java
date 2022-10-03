package StreamApiLemda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface newEOPA{
	void comman(int num);
}


public class Thirdnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Integer> lst1= Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> stream=lst1.stream();
		
		List<Integer> newlst=stream.filter(x ->x%2==0).collect(Collectors.toList());
		System.out.println(newlst);
		
		
		
		
		
	}

}
