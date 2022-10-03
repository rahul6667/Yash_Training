package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.Product;

//@Repository
//@Transactional
public class ProductRepositoryImpl implements ProductRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	  private List<Product> list = new ArrayList<Product>();
	List<Product> addlist= new ArrayList<Product>();
	List<Product> getlist= new ArrayList<Product>();
	List<Product> getlistbyid= new ArrayList<Product>();

	
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
//		Product  p = new Product();
//		p.setId(product.getId());
//		p.setName(product.getName());
//		p.setPrice(product.getPrice());
//		p.setQuantity(product.getQuantity());
//		 addlist.add(p);
//		
//		 try {
//		 
// jdbcTemplate.update("INSERT INTO tbl_product (name, quantity, price) VALUES (?, ?, ?)", new Object[] {product.getName(), product.getQuantity(), product.getQuantity()});
//		 }
//		 catch (Exception e) {
//			e.printStackTrace();
//		}
//		 
//		 
//		 return p;
		
		  Product produc = new Product();
		  produc.setId(product.getId());
		  produc.setName(product.getName());
		  produc.setQuantity(product.getQuantity());
		  produc.setPrice(product.getPrice());
	        list.add(produc);
	        return produc;
		
		
	}

	@Override
	public List<Product> getAllProducts() {
	
//		try {
//			getlist= jdbcTemplate.query("SELECT * FROM tbl_product", new BeanPropertyRowMapper<Product>(Product.class));
//		}
//		catch(Exception e)
//		{
//			
//		e.printStackTrace();
//		}
//		return getlist;	
		return list;
	}

	@Override
	public Product findById(int id) {
//		Product getlistbyid1=new Product();
//		try {
//
//			//getlistbyid= (List<Product>) jdbcTemplate.queryForObject("SELECT * FROM tbl_product WHERE id=?", new BeanPropertyRowMapper<Product>(Product.class), id);
//			getlistbyid1= jdbcTemplate.queryForObject("SELECT * FROM tbl_product WHERE id=?", new BeanPropertyRowMapper<Product>(Product.class), id);
//		}
//		catch(Exception e) {
//			
//		}
//		return getlistbyid1;
		
		
		  for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).getId() == (id)) {
	                return list.get(i);
	            }
	        }
	        return null;
		
		
	}

	@Override
	public void delete(int id) {
		list.removeIf(x -> x.getId() == (id));
       // return null;
		
	}

	@Override
	public Product update(Product product) {
		 int idx = 0;
	        int id = 0;
	        Product product1 = new Product();
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).getId() == (product.getId())) {
	                id = product.getId();
	                idx = i;
	                break;
	            }
	        

	       
	        product1.setId(id);
	        product1.setName(product.getName());
	        product1.setQuantity(product.getQuantity());
	        product1.setPrice(product.getPrice());
	        list.set(idx, product);
	       
	}
	        return product1;

	}

}