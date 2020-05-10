package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Vendor;



public interface Vendordao extends JpaRepository<Vendor, Integer> 
{
	public Vendor findByUsername(String username);
 public List<Vendor> findAll();
//public int update();

} 
