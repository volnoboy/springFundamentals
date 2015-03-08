package com.volnoboy.service;

import com.volnoboy.model.Customer;
import com.volnoboy.repository.CustomerRepository;
import com.volnoboy.repository.HibernateCustomerRepositoryImpl;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Reuven on 3/8/15.
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
