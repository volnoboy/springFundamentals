package com.volnoboy.repository;

import com.volnoboy.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reuven on 3/8/15.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Valera");
		customer.setLastName("Pechkin");
		customers.add(customer);
		return customers;
	}
}