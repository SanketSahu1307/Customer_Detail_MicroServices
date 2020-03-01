package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.handlingException.UserNotFoundException;
import com.example.demo.modal.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService{
	
	@Autowired
	CustomerRepository customer_dao;

	public Customer createService(Customer customerModal) {
		return customer_dao.save(customerModal);
	}

	public List<Customer> getService() {
		return customer_dao.findAll();
	}

	public void deleteCustomer(Long id) {
//		customer_dao.deleteById(id);
		Optional<Customer>usr=customer_dao.findById(id);
		if (usr.get()==null) {
			throw new UserNotFoundException("not find with Id"+id);
		}
		else {
			customer_dao.deleteById(id);
		}
	}

	public Customer getUpdateById(Customer customerModal) {
		return customer_dao.save(customerModal);
	}

	public Optional<Customer> getById(Long id) {
//		return customer_dao.findById(id);
		Optional<Customer> usr=customer_dao.findById(id);
		if (!usr.isPresent()) {
			throw new UserNotFoundException("User Not Found with Id "+id);
		}
		else {
			return usr;
		}
	}
	
	

}
