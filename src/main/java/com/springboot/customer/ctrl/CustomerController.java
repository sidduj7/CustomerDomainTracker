package com.springboot.customer.ctrl;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.customer.model.Customer;
import com.springboot.customer.repo.CustomerRepository;
import com.springboot.customer.serv.RemoveServiceImpl;
import com.springboot.customer.serv.SaveFactory;
import com.springboot.customer.serv.SaveService;

@RestController
public class CustomerController {
	private final Logger log = LoggerFactory.getLogger(this.getClass()); 

	 
	@Autowired
	SaveFactory factory;

	@Autowired
	CustomerRepository repo;

	
	@PostMapping(value= "/customer/save")
	public List<Customer> save(final @RequestBody @Valid Customer cust) {
		log.info("Saving customer details in the database.");
		
		SaveService service=factory.getProduct(cust.getProductName());
		return service.save(cust);
	}
	
	@PostMapping(value= "/customer/reomve")
	public void remove(final @RequestBody  Customer cust) {
		log.info("removing customer details in the database.");
		
 	}
	@GetMapping(value= "/customer/findByEmailSchedule")
	public List<Customer> findByMailSchedule() {
		log.info("find customer details in the database.");
		
		return null;
		
		
 	}

}
