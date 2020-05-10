package com.bill.billpayment.dao;
import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Feedbackquestions;

public interface feedbackdao extends CrudRepository<Feedbackquestions,Integer>

{
	public List<Feedbackquestions>  findAll();
	public Feedbackquestions findByusername(String userName);


}



