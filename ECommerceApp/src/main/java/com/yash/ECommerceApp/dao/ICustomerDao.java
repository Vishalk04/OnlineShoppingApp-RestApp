package com.yash.ECommerceApp.dao;
import org.springframework.stereotype.Repository;

import com.yash.ECommerceApp.models.Customer;

@Repository
public interface ICustomerDao {
	
	public Boolean addCustomer(Customer customer);


	public Boolean editCustomer(Customer customer);

	public Boolean removeCustomer(Integer customerId);

	public Customer findById(int customerId);

}
