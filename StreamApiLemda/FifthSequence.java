package StreamApiLemda;

import java.util.ArrayList;
import java.util.Scanner;

/*
user will enter following sequences 1,2,3,4,6,7,8,11,13,14,15,19,20,21. 
You have to generate following output.
1-4,6-8,11,13-15,19-21.

*/

interface Sequence {

	void sqnce(int a[]);
}

public class FifthSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {99,12,13,17, 1, 2, 3, 4, 6, 7, 8, 11, 13, 14, 15, 19, 20, 21 };
		ArrayList al = new ArrayList<>();

		Sequence obj = (int[] x) -> {
			//System.out.println("1");
			int count=0;
			for (int i = 0; i < arr.length - 1; i++) {
				count=0;
				if (arr[i] + 2 - arr[i + 1] == 1) {
					// System.out.println(arr[i]);
					count=0;
				}
				else {
					al.add(arr[i]);
					count++;
					if (al.size() == 1) {
						System.out.println(al.get(0));
						al.clear();
					}
					else {
						System.out.println(al.get(0) + "--" + al.get(al.size() - 1));
						al.clear();
					}
					
				}
				// System.out.println(arr[i+1]);
				if(count!=1) {
				al.add(arr[i]);
				}
				

			}
			if (al.size() == 1) {
				System.out.println(al.get(0));
				al.clear();
			} else {
				System.out.println(al.get(0) + "--" + al.get(al.size() - 1));
				al.clear();
			}
		};

		obj.sqnce(arr);

	}
}
