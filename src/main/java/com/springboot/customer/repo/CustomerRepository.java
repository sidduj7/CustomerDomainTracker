package com.springboot.customer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.customer.model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	 @Query("FROM Customer ORDER BY emailDate ASC")
	    List<Customer> findAllOrderByEmailDateAsc();

}
