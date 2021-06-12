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
		
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			LocalDate date1 = LocalDate.parse(cust.getStartDate());
			LocalDate date2 = date1.plusMonths(12).minusDays(2);
			Customer cust1=new Customer(cust);
			cust1.setEmailDate(date2.toString());				
		repo.save(cust1);
     	final List<Customer> customers = new ArrayList<>();
		repo.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}
	

}
