package com.bill.billpayment.dao;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Customer;

public interface Customerdao extends CrudRepository<Customer,Integer>
{

	public Customer findByUsername(String username);
	
}
