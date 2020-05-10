package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.electricity;

public interface ebilldao extends CrudRepository<electricity, Integer>
{

	electricity findByBillnumber(String billnumber);
	public List<electricity> findAll();
   
}
