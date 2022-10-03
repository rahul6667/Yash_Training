package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;

//@RestController
//@RequestMapping("/api/v1/products")
public class ProductController {

 
//    @Autowired
//    private ProductService service;
//	

	ProductServiceImpl service= new  ProductServiceImpl();
	
//	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
//	public Product addproduct(@RequestBody Product product) {
//
//		System.out.println("Controller class");
//		 return service.saveProduct(product);
//		//return product;
//
//	}
 
	public Product addproduct(Product product) {

		System.out.println("Controller class");
		 return service.saveProduct(product);
		//return product;

	}
    

//	@GetMapping(value = "/getAllProduct")
//	public List<Product>  getAllProduct() {
//		return service.getProducts();
//	}
	
	public List<Product>  getAllProduct() {
		return service.getProducts();
	}
	
	

//	 @GetMapping(value="/getbyid/{id}")
//	 public Product findProductById(@PathVariable int id) {
//	        return service.getProductById(id);
//	    }
	
	 public Product findProductById(int id) {
	        return service.getProductById(id);
	    }

	 
//	    @PutMapping
//	    public Product updateProduct(@RequestBody Product product) {
//	        return service.updateProduct(product);
//	    }

	    
	    public Product updateProduct(Product product) {
	        return service.updateProduct(product);
	    }

//	    @DeleteMapping("{id}")
//	    public String deleteProduct(@PathVariable int id) {
//	        return service.deleteProduct(id);
//	    }
//	
	  
	    public String deleteProduct(int id) {
	        return service.deleteProduct(id);
	    }
	

}
