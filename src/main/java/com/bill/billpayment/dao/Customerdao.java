package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Customer;

public interface Customerdao extends CrudRepository<Customer, Integer>
{
	public List<Customer>  findAll();
	public Customer findByUsername(String username);
	
}
