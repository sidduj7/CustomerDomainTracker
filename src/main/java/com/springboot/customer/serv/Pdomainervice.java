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
		 
		return null;
	}

}
