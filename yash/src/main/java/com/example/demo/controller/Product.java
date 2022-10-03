package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//public class product {
//
//}

//
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
	}

	private String name;
	private int id;
	private int quantity;
	private double price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}