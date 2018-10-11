package com.yash.ECommerceApp.services;

import java.util.List;

import com.yash.ECommerceApp.models.Order;
import com.yash.ECommerceApp.models.bo.OrderBo;

public interface IOrderServices {
	
	public Order placeOrder(OrderBo order);

	public List<Order> getAllOrders();

	public Boolean deleteOrder(Integer orderId);

}
