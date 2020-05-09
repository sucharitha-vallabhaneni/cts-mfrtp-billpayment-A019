package com.bill.billpayment.bo;

import java.util.List;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

public interface Customerservice 
{

	public int createCustomer(Customer customer);
	public boolean login(Customerlogin customerlogin) ;
	
		public Customer getCustomer(String username);
		public List<Vendor> getallvendors();
		public List<electricity> geElectricities();
		public List<Dth> getDth();
}
