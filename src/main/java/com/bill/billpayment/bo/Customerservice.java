package com.bill.billpayment.bo;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;

public interface Customerservice 
{

	public int createCustomer(Customer customer);
	public boolean login(Customerlogin customerlogin) ;
	
		public Customer getCustomer(String username);
}
