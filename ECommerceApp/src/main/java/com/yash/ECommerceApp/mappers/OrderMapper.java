package com.yash.ECommerceApp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.ECommerceApp.models.Order;

public class OrderMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Order order = new Order();
			order.setOrderId(rs.getInt("orderId"));
			order.setCustomerId(rs.getInt("customerId"));
			order.setAmount(rs.getDouble("amount"));
			order.setDiscount(rs.getDouble("discount"));
			order.setDeliveryDate(rs.getDate("deliveryDate"));
			order.setOrderDate(rs.getDate("orderDate"));
			order.setDeliveryStatus(rs.getString("deliveryStatus"));
			return order;
			
	}

}
