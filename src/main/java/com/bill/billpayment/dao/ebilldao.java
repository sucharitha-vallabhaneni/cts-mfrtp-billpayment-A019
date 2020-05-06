package com.bill.billpayment.dao;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.electricity;

public interface ebilldao extends CrudRepository<electricity, Integer>
{

	electricity findByBillnumber(String billnumber);
}
