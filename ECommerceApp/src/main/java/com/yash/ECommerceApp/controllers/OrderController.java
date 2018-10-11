package com.yash.ECommerceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ECommerceApp.models.Order;
import com.yash.ECommerceApp.models.bo.OrderBo;
import com.yash.ECommerceApp.services.IOrderServices;

@RestController
public class OrderController {

	@Autowired
	private IOrderServices orderServices;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrders(){
		
		System.out.println("---------------got a request=-----------------------------------------");
		
		List<Order> orders = orderServices.getAllOrders();
		
		return ResponseEntity.ok(orders);
	
	}
	
	@PostMapping("/orders")
	public ResponseEntity<Order> placeOrder(@RequestBody OrderBo order){
		
		System.out.println(order);
		
		Order newOrder = orderServices.placeOrder(order);
		
		return ResponseEntity.ok(newOrder);
		
	}
	
	
	@DeleteMapping("/orders/{orderId}")
	public ResponseEntity<?> deleteOrder(@PathVariable("orderId") Integer orderId){
		
		orderServices.deleteOrder(orderId);
		return (ResponseEntity<?>) ResponseEntity.ok();
		
	}
	
}
