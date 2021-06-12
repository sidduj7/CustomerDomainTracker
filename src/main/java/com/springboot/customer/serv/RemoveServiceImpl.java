package com.springboot.customer.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.customer.model.Customer;
import com.springboot.customer.repo.CustomerRepository;

@Service
public class RemoveServiceImpl implements RemoveService{
	
	@Autowired
	CustomerRepository repo;

	@Override
	public void remove(Customer cust) {
		// TODO Auto-generated method stub
		
	}
	
	

}
