package com.yash.ECommerceApp.dao;

import java.util.List;

import com.yash.ECommerceApp.models.Product;

public interface IProductDao {

	public Boolean addProduct(Product product);

	public Product findById(Integer productId);
	
	public List<Product> findByCriteria(String criteria, String value);
	
	
}