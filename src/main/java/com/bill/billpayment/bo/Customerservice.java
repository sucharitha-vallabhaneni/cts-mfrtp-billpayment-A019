package com.bill.billpayment.bo;

import java.util.List;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Security1;

import com.bill.billpayment.domain.Feedbackquestions;
import com.bill.billpayment.domain.Help;
import com.bill.billpayment.domain.Dth;

import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

public interface Customerservice 
{

	public int createCustomer(Customer customer);
	public boolean login(Customerlogin customerlogin) ;
	
		public Customer getCustomer(String username);
		public List<Vendor> getallvendors();

		 public Security1 getSecurity1(String mobile);
		  public Security1 getSecurity1pwd(String userId); 
		  public boolean updatePassword(Customer customer);
		  public Customer getuserdata(String userId);
		int CreateFeedback(Feedbackquestions fq);
		int help(Help h);
	

		public List<electricity> geElectricities();
		public List<Dth> getDth();

}
