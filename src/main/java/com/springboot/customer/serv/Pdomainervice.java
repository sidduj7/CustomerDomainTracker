package com.springboot.customer.serv;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.customer.model.Customer;
import com.springboot.customer.repo.CustomerRepository;
import com.springboot.customer.util.Datevalidator;
@Service
public class Pdomainervice implements   SaveService  {
	@Autowired
	CustomerRepository repo;
	@Override
	public List<Customer> save(Customer cust) {
		// TODO Auto-generated method stub
		if( Datevalidator.isValidDate("yyyy-MM-dd", cust.getStartDate(), Locale.ENGLISH)==false ){
			return null;
		}
		Customer cust1=new Customer(cust);
		Customer cust2=new Customer(cust);
 		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		LocalDate date1 = LocalDate.parse(cust.getStartDate());
		LocalDate date2 = date1.plusMonths(12).minusDays(9);
 		LocalDate date3 = date1.plusMonths(12).minusDays(2);
		cust1.setEmailDate(date2.toString());
  		cust2.setEmailDate(date3.toString());
  		List<Customer> list=Arrays.asList(cust1,cust2);
		repo.saveAll(list);
		final List<Customer> customers = new ArrayList<>();
		repo.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

}
