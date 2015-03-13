package com.volnoboy.repository;

import java.util.ArrayList;
import java.util.List;

import com.volnoboy.model.Customer;
import org.springframework.stereotype.Repository;

/**
 * Created by Reuven on 3/8/15.
 */
@Repository
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
