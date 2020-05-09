package com.bill.billpayment.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Security1;


public interface Customerdao extends CrudRepository<Customer,Integer>
{

	public Customer findByUsername(String username);

	@Query("select s from Security1 s where s.mobile=:cnumber ") public
	 Security1 getSecurity1Credentials(@Param("cnumber")String contactNumber);
	 
	 @Query("select s from Security1 s where s.userId=:uid ") 
	 public Security1 getSecurity1password(@Param("uid")String userId);
	 
		 @Query("select s from Customer s where  s.username=:username ") 
			  public  Customer getCustomer(@Param("username")String username);

		
	
}
