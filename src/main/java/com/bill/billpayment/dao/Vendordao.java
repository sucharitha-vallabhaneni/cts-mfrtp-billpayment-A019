package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Vendor;



public interface Vendordao extends CrudRepository<Vendor, Integer> 
{
	public Vendor findByUsername(String username);
 public List<Vendor> findAll();
} 
