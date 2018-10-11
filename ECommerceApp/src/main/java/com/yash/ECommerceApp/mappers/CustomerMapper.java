package com.yash.ECommerceApp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.ECommerceApp.models.Customer;

public class CustomerMapper implements RowMapper {

	
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getInt("customerId"));
		customer.setFirstName(rs.getString("firstName"));
		customer.setLastName(rs.getString("lastName"));
		customer.setCity(rs.getString("city"));
		return customer;
	}
}