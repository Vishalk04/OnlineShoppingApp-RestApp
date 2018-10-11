package com.yash.ECommerceApp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.ECommerceApp.models.Customer;
import com.yash.ECommerceApp.models.Product;

public class ProductMapper implements RowMapper{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductId(rs.getInt("productId"));
		product.setTitle(rs.getString("title"));
		product.setPrice(rs.getDouble("price"));
		return product;
		
	}
	
	

}
