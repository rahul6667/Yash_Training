package com.example.demo.service;

import java.util.List;

import com.example.demo.controller.Product;

public interface ProductService {

	Product getProductById(int id);

	Product updateProduct(Product product);

	String deleteProduct(int id);

	Product saveProduct(Product product);

	List<Product> getProducts();

}
