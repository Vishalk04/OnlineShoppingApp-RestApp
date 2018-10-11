package com.yash.ECommerceApp.models.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderBo implements Serializable {
	private Integer orderId;
	private Integer customerId;
	private Double amount;
	private Double discount;
	private Date orderDate;

	private Date deliveryDate;
	private  String deliveryStatus;
	private List<Integer> productIds;
	
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

		
	public List<Integer> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<Integer> productIds) {
		this.productIds = productIds;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order :     orderId:  "+orderId+" customerId: "+customerId+" amount: "+amount+" discount: "+discount+" productIds:"+productIds.toString();
	}
}
