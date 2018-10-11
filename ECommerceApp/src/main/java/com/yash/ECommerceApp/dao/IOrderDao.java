package com.yash.ECommerceApp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yash.ECommerceApp.models.Order;

@Repository
public interface IOrderDao {
	
	public Boolean placeOrder(Order order);

	public List<Order> getAllOrders();

	public Boolean deleteOrder(Integer orderId); 

}
