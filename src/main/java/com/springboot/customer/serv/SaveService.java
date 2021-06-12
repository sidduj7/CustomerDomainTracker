package com.springboot.customer.serv;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.customer.model.Customer;
@Service
public interface SaveService {
	
	public List<Customer> save(Customer cust);

}
