package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Vendor;



public interface Vendordao extends CrudRepository<Vendor, Integer> 
{
	public Vendor findByUsername(String username);
 public List<Vendor> findAll();
 @Query("select s from Security s where s.mobile=:cnumber ") public
 Security getSecurityCredentials(@Param("cnumber")String contactNumber);
 
 @Query("select s from Security s where s.userId=:uid ") 
 public Security getSecuritypassword(@Param("uid")String userId);
 
	 @Query("select s from Vendor s where  s.username=:username ") 
		  public  Vendor getVendor(@Param("username")String userId);
	 
} 
