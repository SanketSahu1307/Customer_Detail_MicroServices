package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Customer;
import com.example.demo.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerServe;
	
	@RequestMapping("/hello")
	private String getfetch() {
		return "Hello Sanket";
	}
	
	@PostMapping(value = "/customer/save",headers = "Accept=application/json")
	private ResponseEntity<Customer> savingDetail(@RequestBody Customer customerModal) {
//		return customerServe.createService(customerModal);
		return new ResponseEntity<Customer>(customerServe.createService(customerModal),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/customer/detail",produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<Customer>> getDetail() {
//		return customerServe.getService();
		return new ResponseEntity<List<Customer>>(customerServe.getService(),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/customer/delete/{id}")
	private ResponseEntity<Void> deleteDetail(@PathVariable("id") Long id) {
		customerServe.deleteCustomer(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping(value = "/customer/update",consumes = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Customer> getUpdateById(@RequestBody Customer customerModal) {
			return new ResponseEntity<Customer>(customerServe.getUpdateById(customerModal),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/customer/detail/{id}",produces =MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Optional<Customer>> getDetailById(@PathVariable("id") Long id) {
		return new ResponseEntity<Optional<Customer>>( customerServe.getById(id),HttpStatus.OK);
	}


}
