package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.demo.controller.Product;
import com.example.demo.controller.ProductController;

public class Prodctivity {

	static Scanner sc = new Scanner(System.in);
	List<Product> list = new ArrayList<Product>();
	static Product product = new Product();
	Product showproduct = new Product();
	static ProductController productController = new ProductController();

	public String add(String opration) {

		try {
			if (opration.equals("add")) {
				System.out.println("How many product you want to add");
				int productsize = sc.nextInt();
				for (int i = 0; i < productsize; i++) {
					System.out.println("Enter next product");
					System.out.println("Enter product ID");
					int id = sc.nextInt();

					System.out.println("Enter product name");
					String name = sc.next();

					System.out.println("Enter product Quantity");
					int quantity = sc.nextInt();

					System.out.println("Enter product Price");
					double price = sc.nextDouble();

					product.setId(id);
					product.setName(name);
					product.setQuantity(quantity);
					product.setPrice(price);
					productController.addproduct(product);
				}
				// return null;
			}

			else if (opration.equals("update")) {

				System.out.println("if you want UPDATE  product please put Information");
				System.out.println("Enter product ID");
				int id = sc.nextInt();

				System.out.println("Enter product name");
				String name = sc.next();

				System.out.println("Enter product Quantity");
				int quantity = sc.nextInt();

				System.out.println("Enter product Price");
				double price = sc.nextDouble();

				product.setId(id);
				product.setName(name);
				product.setQuantity(quantity);
				product.setPrice(price);
				productController.updateProduct(product);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		list = productController.getAllProduct();
		System.out.println(list);

		return "succeful added";

	}

	public String get() {
		System.out.println("if you want get All product by id press :1 else  :2");
		// int byid=sc.nextInt();
		int get = sc.nextInt();
		if (get == 2) {
			list = productController.getAllProduct();
			System.out.println(list);

		} else if (get == 1) {
			System.out.println("put the product ID");
			int getid = sc.nextInt();
			showproduct = productController.findProductById(getid);
			System.out.println(showproduct);

		}
		return "";

	}

	public String delete() {

		System.out.println("if you want delete  product please put id");
		int dltid = sc.nextInt();
		String result = productController.deleteProduct(dltid);
		System.out.println(result);
		list = productController.getAllProduct();
		System.out.println(list);

		
		return null;
	}

}
