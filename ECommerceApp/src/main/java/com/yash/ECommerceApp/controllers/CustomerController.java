package com.yash.ECommerceApp.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yash.ECommerceApp.models.Customer;
import com.yash.ECommerceApp.services.ICustomerServices;


@RestController
public class CustomerController {
	
	@Autowired
	ICustomerServices customerServices;

	@GetMapping("/customers/{customerId}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer customerId){
		
		return ResponseEntity.ok(customerServices.getCustomer(customerId));
		
	}
	
	@PostMapping(value = "/customers")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		
		System.out.println("addCustomer: "+customer);
		Boolean newCustomer = customerServices.addCustomer(customer);
		
	/*	URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(customer.getCustomerId()).toUri();*/

		return  ResponseEntity.status(HttpStatus.OK).build();
			
	}
	 
	@PutMapping("/customers")
	public ResponseEntity<?> editCustomer(@RequestBody Customer customer){
		
		Boolean newCustomer = customerServices.editCustomer(customer);
		
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	@DeleteMapping("/cusotmers/{customerId}") 
	public ResponseEntity<?> removeCustomer(@PathVariable("customerId") Integer customerId){
		Boolean newCustomer = customerServices.removeCustomer(customerId);
		return    ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	   
}