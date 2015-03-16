package com.volnoboy.repository;

import java.util.ArrayList;
import java.util.List;

import com.volnoboy.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * Created by Reuven on 3/8/15.
 */
@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${name}")
	private String name;

	@Value("${lastName")
	private String lastName;

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName(name);
		customer.setLastName(lastName);
		customers.add(customer);
		return customers;
	}
}
