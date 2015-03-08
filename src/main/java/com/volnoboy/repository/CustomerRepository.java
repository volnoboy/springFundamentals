package com.volnoboy.repository;

import com.volnoboy.model.Customer;

import java.util.List;

/**
 * Created by Reuven on 3/8/15.
 */
public interface CustomerRepository {
	List<Customer> findAll();
}
