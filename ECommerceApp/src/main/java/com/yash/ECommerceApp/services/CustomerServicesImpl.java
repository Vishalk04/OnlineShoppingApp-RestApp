package com.yash.ECommerceApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yash.ECommerceApp.dao.ICustomerDao;
import com.yash.ECommerceApp.models.Customer;

@Service
public class CustomerServicesImpl implements ICustomerServices{

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public Boolean addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Boolean editCustomer(Customer customer) {
		return customerDao.editCustomer(customer);
	}

	@Override
	public Boolean removeCustomer(Integer customerId) {
		return customerDao.removeCustomer(customerId);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		return customerDao.findById(customerId);
	}

}