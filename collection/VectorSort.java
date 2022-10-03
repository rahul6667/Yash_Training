package com.example.demo;

import java.util.Collections;
import java.util.Vector;

public class VectorSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v= new Vector();
		
		v.add("a");
		v.add("d");
		v.add("b");
		v.add("z");
		v.add("c");
		v.add("y");
		v.add("m");
		
		
		System.out.println(v.toString());
		Collections.sort(v);
		System.out.println(v.toString());
		Collections.reverse(v);
		System.out.println(v.toString());
		
	}

}
