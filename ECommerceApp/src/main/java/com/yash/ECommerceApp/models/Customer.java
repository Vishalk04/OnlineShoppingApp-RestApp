package com.yash.ECommerceApp.models;

import java.io.Serializable;

public class Customer implements Serializable{

	private Integer customerId;
	private String firstName;
	private String lastName;
	private String city;
	
	public Customer(){
	}
	
	public Customer(int customerId, String firstName, String lastName, String city) {
	
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		
	}
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User : "+"      customer id: "+customerId+" first name: "+firstName+" last Name: "+lastName+" city: "+city;
	}
}
