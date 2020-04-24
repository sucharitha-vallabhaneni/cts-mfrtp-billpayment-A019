package com.bill.billpayment.dao;

import java.util.List;

import com.bill.billpayment.domain.Vendor;
import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Vendor;

public interface Vendordao extends CrudRepository<Vendor, Integer>
{
	public List<Vendor>  findAll();
	public Vendor findByUsername(String username);
	

}
