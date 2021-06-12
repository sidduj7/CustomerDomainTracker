package com.springboot.customer.serv;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.customer.model.Customer;
import com.springboot.customer.repo.CustomerRepository;
@Component
public class DomainService implements SaveService {
	@Autowired
	CustomerRepository repo;

	@Override
	public List<Customer> save(Customer cust) {
		// TODO Auto-generated method stub
		
			 
		return null;
	}
	

}
