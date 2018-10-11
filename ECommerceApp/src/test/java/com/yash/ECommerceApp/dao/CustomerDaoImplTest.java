package com.yash.ECommerceApp.dao;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.ECommerceApp.ECommerceAppApplication;
import com.yash.ECommerceApp.models.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ECommerceAppApplication.class)
public class CustomerDaoImplTest {

	@Autowired
	ICustomerDao customerDao;
	


	@Test
	public void testFindById() {
		
		Customer customer = customerDao.findById(1);
		System.out.println("test user: "+customer.getFirstName()+ " "+customer.getCity());
		assertNotNull(customer);
		
	}
	
	@Test
	public void testCreateCustomer(){
		
		Customer customer = new Customer(2,"asc","asd","pune");
		customerDao.addCustomer(customer);
		Customer newCustomer = customerDao.findById(customer.getCustomerId());
		
		assertEquals(customer.getFirstName(), newCustomer.getFirstName());
		System.out.println("customer: "+customer);
		System.out.println("newCustomer: "+newCustomer);
		
	}
	
	@Test
	public void testRemoveCustomer(){
		
		customerDao.removeCustomer(2);
		
	}
	
	
	
	
}
