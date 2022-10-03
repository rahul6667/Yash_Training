package com.example.demo.dao;

import java.util.List;

import com.example.demo.controller.Product;

public interface ProductRepository {

	Product save(Product product);

	List<Product> getAllProducts();

	Product findById(int id);

	void delete(int id);

	Product update(Product product);

}
