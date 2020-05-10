package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Recordbills;

public interface Recordbillsdao extends CrudRepository<Recordbills, Integer>
{

	
	Recordbills findByBillnumber(String billnumber);

public List<Recordbills> findAll();
	

}
