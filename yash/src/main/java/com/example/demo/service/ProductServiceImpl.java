package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Product;
import com.example.demo.dao.ProductRepository;
import com.example.demo.dao.ProductRepositoryImpl;

//@Service
public class ProductServiceImpl implements ProductService{
//	 @Autowired
//	    private ProductRepository repository;

	ProductRepositoryImpl repository=new ProductRepositoryImpl();
	
	
	    public Product saveProduct(Product product) {
	        return repository.save(product);
	    }

	    public List<Product> getProducts() {
	        return repository.getAllProducts();
	    }

	    public Product getProductById(int id) {
	        return repository.findById(id);
	    }

	    public String deleteProduct(int id) {
	        repository.delete(id);
	        return "product removed !! " + id;
	    }

	    public Product updateProduct(Product product) {
	       return repository.update(product);
	    }

}
