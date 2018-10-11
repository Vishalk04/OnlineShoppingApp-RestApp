package com.yash.ECommerceApp.models.bo;

public class ProductBo {

	private Integer productId;
	private String title;
	private Double price;
	
	public ProductBo(){}
	
	public ProductBo(Integer productId, String title, Double price) {
		// TODO Auto-generated constructor stub
		this.productId = productId;
		this.title = title;
		this.price = price;
		
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId; 
	}
	public String getTitle() {
		
		return title;
		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
