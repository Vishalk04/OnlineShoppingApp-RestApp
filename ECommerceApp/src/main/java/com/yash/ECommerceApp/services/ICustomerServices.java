package com.yash.ECommerceApp.services;

import org.springframework.stereotype.Service;

import com.yash.ECommerceApp.models.Customer;

@Service
public interface ICustomerServices {
	
	public Customer getCustomer(Integer customerId);
	
	public Boolean addCustomer(Customer customer);
	 
	public Boolean editCustomer(Customer customer);

	public Boolean removeCustomer(Integer customerId);

	
}
