package com.yash.ECommerceApp.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.ECommerceApp.ECommerceAppApplication;
import com.yash.ECommerceApp.models.Order;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ECommerceAppApplication.class)
public class OrderDaoImplTest {

	
	@Autowired
	private IOrderDao orderDao;
	
	@Test
	public void testGetAllOrders(){
		
		List<Order> orders = orderDao.getAllOrders();
		
		for (Order order : orders) {
		System.out.println(order);	
		}
		
	}
	
	
	@Test
	public void testDeleteOrder(){
		
		assertTrue(orderDao.deleteOrder(1));
		
	}
}
