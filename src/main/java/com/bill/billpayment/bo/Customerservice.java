package com.bill.billpayment.bo;

import java.util.List;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Feedbackquestions;
import com.bill.billpayment.domain.Help;
import com.bill.billpayment.domain.Vendor;

public interface Customerservice 
{

	public int createCustomer(Customer customer);
	public boolean login(Customerlogin customerlogin) ;
	
		public Customer getCustomer(String username);
		public List<Vendor> getallvendors();
		int CreateFeedback(Feedbackquestions fq);
		int help(Help h);
	
}
