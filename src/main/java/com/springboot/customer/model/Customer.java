package com.springboot.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message = "customerId is mandatory")
	private String customerId;
	@NotBlank(message = "productName is mandatory")
	private String productName;
	@NotBlank(message = "domain is mandatory")
	private String domain;
	@NotBlank(message = "duration is mandatory")
	private String duration;
	@NotBlank(message = "startDate is mandatory")
	private String startDate;
	private String emailDate; 
	public String getEmailDate() {
		return emailDate;
	}
	public void setEmailDate(String emailDate) {
		this.emailDate = emailDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
/*Customer(Customer c){
	customerId=c.customerId;
	domain=c.domain;
	duration=c.duration;
	productName=c.productName;
	startDate=c.startDate;
	
}*/
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Customer c) {
		customerId=c.customerId;
		domain=c.domain;
		duration=c.duration;
		productName=c.productName;
		startDate=c.startDate;
	}

}
