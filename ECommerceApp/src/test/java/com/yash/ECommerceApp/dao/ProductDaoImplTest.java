package com.yash.ECommerceApp.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.ECommerceApp.ECommerceAppApplication;
import com.yash.ECommerceApp.models.Customer;
import com.yash.ECommerceApp.models.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ECommerceAppApplication.class)
public class ProductDaoImplTest {

	@Autowired 
	private IProductDao productDao;
	
	@Test
	public void testFindById() {
		Product product = productDao.findById(4);
		System.out.println("test user: "+product.getTitle()+ " "+product.getProductId());
		assertNotNull(product); 
	}
	
	@Test
	public void testCreateCustomer(){
		
		Product product = new Product(4,"asc",10.10);
		System.out.println();
		productDao.addProduct(product);
		
		Product newProduct = productDao.findById(product.getProductId());
		
		assertEquals(product.getPrice(), newProduct.getPrice());
		
		System.out.println("customer: "+product);
		
		
	}

}
