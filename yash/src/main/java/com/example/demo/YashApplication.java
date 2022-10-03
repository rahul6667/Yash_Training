package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.Product;
import com.example.demo.controller.ProductController;

@SpringBootApplication


public class YashApplication {

	public static void main(String[] args) {
		SpringApplication.run(YashApplication.class, args);
		Prodctivity obj= new Prodctivity();
		Scanner sc = new Scanner(System.in);
		//int operation1 =sc.nextInt();
		System.out.println("For ADD Operation: Press 1");
		
		int operation11 =sc.nextInt();

		if(operation11==1) {
			 String result= obj.add("add");
			 //String getresult=obj.get();
			 System.out.println(result);
		}
		
		System.out.println("For GET Operation: Press 2");
		System.out.println("For DELETE Operation: Press 3");
		System.out.println("For UPDATE Operation: Press 4");
		
		
		int operation =sc.nextInt();
	if(operation==2) {
			String getresult=obj.get();
			 System.out.println(getresult);
		}
		else if(operation==3) {
			String dltresult=obj.delete();
			System.out.println(dltresult);
		}else if(operation==4) {
			 String result= obj.add("update");
			 System.out.println(result);
		}
		
	
	
	
	System.out.println("For GET Operation: Press 2");
	System.out.println("For DELETE Operation: Press 3");
	System.out.println("For UPDATE Operation: Press 4");
	
	
	int operationnew =sc.nextInt();
if(operationnew==2) {
		String getresult=obj.get();
		 System.out.println(getresult);
	}
	else if(operationnew==3) {
		String dltresult=obj.delete();
		System.out.println(dltresult);
	}else if(operationnew==4) {
		 String result= obj.add("update");
		 System.out.println(result);
	}
	
	
	
	
	
	}
	

}
