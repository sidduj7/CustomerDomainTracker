package com.springboot.customer.serv;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.customer.model.Customer;
import com.springboot.customer.repo.CustomerRepository;
import com.springboot.customer.util.Datevalidator;
@Service
public class HostingService implements SaveService {
	@Autowired
	CustomerRepository repo;
	@Override
	@Transactional
	public List<Customer> save(Customer cust) {
		// TODO Auto-generated method stub
		
 
		return null;
	}

}
