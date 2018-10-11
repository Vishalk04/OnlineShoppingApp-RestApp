package com.yash.ECommerceApp.services;

import java.util.List;

import com.yash.ECommerceApp.models.Product;

public interface IProductServices {
	
	public Boolean addProduct(Product product);

	public Product searchProductById(Integer productId);
	
	public List<Product> searchProductsByCriteria(String criteria, String value);
	
}