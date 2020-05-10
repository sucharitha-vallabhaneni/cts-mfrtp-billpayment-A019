package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Dth;


public interface Dthbilldao extends CrudRepository<Dth, Integer>
{

	Dth findByservicenumber(String servicenumber);
	public List<Dth> findAll();
}


