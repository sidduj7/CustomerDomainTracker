package com.springboot.customer.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveFactory {
@Autowired
DomainService domainService;
@Autowired
HostingService hostingService;
@Autowired
Pdomainervice pdomainervice;
		
		   //use getShape method to get object of type shape 
		   public SaveService getProduct(String product){
		      if(product == null){
		         return null;
		      }		
		      if(product.equalsIgnoreCase("hosting")){
		         return hostingService;
		         
		      } else if(product.equalsIgnoreCase("domain")){
		         return domainService;
		         
		      } else if(product.equalsIgnoreCase("pdomain")){
		         return pdomainervice;
		      }
		      
		      return null;
		   }
		}
