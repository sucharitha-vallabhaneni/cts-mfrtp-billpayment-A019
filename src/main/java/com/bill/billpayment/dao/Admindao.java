package com.bill.billpayment.dao;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Admin;



public interface Admindao extends CrudRepository<Admin ,String>{

	public Admin findByAdminId(String adminId);
	 
}
