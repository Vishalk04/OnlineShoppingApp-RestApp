package com.yash.ECommerceApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.ECommerceApp.mappers.OrderMapper;
import com.yash.ECommerceApp.models.Order;
import com.yash.ECommerceApp.models.Product;

@Repository
public class OrderDaoImpl implements IOrderDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Boolean placeOrder(Order order) {
		
		// TODO Auto-generated method stub
		//jdbcTemplate.update("insert into orders(orderId, amount, discount, CustomerId ) values ( ?, ?, ?, ?)", order.getOrderId(), order.getAmount(), order.getDiscount(), order.getCustomerId());
		jdbcTemplate.update("INSERT INTO orders (orderId, amount, discount, CustomerId, orderDate, deliveryDate, deliveryStatus) VALUES (?, ?, ?, ?, ?, ?, ?)",
				order.getOrderId(), order.getAmount(), order.getDiscount(), order.getCustomerId(), order.getOrderDate(), order.getDeliveryDate(), order.getDeliveryStatus());
		
		List<Product> products = order.getProducts();
		
		for (Product product : products) {
			jdbcTemplate.update("INSERT INTO order_products (orderid, productId) VALUES (?,?)",
					order.getOrderId(),product.getProductId());
		}
		
		return true;
		
	}

	@Override
	public List<Order> getAllOrders() {
	
		
		List<Order> orders =  jdbcTemplate.query("select * from orders",new OrderMapper());
		
		return orders;
		
	}

	@Override
	public Boolean deleteOrder(Integer orderId) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update("delete from orders where orderId =  ?", orderId);
		
		return true;
		
	}

}
