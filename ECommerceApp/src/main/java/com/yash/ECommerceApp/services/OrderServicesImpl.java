package com.yash.ECommerceApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.ECommerceApp.dao.ICustomerDao;
import com.yash.ECommerceApp.dao.IOrderDao;
import com.yash.ECommerceApp.dao.IProductDao;
import com.yash.ECommerceApp.models.Customer;
import com.yash.ECommerceApp.models.Order;
import com.yash.ECommerceApp.models.Product;
import com.yash.ECommerceApp.models.bo.OrderBo;

@Service
public class OrderServicesImpl implements IOrderServices {

	@Autowired
	private IOrderDao orderDao;
	
	@Autowired
	private ICustomerDao customerDao;
	
	@Autowired
	private IProductDao productDao;
	
	
	
	@Override
	@Transactional
	public Order placeOrder(OrderBo order) {
		// TODO Auto-generated method stub
		Order newOrder = new Order();
		
		
		newOrder.setCustomerId(order.getCustomerId());
		newOrder.setOrderId(order.getOrderId());
		newOrder.setAmount(order.getAmount());
		newOrder.setDiscount(order.getDiscount());
		newOrder.setOrderDate(order.getOrderDate());
		newOrder.setDeliveryDate(order.getDeliveryDate());
		newOrder.setDeliveryStatus(order.getDeliveryStatus());
		
		List<Product> products = new ArrayList<Product>();
		List<Integer> productdIds = order.getProductIds();
		
		Double amount = 0.0;
		
		for (Integer productId : productdIds) {
			
			Product product = productDao.findById(productId);
			amount += product.getPrice();
			products.add(product);
		}
		
		newOrder.setProducts(products);
		
		System.out.println(amount);;
		
		newOrder.setAmount(amount); 
		
		Customer customer = customerDao.findById(order.getCustomerId());
		
		System.out.println("customer: "+customer);
		
		if(customer!=null){
			orderDao.placeOrder(newOrder);
		}else{
			throw new RuntimeException("oops! The customer does not exit."
					+ "Please add customer");
		}
		return newOrder;
	}



	@Override
	@Transactional
	public List<Order> getAllOrders() {
		
		
		return orderDao.getAllOrders();
		
	}



	@Override
	public Boolean deleteOrder(Integer orderId) {
		// TODO Auto-generated method stub
		return orderDao.deleteOrder(orderId);
	}

}
