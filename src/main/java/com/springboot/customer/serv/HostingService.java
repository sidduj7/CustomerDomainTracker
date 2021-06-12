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
		

		if( Datevalidator.isValidDate("yyyy-MM-dd", cust.getStartDate(), Locale.ENGLISH)==false ){
			return null;
		}
		Customer cust1=new Customer(cust);
		Customer cust2=new Customer(cust);
		//cust1.setEmailDate("2020-01-01");
		//cust2.setEmailDate("2021-01-01");

		//cust1.setCustomerId("1234");cust1.setDomain("xxx.com");cust1.setDuration("12");cust1.setProductName("hosting");cust1.setStartDate("2020-01-01");cust1.setEmailDate("2021-01-01");	
		//cust2.setCustomerId("1234");cust2.setDomain("xxx.com");cust2.setDuration("12");cust2.setProductName("hosting");cust2.setStartDate("2020-01-01");cust2.setEmailDate("2021-09-01");	

		LocalDate date1 = LocalDate.parse(cust.getStartDate());
		LocalDate date2 = date1.plusMonths(12).minusDays(3);
		LocalDate date3 = date1.plusDays(1);
		cust1.setEmailDate(date2.toString());
 		cust2.setEmailDate(date3.toString());
		List<Customer> list=Arrays.asList(cust1,cust2);
		repo.saveAll(list);
		final List<Customer> customers = new ArrayList<>();
		repo.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

}
