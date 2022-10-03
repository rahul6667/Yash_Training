package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al= new ArrayList();
		
		al.add(200);
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(100);
		al.add(400);
		
		System.out.println(al.toString());
		
		
		LinkedHashSet lhs= new LinkedHashSet(al);
		
		ArrayList alnew= new ArrayList(lhs);
		
		Collections.sort(alnew);
		
		System.out.println(alnew.toString());
		
		Collections.reverse(alnew);
		System.out.println(alnew.toString());
		
		
	}

}
