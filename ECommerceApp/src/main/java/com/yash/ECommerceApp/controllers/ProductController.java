package com.yash.ECommerceApp.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ECommerceApp.models.Product;
import com.yash.ECommerceApp.services.IProductServices;

@RestController
public class ProductController {

	@Autowired
	private IProductServices productServices;
	
	@PostMapping("/products")
	public ResponseEntity<?> addProduct(@RequestBody Product product){
		
		productServices.addProduct(product);
		return ResponseEntity.ok().build();
		
	}
	
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> searchProductById(@PathVariable Integer productId){
		Product product = productServices.searchProductById(productId);
		return ResponseEntity.ok(product);
		
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> searchProductsByCriteria(@RequestParam("criteria") String criteria, @RequestParam("value") String value ){
	{
		
		return null;
	}
		
	}
}