package strinArray;

import java.util.Scanner;

class DArray {

	private int arr[];
	private int count;

	public DArray(int length) {
		arr = new int[length];
	}

	public void printArray() {

		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void insert(int element) {

		if (arr.length == count) {

			int newArr[] = new int[3 * count];

			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}

		arr[count++] = element;
	}
}

//Class 2
//Main class
public class DynamicArray {

	// Main driver method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put the first time size of array");
		int size = sc.nextInt();
		DArray numbers = new DArray(size);

		System.out.println("put the extra size value ");

		// int total=sc.nextInt();

		numbers.insert(sc.nextInt());
		numbers.insert(sc.nextInt());
		numbers.insert(sc.nextInt());
		numbers.insert(sc.nextInt());

		numbers.printArray();
	}
}