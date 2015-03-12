package com.volnoboy.service;

import java.util.List;

import com.volnoboy.model.Customer;
import com.volnoboy.repository.CustomerRepository;

/**
 * Created by Reuven on 3/8/15.
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl() {

	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
