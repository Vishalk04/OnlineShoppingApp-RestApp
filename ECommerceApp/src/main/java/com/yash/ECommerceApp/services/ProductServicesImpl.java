package com.yash.ECommerceApp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ECommerceApp.dao.IProductDao;
import com.yash.ECommerceApp.models.Product;

@Service
public class ProductServicesImpl implements IProductServices {

	@Autowired
	private IProductDao productDao;
	
	@Override
	public Boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}

	@Override
	public Product searchProductById(Integer productId) {
		// TODO Auto-generated method stub
		return productDao.findById(productId);
	}

	@Override
	public List<Product> searchProductsByCriteria(String criteria, String value) {
		// TODO Auto-generated method stub
		return null;
	}

}