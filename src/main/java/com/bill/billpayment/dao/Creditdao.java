package com.bill.billpayment.dao;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Credit;

public interface Creditdao extends CrudRepository<Credit, String>
{

}
