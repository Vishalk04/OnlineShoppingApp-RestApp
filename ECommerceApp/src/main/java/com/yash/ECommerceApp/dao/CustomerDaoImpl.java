package com.yash.ECommerceApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.ECommerceApp.models.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	 /*@Autowired
	 private SessionFactory sessionFactory;*/

	    @Autowired
	    JdbcTemplate jdbcTemplate;
	    
	 @Override
	 public Customer findById(int customerId) {
	        // TODO Auto-generated method stub
	       /* Session session = sessionFactory.getCurrentSession();
	        Customer customer=(Customer) session.get(Customer.class,customerId);
	        return customer;*/
		// return jdbcTemplate.queryForObject(FETCH_SQL_BY_ID, new Object[] { id }, new UserMapper());
		 
		 Customer customer = (Customer) jdbcTemplate.queryForObject("SELECT * FROM customer where customerId= ? ",
		            new Object[] { customerId }, new BeanPropertyRowMapper(Customer.class));
		 
		        return customer;
	        
		 
	    }
	 
	@Override
	public Boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		/* Session session = sessionFactory.getCurrentSession();
	       
		 session.save(customer);
		 
		return customer;*/
		
		jdbcTemplate.update("INSERT INTO customer (customerId, firstName, lastName, city) VALUES (?, ?, ?, ?)",
	            customer.getCustomerId(), customer.getFirstName(), customer.getLastName(), customer.getCity());
	    
		
		return true;
	
	} 

	@Override
	public Boolean editCustomer(Customer customer) {
		// TODO Auto-generated method stub
	/*	Session session = sessionFactory.getCurrentSession();
	    
		Customer result =  findById(customer.getCustomerId());
		result.setFirstName(customer.getFirstName());
		result.setLastName(customer.getLastName());
		result.setCity(customer.getCity());
		
		session.update(result);
		return result;*/
		
		jdbcTemplate.update("UPDATE customer SET firstName = ? , lastName = ? , city = ? WHERE customerId = ? ",
				customer.getFirstName(), customer.getLastName(), customer.getCity(), customer.getCustomerId());
		
		return true;
	
	}

	@Override
	public Boolean removeCustomer(Integer customerId) {
		
		/*Session session = sessionFactory.getCurrentSession(); 
		Customer customer = findById(customerId);
		session.delete(customer);
		return customer;*/

		jdbcTemplate.update("DELETE from customer WHERE customerId = ? ", customerId);
				
		return true;
		
	}

}
