package com.bill.billpayment.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Help;

public interface HelpDao extends CrudRepository<Help,String>{
	public Help findByuserId(String userId);
public List<Help> findAll();
}


